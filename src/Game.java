import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JButton;

public class Game implements ActionListener{

	static Game game;
	
	private Frame frame;
	private Pixels pixels;
	
	private int count;
	
	public Game(){
		
		Game.game = this;
		
		frame = new Frame();
		frame.setVisible(true);

		//count = 20;
		
	}
	
	public void checkWin(){
		
		if(pixels.getCount() <= 0 || pixels.isWinning())
			frame.gameOver();
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		
		String name = (((JButton)e.getSource()).getName());
		
		if(name == "easy" || name == "medium" || name == "hard")
			setLevel(name);
		
		if(name == "tryagain"){
			pixels.setCount(count);
			pixels.initColors();
			frame.newGame();
		}
		
		if(name == "menu"){
			frame.menu();
			count = 20;
		}
		
		if(name == "exit")
			frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
		
		Color oldcolor = pixels.getColors()[0][0];
		
		Color newcolor;
		
		switch(name){
		case "blue":
			newcolor = Mycolors.blue.getColor();
			break;
		case "green":
			newcolor = Mycolors.green.getColor();
			break;
		case "red":
			newcolor = Mycolors.red.getColor();
			break;
		case "orange":
			newcolor = Mycolors.orange.getColor();
			break;
		case "purple":
			newcolor = Mycolors.purple.getColor();
			break;
		case "yellow":
			newcolor = Mycolors.yellow.getColor();
			break;
		default:
			newcolor = oldcolor;
			break;
		}
		
		if(oldcolor == newcolor)
			return;
		
		pixels.checkAdj(newcolor, oldcolor, 0, 0);
		pixels.setColor(newcolor);
		frame.validate();
		frame.repaint();
		
		
		
		//TODO
		//pourquoi ?
		pixels.setCount(pixels.getCount()-1);;
		
		checkWin();
	}
	
	public void setLevel(String difficulty){
		
		if(difficulty == "easy"){
			pixels = new Pixels(10,6,70,16);
			count = 16;
		}
		else if(difficulty == "medium"){
			pixels = new Pixels(14,9,50,21);
			count = 21;
		}
		else if(difficulty == "hard"){
			pixels = new Pixels(25,16,30,50);
			count = 50;
		}
		
		frame.newGame();
		
	}
	
	static public Game getGame(){
		return Game.game;
	}
	
	public Pixels getPixels(){
		return pixels;
	}
	
	public int getCount(){
		return count;
	}
	
}
