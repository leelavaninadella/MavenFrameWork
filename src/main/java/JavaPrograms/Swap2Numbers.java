package JavaPrograms;

import java.util.Scanner;

public class Swap2Numbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a,b,temp;
		
		System.out.println("Enter  number a :");
		a= sc.nextInt();
		System.out.println("Enter Number b :");
		b=sc.nextInt();
		System.out.println("Before Swapping :");
		System.out.println("a == " + a );
		System.out.println("b == "+ b);
		
		temp = a;
		a=b;
		b=temp;
		
		System.out.println("After Swapping : ");
		System.out.println("a == " + a);
		System.out.println("b == " + b);

	}

}
