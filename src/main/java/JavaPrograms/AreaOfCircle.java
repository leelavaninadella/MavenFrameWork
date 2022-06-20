package JavaPrograms;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int radius;
		double area;
		
		System.out.println("Enter Radius : ");
		radius = sc.nextInt();
		
		//Caluculate Area of circle : Pi *(radius)^2
		
		area = Math.PI*radius*radius;
		System.out.println("Area of circle is : " + area);
		

	}

}
