import java.awt.Color;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class CommandBoard extends JPanel{
	
	
	public CommandBoard(){
		
		super();
		
		this.setBackground(Color.white);
		
		this.add(new Button(Mycolors.blue.getColor(), "blue"));
		this.add(new Button(Mycolors.green.getColor(), "green"));
		this.add(new Button(Mycolors.red.getColor(), "red"));
		
		this.add(new Button(Mycolors.orange.getColor(), "orange"));
		
		
	}

}
