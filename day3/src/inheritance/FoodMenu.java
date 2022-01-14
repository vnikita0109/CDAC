package inheritance;

import java.util.Scanner;

import com.app.geometry.Point2D2;


public class FoodMenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many points to Plot?");
		
		Point2D2 [] points= new Point2D2[sc.nextInt()];
		
		boolean isTrue = true;
		
		do {
			System.out.println("Choose what you want to do here!!");
			System.out.println("1. Plot a new point");
			System.out.println("2. Display all points plotted");
			System.out.println("3. Test equility of two points");
			System.out.println("4. Calculate distance");
			System.out.println("5. Exit");
			int option = sc.nextInt();
			switch (option) {
			case 1:System.out.println("Plot a new Point here!!");
					System.out.println("Enter index");
					int index = sc.nextInt();
					if(index< points.length) {
					System.out.println("Enter x and y coordiantes of points");
					points[index]= new Point2D2(sc.nextInt(),sc.nextInt());
					}else {
						System.out.println("you have entered the index out of size of databse");
					}
				break;
			case 2: System.out.println("Display all points Plotted ");
			for(Point2D2 d: points) {
				if(d!=null) {
					System.out.println(d.getDetails());
				}
			}
				break;
			case 3:System.out.println("Test equality of two points");
						System.out.println("Enter index of one point and another points");
						System.out.println(points[sc.nextInt()].isEqual(points[sc.nextInt()]));
				break;
			case 4: System.out.println("Calculate distance here!!");
						System.out.println("Enter index of one point and another points");
						int fpoint =sc.nextInt();
						int spoint = sc.nextInt();
						if(points[fpoint].isEqual(points[spoint])==false) {
							System.out.println(points[fpoint].calculateDistance(points[spoint]));	
						}else {
							System.out.println("both points at same point");
						}
				break;
			case 5: System.out.println("Exit");	
						isTrue=false;
						break;
			default: System.out.println("Sorry!! you have choosen wrong option");
				break;
			}
		}while(isTrue);
		
		
		sc.close();

	}

}
