import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class Button extends JButton{
	
	public Button(Color color, String name){
		
		super();
		
		this.setBackground(color);
		this.setPreferredSize(new Dimension(50,20));
		this.setName(name);
		
		this.addActionListener(Game.getGame());
		
		this.setFocusable(false);
		
	}

}
