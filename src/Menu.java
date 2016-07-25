import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class Menu extends JPanel{
	
	
	public Menu(){
		
		super(new GridBagLayout());
		
		GridBagConstraints c = new GridBagConstraints();
		c.insets = new Insets(10,10,10,10);
		
		Dimension n = new Dimension(150,30);
		
		ButtonGroup bg = new ButtonGroup();
		
		JRadioButton easy = new JRadioButton("Easy", true);
		easy.setName("easy");
		easy.setFocusable(false);
		bg.add(easy);
		c.gridy = 1;
		this.add(easy, c);
		easy.addActionListener(Game.getGame());
		
		JRadioButton medium = new JRadioButton("Medium");
		medium.setName("medium");
		medium.setFocusable(false);
		bg.add(medium);
		c.gridy = 1;
		c.gridx = 1;
		this.add(medium, c);
		medium.addActionListener(Game.getGame());
		
		JRadioButton hard = new JRadioButton("Hard");
		hard.setName("hard");
		hard.setFocusable(false);
		bg.add(hard);
		c.gridy = 1;
		c.gridx = 2;
		this.add(hard, c);
		hard.addActionListener(Game.getGame());
		
		/*Button easy = new Button(Mycolors.green.getColor(), "easy", "easy");
		easy.setPreferredSize(n);
		c.gridy = 1;
		this.add(easy, c);
		easy.addActionListener(Game.getGame());
		
		Button medium = new Button(Mycolors.green.getColor(), "medium", "medium");
		medium.setPreferredSize(n);
		c.gridy = 1;
		c.gridx = 1;
		this.add(medium, c);
		medium.addActionListener(Game.getGame());
		
		Button hard = new Button(Mycolors.green.getColor(), "hard", "hard");
		hard.setPreferredSize(n);
		c.gridy = 1;
		c.gridx = 2;
		this.add(hard, c);
		hard.addActionListener(Game.getGame());*/
		
		JLabel jlab = new JLabel("Difficulty :");
		c.gridy = 0;
		c.gridx = 1;
		this.add(jlab, c);
		
		JLabel jlab2 = new JLabel("Number of players :");
		c.gridy = 2;
		c.gridx = 1;
		this.add(jlab2, c);
		
		Button oneplayer = new Button(Mycolors.purple.getColor(), "oneplayer", "Single Player");
		oneplayer.setPreferredSize(n);
		c.gridy = 3;
		c.gridx = 1;
		this.add(oneplayer, c);
		oneplayer.addActionListener(Game.getGame());
		
		Button twoplayers = new Button(Mycolors.purple.getColor(), "twoplayers", "Two Players");
		twoplayers.setPreferredSize(n);
		c.gridy = 4;
		c.gridx = 1;
		this.add(twoplayers, c);
		twoplayers.addActionListener(Game.getGame());
		
		Button threeplayers = new Button(Mycolors.purple.getColor(), "threeplayers", "Three Players");
		threeplayers.setPreferredSize(n);
		c.gridy = 5;
		this.add(threeplayers, c);
		threeplayers.addActionListener(Game.getGame());
		
		Button fourplayers = new Button(Mycolors.purple.getColor(), "fourplayers", "Four Players");
		fourplayers.setPreferredSize(n);
		c.gridy = 6;
		this.add(fourplayers, c);
		fourplayers.addActionListener(Game.getGame());
		
	}

}
