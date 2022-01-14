package com.tester;

import java.util.Scanner;

public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter numbers for coorinate details :");
	Point p1=new Point(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
	System.out.println(p1.getDetails());
	p1.isEqual();
	p1.display();
	
	sc.close();
	}

}
class Point{
	int x1,x2,y1,y2;

	public Point(int x1, int x2, int y1, int y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	public String getDetails() {
		return "Point 1 : ("+ x1 +","+ y1 +")"+"Point 2 : ("+x2+","+y2+")";
	}
	public void isEqual() { 
	if(this.x1==this.x2 && this.y1==this.y2)
		System.out.println("P1 and P2 are same");
	else
		System.out.println("P1 and P2 are located distant");
}
	public void display() {
		System.out.println("Co-Ordinates of point P1 ("+x1+","+y1+")");
		System.out.println("Co-Ordinates of point P2 ("+x2+","+y2+")");
	}	
	
}