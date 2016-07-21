import java.awt.Dimension;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Frame extends JFrame{
	
	//private CardLayout cl;
	//private JPanel content;
	
	private Board board;
	
	public Frame(){
				
		setTitle("ColorGame");
		setSize(new Dimension(800,600));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setFocusable(true);
		
		//cl = new CardLayout();
		//content = new JPanel();
		
		board = new Board();
		
		this.add(board);
		
	}

}
