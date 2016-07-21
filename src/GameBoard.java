import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GameBoard extends JPanel{
		
	public void paintComponent(Graphics g){
				
		int i=0;
		int j=0;
		
		for(i=0;i<Game.getGame().getPixels().getHeight();i++){
			for(j=0;j<Game.getGame().getPixels().getWidth();j++){
				g.setColor(Game.getGame().getPixels().getColors()[i][j]);
				g.fillRect(50*(i+1), 50*(j+1), 50, 50);
			}
		}
		
		
	}

}
