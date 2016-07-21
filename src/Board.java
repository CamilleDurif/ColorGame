import java.awt.BorderLayout;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Board extends JPanel{
	
	public Board(){
		
		super(new BorderLayout());
				
		GameBoard gameboard = new GameBoard();
		this.add(gameboard, BorderLayout.CENTER);
		
		CommandBoard commandboard = new CommandBoard();
		this.add(commandboard, BorderLayout.SOUTH);
		
	}

}
