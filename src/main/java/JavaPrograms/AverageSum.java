package JavaPrograms;

import java.util.Scanner;

public class AverageSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b,sum;
		float avg;
		
		System.out.println("Enetr a & b values "); 
		a=sc.nextInt();
		b = sc.nextInt();
		System.out.println("a == " + a + "  b == " + b);
		
		sum = (a+b);
		System.out.println("Sum of a & b is : " + sum);
		
		avg = (float)(a+b)/2;
		System.out.println("Average of a & b is : " + avg);

	}

}
