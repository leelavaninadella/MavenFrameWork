package JavaPrograms;

import java.util.Scanner;

public class swap2numbers2 {

	public static void main(String[] args) {

		float a, b;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		a = sc.nextFloat();
		System.out.println("Enter b number : ");
		b = sc.nextFloat();

		System.out.println("Before swapping :");
		System.out.print(a + "  " + b);
		System.out.println();
		System.out.println("****************************");

		System.out.println("After Swapping ");
		a = a - b;
		b = a + b;
		a = b - a;
		System.out.println(a + "   " + b);

	}

}
