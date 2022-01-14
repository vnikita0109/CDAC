package com.tester;

import java.util.Scanner;

public class TestPointArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,i,j,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of points to create : ");
		m=sc.nextInt();
		n=2;
		int array[][] = new int[m][n];
		//Saving data elements
		System.out.println("Enter the elements of the array: ");   
		//loop for row  
		for ( i = 0; i < m; i++)   
		//inner for loop for column  
		for (j = 0; j < n; j++)   
		array[i][j] = sc.nextInt();
		
		//Displaying array elements   
				System.out.println("Elements of the array are: ");   
				for (i = 0; i < m; i++)   
				{   
				for (j = 0; j < n; j++)   
				//prints the array elements  
				System.out.print(array[i][j] + " ");   
				//throws the cursor to the next line  
				System.out.println();   
				}   
			
		}
	

}
