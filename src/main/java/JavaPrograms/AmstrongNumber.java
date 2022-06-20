package JavaPrograms;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int input,remainder, result=0;
		
		System.out.println("Enter input Number : ");
		input = sc.nextInt();
		int num=input;
		
		while(input > 0)
		{
			remainder = input%10;
			result = result+ (int)  Math.pow(remainder, 3);
			input=input/10;
		}
System.out.println(result);
System.out.println(num);
if(result == num)
	System.out.println("The given input number " + num + " is Amstrong Number...");
else
	System.out.println("The given input number " + num + "is not Amstrong Number.....");
	}

}
