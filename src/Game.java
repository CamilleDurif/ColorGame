import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Game implements ActionListener{

	static Game game;
	
	private Frame frame;
	private Pixels pixels;
	
	public Game(){
		
		Game.game = this;
		
		frame = new Frame();
		frame.setVisible(true);

	
		pixels = new Pixels(14,9);
		
		
	}
	
	public void checkWin(){
		
		if(pixels.isWinning())
			System.out.println("gagné");
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		
		Color oldcolor = pixels.getColors()[0][0];
		
		Color newcolor;
		
		String name = (((JButton)e.getSource()).getName());
		
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
		
		checkWin();
	}
	
	static public Game getGame(){
		return Game.game;
	}
	
	public Pixels getPixels(){
		return pixels;
	}
	
	
	
}
