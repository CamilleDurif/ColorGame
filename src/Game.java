import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.AbstractButton;

public class Game implements ActionListener{

	static Game game;
	
	private Frame frame;
	private Pixels pixels;
	
	private int count;
	private String difficulty;
	private int nbofplayers;
	
	private String name;
	
	public Game(){
		
		Game.game = this;
		
		frame = new Frame();
		frame.setVisible(true);

		difficulty = "easy";
		//count = 20;
		
	}
	
	public void checkWin(){
		
		if((pixels.getCount() <= 0 && nbofplayers == 1) || pixels.isWinning())
			frame.gameOver();
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		
		String bname = (((AbstractButton)e.getSource()).getName());
		name = bname;
		
		if(bname == "blue" || bname == "green" || bname == "red" || bname == "orange" || bname == "purple" || bname == "yellow")
			commandbutton();
		
		else
			menubutton();
	}
	
	public void menubutton(){
		
		if(name == "easy" || name == "medium" || name == "hard")
			difficulty = name;
		
		if(name == "oneplayer"){
			nbofplayers = 1;
			setLevel(difficulty);
		}
		
		if(name == "twoplayers"){
			nbofplayers = 2;
			setLevel(difficulty);
			pixels.setCount(1);
		}
		
		if(name == "threeplayers"){
			nbofplayers = 3;
			setLevel(difficulty);
			pixels.setCount(1);
		}
		
		if(name == "fourplayers"){
			nbofplayers = 4;
			setLevel(difficulty);
			pixels.setCount(1);
		}
		
		if(name == "tryagain"){
			pixels.setCount(count);
			pixels.initColors();
			frame.newGame();
		}
		
		if(name == "menu"){
			frame.menu();
		}
		
		if(name == "exit")
			frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
		
	}
	
	public void commandbutton(){
		

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
			newcolor = Mycolors.blue.getColor();
			break;
		}
		
		Color oldcolor;
		
		if(nbofplayers == 1){
			oldcolor = pixels.getColors()[0][0];
			if(oldcolor == newcolor)
				return;
			pixels.checkAdj(newcolor, oldcolor, 0, 0);
			pixels.setColor(newcolor, 0, 0);
			//TODO
			//pourquoi ?
			pixels.setCount(pixels.getCount()-1);
		}
		
		if(nbofplayers == 2){
			if(pixels.getCount() == 1){
				oldcolor = pixels.getColors()[0][0];
				if(oldcolor == newcolor)
					return;
				pixels.checkAdj(newcolor, oldcolor, 0, 0);
				pixels.setColor(newcolor, 0, 0);
				pixels.setCount(pixels.getCount()+1);
			}
			else{
				oldcolor = pixels.getColors()[pixels.getHeight()-1][pixels.getWidth()-1];
				if(oldcolor == newcolor)
					return;
				pixels.checkAdj(newcolor, oldcolor, pixels.getHeight()-1, pixels.getWidth()-1);
				pixels.setColor(newcolor, pixels.getHeight()-1, pixels.getWidth()-1);
				pixels.setCount(pixels.getCount()-1);
			}
		}
		
		if(nbofplayers == 3){
			if(pixels.getCount() == 1){
				oldcolor = pixels.getColors()[0][0];
				if(oldcolor == newcolor)
					return;
				pixels.checkAdj(newcolor, oldcolor, 0, 0);
				pixels.setColor(newcolor, 0, 0);
				pixels.setCount(pixels.getCount()+1);
			}
			else if(pixels.getCount() == 2){
				oldcolor = pixels.getColors()[pixels.getHeight()-1][pixels.getWidth()-1];
				if(oldcolor == newcolor)
					return;
				pixels.checkAdj(newcolor, oldcolor, pixels.getHeight()-1, pixels.getWidth()-1);
				pixels.setColor(newcolor, pixels.getHeight()-1, pixels.getWidth()-1);
				pixels.setCount(pixels.getCount()+1);
			}
			else{
				oldcolor = pixels.getColors()[pixels.getHeight()-1][0];
				if(oldcolor == newcolor)
					return;
				pixels.checkAdj(newcolor, oldcolor, pixels.getHeight()-1, 0);
				pixels.setColor(newcolor, pixels.getHeight()-1, 0);
				pixels.setCount(1);
			}
		}
		
		if(nbofplayers == 4){
			if(pixels.getCount() == 1){
				oldcolor = pixels.getColors()[0][0];
				if(oldcolor == newcolor)
					return;
				pixels.checkAdj(newcolor, oldcolor, 0, 0);
				pixels.setColor(newcolor, 0, 0);
				pixels.setCount(pixels.getCount()+1);
			}
			else if(pixels.getCount() == 2){
				oldcolor = pixels.getColors()[pixels.getHeight()-1][pixels.getWidth()-1];
				if(oldcolor == newcolor)
					return;
				pixels.checkAdj(newcolor, oldcolor, pixels.getHeight()-1, pixels.getWidth()-1);
				pixels.setColor(newcolor, pixels.getHeight()-1, pixels.getWidth()-1);
				pixels.setCount(pixels.getCount()+1);
			}
			else if(pixels.getCount() == 3){
				oldcolor = pixels.getColors()[pixels.getHeight()-1][0];
				if(oldcolor == newcolor)
					return;
				pixels.checkAdj(newcolor, oldcolor, pixels.getHeight()-1, 0);
				pixels.setColor(newcolor, pixels.getHeight()-1, 0);
				pixels.setCount(pixels.getCount()+1);
			}
			else{
				oldcolor = pixels.getColors()[0][pixels.getWidth()-1];
				if(oldcolor == newcolor)
					return;
				pixels.checkAdj(newcolor, oldcolor, 0, pixels.getWidth()-1);
				pixels.setColor(newcolor, 0, pixels.getWidth()-1);
				pixels.setCount(1);
			}
		}
		
		frame.validate();
		frame.repaint();
		
		
		
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
	
	public int getNbofplayers(){
		return nbofplayers;
	}
	
}
