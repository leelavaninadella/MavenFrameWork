package JavaPrograms;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input, remainder, reverse=0;
		
		System.out.println("Enter input number : ");
		input = sc.nextInt();
		
		int num = input;
		
		while(input>0)
		{
			remainder = input%10;
			reverse = reverse * 10 + remainder;
			input=input/10;
		}
		System.out.println("The reverse no. is : " + reverse);
		if(reverse == num)
		{
			System.out.println(num + " is Palindrome....");
		}
		else
		{
			System.out.println(num + " is not Palindrome....");
		}
	}

}
