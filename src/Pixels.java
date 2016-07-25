import java.awt.Color;

public class Pixels {
	
	private Color[][] colors;
	
	private int height;
	private int width;
	private int size;
	private int count;
	
	public Pixels(int x, int y, int z, int count){
		
		colors = new Color[x][y];
		
		this.height = x;
		this.width = y;
		this.size = z;
		this.count = count;
		 		
		initColors();
		
	}	
	
	public void checkAdj(Color newcolor, Color oldcolor, int i, int j){
		
		if(j+1<width && colors[i][j+1] == oldcolor){
			colors[i][j+1] = newcolor;
			checkAdj(newcolor, oldcolor, i, j+1);
			
		}
		
		if(i+1<height && colors[i+1][j] == oldcolor){
			colors[i+1][j] = newcolor;
			checkAdj(newcolor, oldcolor, i+1, j);
			
		}
		
		if(j-1>=0 && colors[i][j-1] == oldcolor){
			colors[i][j-1] = newcolor;
			checkAdj(newcolor, oldcolor, i, j-1);
			
		}
		
		if(i-1>=0 && colors[i-1][j] == oldcolor){
			colors[i-1][j] = newcolor;
			checkAdj(newcolor, oldcolor, i-1, j);
		
		}
	}
	
	public boolean isWinning(){
		
		for(int i=0; i<height; i++){
			for(int j=0; j<width; j++){
				if(colors[i][j] != colors[0][0])
					return false;
			}
		}
		return true;
	}
	
	public void setColor(Color newcolor, int x, int y){
		colors[x][y] = newcolor;
	}
	
	
	public void initColors(){
		
		for(int i=0;i<height;i++){
			for(int j=0;j<width;j++){
				int rand = (int)(Math.random()*6);
				switch(rand){
				case 0:
					this.colors[i][j] = Mycolors.blue.getColor();
					break;
				case 1:
					this.colors[i][j] = Mycolors.red.getColor();
					break;
				case 2:
					this.colors[i][j] = Mycolors.green.getColor();
					break;
				case 3:
					this.colors[i][j] = Mycolors.orange.getColor();
					break;
				case 4:
					this.colors[i][j] = Mycolors.yellow.getColor();
					break;
				case 5:
					this.colors[i][j] = Mycolors.purple.getColor();
					break;
				}
			}
		}
	}
	
	
	public Color[][] getColors(){
		return colors;
	}



	public int getHeight() {
		return height;
	}



	public void setHeight(int height) {
		this.height = height;
	}



	public int getWidth() {
		return width;
	}



	public void setWidth(int width) {
		this.width = width;
	}



	public int getSize() {
		return size;
	}



	public void setSize(int size) {
		this.size = size;
	}



	public int getCount() {
		return count;
	}



	public void setCount(int count) {
		this.count = count;
	}
	

}
