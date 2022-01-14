package inheritance;

public class Point2D {
	int x, y;
	
	public Point2D(int x, int y){
		this.x=x;
		this.y=y;
		
	}
	
	public String getDetails() {
		
		return "the coordinates of point x "+this.x+" , and y is"+this.y;
	}
	
	public boolean isEqual(Point2D obj) {
		if(this.x == obj.x && this.y==obj.y) {
			return true;
		}else {
			return false;
		}
	}
	
	public double calculateDistance(Point2D obj) {
		double a = Math.pow((obj.x-this.x),2);
		double  b= Math.pow((obj.y-this.y), 2);
		double d = Math.sqrt(a+b);
		return d;
	}
	
	
	
	
	
}
