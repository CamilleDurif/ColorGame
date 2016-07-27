import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GameOver extends JPanel{
	
	public GameOver(){
		
		super(new GridBagLayout());
		
		this.setBackground(Mycolors.greyblue.getColor());
		
		GridBagConstraints c = new GridBagConstraints();
		c.insets = new Insets(5,5,5,5);
		
		c.gridy = 0;
		
		JLabel winlab = new JLabel("You win !");
		winlab.setFont(new Font("Tahoma", Font.BOLD, 20));
		JLabel looselab = new JLabel("You loose...");
		looselab.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		int winner = Game.getGame().getPixels().getCount();
		if(winner == 1)
			winner = Game.getGame().getNbofplayers();
		else
			winner--;
		
		JLabel playerwin = new JLabel("Player " + winner + " win !");
		playerwin.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		if(Game.getGame().getPixels().isWinning() && Game.getGame().getNbofplayers() > 1)
			this.add(playerwin, c);
		else if(Game.getGame().getPixels().isWinning())
			this.add(winlab, c);
		else
			this.add(looselab, c);
		
		Button tryagain = new Button(Mycolors.blue.getColor(), "tryagain", "Try Again");
		tryagain.setPreferredSize(new Dimension(150,30));
		tryagain.addActionListener(Game.getGame());
		c.gridy = 1;
		this.add(tryagain, c);
		
		Button menu = new Button(Mycolors.green.getColor(), "menu", "Menu");
		menu.setPreferredSize(new Dimension(150,30));
		menu.addActionListener(Game.getGame());
		c.gridy = 2;
		this.add(menu, c);
		
		Button exit = new Button(Mycolors.red.getColor(), "exit", "Exit");
		exit.setPreferredSize(new Dimension(150,30));
		exit.addActionListener(Game.getGame());
		c.gridy = 3;
		this.add(exit, c);
	}

}
