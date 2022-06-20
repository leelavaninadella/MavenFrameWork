package JavaPrograms;

import java.util.Scanner;

public class PrimeNumbers6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int start, end;
		System.out.println("Enter start Number : ");
		start = sc.nextInt();
		System.out.println("Enter end number : ");
		end = sc.nextInt();
		
		for(int i=start; i<=end ; i++)
		{
			if(isPrime(i))
				System.out.print(i + "  ");
		}
		System.out.println();
		

	}
	
	public static boolean isPrime(int n)
	{
		if(n<1)
			return false;
		for(int i=2; i<n; i++)
		{
			if(n%i == 0)
				return false;
		}
		return true;
	}

}
