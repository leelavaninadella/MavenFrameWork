package javaPackage;

import java.util.Scanner;

public class ConditionalStatements4 {

	public static void main(String[] args) {
		
		int age;
		int weight;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age : ");
		age = sc.nextInt();
		
		System.out.println("Enter weight : ");
		weight = sc.nextInt();
		
		if(age>=18)
		{
			if(weight >= 50)
			{
				System.out.println("You are eligible blood donation....");
			}
			
			else
			{
				System.out.println("You are not eligible for blood donation....");
			}
		}
		else
		{
			System.out.println("Must be enter age is greaterthan are equal to 18");
		}
	}

}
