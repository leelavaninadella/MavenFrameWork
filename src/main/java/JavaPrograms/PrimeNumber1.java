package JavaPrograms;

import java.util.Scanner;

public class PrimeNumber1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int start, end;
		System.out.println("Enter starting Number : ");
		start = sc.nextInt();
		
		System.out.println("Enter ending Number : ");
		end = sc.nextInt();
		
		System.out.println("The prime numbers between "+ start + " &" + end + "are :");
		for(int i=start; i<=end; i++)
		{
			if(isPrime(i))
			{
				System.out.println(i);
			}
		}

	}
	
	public static boolean isPrime(int n)

	{
		
		if(n<=1)
			return false;
		
		for(int i=2; i<=Math.sqrt(n); i++)
		{
			if(n%i == 0)
			{
				return false;
			}
		}
		return true;
		
	}

}
