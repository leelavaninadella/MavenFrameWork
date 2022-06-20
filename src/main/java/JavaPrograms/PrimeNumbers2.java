package JavaPrograms;

import java.util.Scanner;

public class PrimeNumbers2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number;
		System.out.println("Enter number :");
		number = sc.nextInt();
		
		if(isPrime(number))
		{
			System.out.println("The entered number "+ number + " is Prime number...");
		}
		else
		{
			System.out.println("The entered number " + number + " is not Prime Number......");
		}

	}
	
	public static boolean isPrime(int n)
	{
		
		if(n<=1)
			return false;
		
		for(int i=2; i<=Math.sqrt(n); i++)
		{
			if(n%i == 0)
				return false;
		}
		return true;
		
	}

}
