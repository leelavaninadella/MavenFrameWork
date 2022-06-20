package JavaPrograms;

import java.util.Scanner;

public class Factorial {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int input;
		
		System.out.println("Enter input value : ");
		input = sc.nextInt();
		
		int result=1;
		while(input >0)
		{
			result = result*input;
			input--;
		}
		System.out.println("The factorial of" + input + " is : " + result);
		

	}

}
