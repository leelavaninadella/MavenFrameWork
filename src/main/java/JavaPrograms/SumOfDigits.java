package JavaPrograms;

import java.util.Scanner;

public class SumOfDigits {

static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	int input;
	System.out.println("Enter the value of input : ");
	input = sc.nextInt();
	
	int sum = 0;
	
	while(input != 0)
	{
		int lastDigit = input % 10;
		sum = sum + lastDigit;
		input = input/10;
	}

	System.out.println("sum of digit is : " + sum);
	}

}
