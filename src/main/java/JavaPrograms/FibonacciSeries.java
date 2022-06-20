package JavaPrograms;

import java.util.Scanner;

public class FibonacciSeries {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int num;
		System.out.println("Enter number : ");
		num = sc.nextInt();
		
		int f1,f2=0, f3=1;
		
		for(int i=0; i<=num; i++)
		{
			System.out.print(f3 + "   ");
			f1=f2;
			f2=f3;
			f3 = f1+f2;
		}
		
		
		
		

	}

}
