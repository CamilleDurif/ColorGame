import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Menu extends JPanel{
	
	
	public Menu(){
		
		super(new GridBagLayout());
		
		GridBagConstraints c = new GridBagConstraints();
		c.insets = new Insets(10,10,10,10);
		
		Button easy = new Button(Mycolors.green.getColor(), "easy", "easy");
		easy.setPreferredSize(new Dimension(150,30));
		c.gridy = 1;
		this.add(easy, c);
		easy.addActionListener(Game.getGame());
		
		Button medium = new Button(Mycolors.green.getColor(), "medium", "medium");
		medium.setPreferredSize(new Dimension(150,30));
		c.gridy = 2;
		this.add(medium, c);
		medium.addActionListener(Game.getGame());
		
		Button hard = new Button(Mycolors.green.getColor(), "hard", "hard");
		hard.setPreferredSize(new Dimension(150,30));
		c.gridy = 3;
		this.add(hard, c);
		hard.addActionListener(Game.getGame());
		
		JLabel jlab = new JLabel("DIFFICULTY :");
		c.gridy = 0;
		this.add(jlab, c);
		
	}

}
