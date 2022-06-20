package JavaPrograms;

import java.util.Scanner;

public class MaximumNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b, c;

		System.out.println("Enter number a : ");
		a = sc.nextInt();

		System.out.println("Enter number b :");
		b = sc.nextInt();

		System.out.println("Enter number c:");
		c = sc.nextInt();
		
		System.out.println("Entered Numbers are :" + a + "  "+b+"  " +c);

		if (a > b && a > c) {
			System.out.println("a is Maximum Number...");
		} else if (b > c) {
			System.out.println("b is Maximum Number...");
		} else {
			System.out.println("C is Maximum Number.....");
		}

	}

}
