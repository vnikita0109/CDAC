package com.app.geometry;

import java.util.Scanner;

public class Point2D1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 2 numbers : ");
		Point2D2 p=new Point2D2(sc.nextInt(),sc.nextInt());
		System.out.println(p.getDetails());
		
		System.out.println("Enter 2 numbers for another point: ");
		Point2D2 p2=new Point2D2(sc.nextInt(),sc.nextInt());
		p.getLocation();
		System.out.println(p.isEqual(p2));
		
		System.out.println(p.calculateDistance(p2));
		
		sc.close();
	}

}

//for jenkins purpose