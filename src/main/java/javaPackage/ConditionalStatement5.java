package javaPackage;

import java.util.Scanner;

public class ConditionalStatement5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int age;
		int weight;
		
		System.out.println("Enter age : ");
		age = sc.nextInt();
		
		System.out.println("Enter weight : ");
		weight = sc.nextInt();
		
		if((age >= 18) && (weight >= 50))
		{
			System.out.println("You are elible for blood donation....");
		}
		else
		{
			System.out.println("Not eligible.....");
		}

	}

}
