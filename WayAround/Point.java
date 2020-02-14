
public class Point {

	private int xPos, yPos, index;

	public Point() {
		xPos = 0;
		yPos = 0;
		index = 0;
	}
	
	public Point(int x,int y,int ind) {
		xPos = x;
		yPos = y;
		index = ind;
	}
	
	public int getX() {
		return xPos;
	}
	
	public int getY() {
		return yPos;
	}
	
	public int getIndex() {
		return index;
	}
	
	
	public void setCoord(int x,int y,int ind) {
		xPos = x;
		yPos = y;
		index = ind;
	}
	public void setX(int x) {
		xPos = x;
	}
	
	public void setY(int y) {
		yPos = y;
	}
	
}
