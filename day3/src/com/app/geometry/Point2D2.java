package com.app.geometry;

public class Point2D2 {
	
	int co1,co2;
	double distance;

	public void getLocation() {
	if(co1>0 && co2>0)
		System.out.println("In First quadrant");
	else if(co1>0 && co2<0)
		System.out.println("In Fourth quadrant");
	else if(co1<0 && co2<0)
		System.out.println("In Third quadrant");
	else if(co1<0 && co2>0)
		System.out.println("In Second quadrant");
	else
		System.out.println("You might b another dimension");
		
	}
	public Point2D2(int co1, int co2) {
		
		this.co1 = co1;
		this.co2 = co2;
	}
	public Point2D2() {
		
	}

	 public String getDetails() {
		return ("Co-ordinate x : "+co1+" Co-ordinate y : "+co2);
	}
	
	 public boolean isEqual(Point2D2 obj) {
		
		if((co1==obj.co1) && (co2==obj.co2)) {
			System.out.println("Given points are equal");
			return true;
		}
		else
		{
			System.out.println("Given points are not equal");
			return false;
		}
	}
	public double calculateDistance(Point2D2 obj) {
		
	distance=Math.sqrt((Math.pow(obj.co1-this.co1, 2))+(Math.pow(obj.co2-this.co2, 2)));
	return distance;
}
	
}
