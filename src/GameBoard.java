import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GameBoard extends JPanel{
		
	public void paintComponent(Graphics g){
		
		g.setFont(new Font("Tahoma", Font.BOLD, 15));
		g.setColor(Color.GRAY);
		if(Game.getGame().getNbofplayers() == 1)
			g.drawString("Action left : " + Game.getGame().getPixels().getCount(), 15, 20);
		else
			g.drawString("Player " + Game.getGame().getPixels().getCount() + " turn", 15, 20);

				
		int i=0;
		int j=0;
		
		int size = Game.getGame().getPixels().getSize();
		
		for(i=0;i<Game.getGame().getPixels().getHeight();i++){
			for(j=0;j<Game.getGame().getPixels().getWidth();j++){
				g.setColor(Game.getGame().getPixels().getColors()[i][j]);
				g.fillRect(size*(i+1), size*(j+1), size, size);
			}
		}
		
		g.setColor(new Color(0,0,0,50));

		if(Game.getGame().getNbofplayers() == 4){
			g.drawString("4", size + size/2, Game.getGame().getPixels().getWidth()*size + size/2);
			g.drawString("3", Game.getGame().getPixels().getHeight()*size + size/2, size+size/2);
			g.drawString("2", Game.getGame().getPixels().getHeight()*size + size/2, Game.getGame().getPixels().getWidth()*size + size/2);
			g.drawString("1", size + size/2, size + size/2);
		}

		if(Game.getGame().getNbofplayers() == 3){
			g.drawString("3", Game.getGame().getPixels().getHeight()*size + size/2, size+size/2);
			g.drawString("2", Game.getGame().getPixels().getHeight()*size + size/2, Game.getGame().getPixels().getWidth()*size + size/2);
			g.drawString("1", size + size/2, size + size/2);
		}
		
		if(Game.getGame().getNbofplayers() == 2){
			g.drawString("2", Game.getGame().getPixels().getHeight()*size + size/2, Game.getGame().getPixels().getWidth()*size + size/2);
			g.drawString("1", size + size/2, size + size/2);
		}
		
	}

}
