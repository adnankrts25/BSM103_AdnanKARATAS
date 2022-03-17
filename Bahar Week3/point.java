package uygulama2;

public class point {

	int x;
	int y;
	
	public point(int x, int y) {
		this.x = x;
		this.y= y;	
	}
	
	public double distanceFromorigin() {
		return Math.sqrt(x*x + y*y);
		
	}
	public void translate(int dx, int dy) {
	
	

	x +=dx;
	y +=dy;
	}
}
