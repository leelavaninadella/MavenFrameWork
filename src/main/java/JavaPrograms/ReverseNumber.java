package JavaPrograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int  num, result=0, remainder;
		System.out.println("Enter number : ");
		num = sc.nextInt();
		
		while(num>0)
		{
			remainder = num%10;
			result = result*10+remainder;
			num = num/10;
		}
		System.out.println("Reverse of the number is : " + result);
		

	}

}
