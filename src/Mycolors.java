import java.awt.Color;

public enum Mycolors {

	blue (new Color(0,0,150)),
	green (new Color(120,220,50)), 
	red (new Color(250,0,0)),
	orange (new Color(250,250,50));
	
	private final Color color;
	
	Mycolors(Color color){
		this.color = color;
	}
	
	public Color getColor(){
		return color;
	}
	
}
