import java.awt.Color;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class CommandBoard extends JPanel{
	
	
	public CommandBoard(){
		
		super();
		
		this.setBackground(Color.white);
		
		this.add(new Button(Mycolors.blue.getColor(), "blue", null));
		this.add(new Button(Mycolors.green.getColor(), "green", null));
		this.add(new Button(Mycolors.red.getColor(), "red", null));
		this.add(new Button(Mycolors.purple.getColor(), "purple", null));
		this.add(new Button(Mycolors.yellow.getColor(), "yellow", null));
		this.add(new Button(Mycolors.orange.getColor(), "orange", null));
		
		
	}

}
