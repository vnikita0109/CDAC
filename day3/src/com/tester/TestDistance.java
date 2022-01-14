package com.tester;

import java.util.Scanner;

public class TestDistance {
	public static void main(String[] args) {
		System.out.println("Enter the point details : ");
		Scanner sc=new Scanner(System.in);
		DistanceCheck dc= new DistanceCheck(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		dc.isEqual();
		sc.close();
	}
}
class DistanceCheck{
	int x1,x2,y1,y2;
	double distance;

	public DistanceCheck(int x1, int x2, int y1, int y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	
	public void isEqual() {
		if(this.x1==this.x2 && this.y1==this.y2)
			System.out.println("Points p1 and p2 are at same location");
		else
			distance=Math.sqrt((Math.pow(x2-x1, 2))+(Math.pow(y2-y1, 2)));
			System.out.println("The distance between given two points is: " + distance);
	}
}