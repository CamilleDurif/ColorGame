import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class Button extends JButton{
	
	public Button(Color color, String name, String text){
		
		super();
		
		this.setBackground(color);
		this.setPreferredSize(new Dimension(90,40));
		this.setName(name);
		
		
		if(text != null)
			this.setText(text);
		
		this.addActionListener(Game.getGame());
		
		this.setFocusable(false);
		
	}

}
