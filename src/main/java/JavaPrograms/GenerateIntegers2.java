package JavaPrograms;

import java.util.Scanner;

public class GenerateIntegers2 {

	public static void main(String[] args) {
		int random, n, end;
		System.out.println("Enter number :");
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		System.out.println("Eneter end number : ");
		end = sc.nextInt();
		
		for(int i=1; i<=n ; i++)
		{
			random = (int) (Math.random()*end);
			System.out.println("The random Integers are : " + random);
		}
		
		

	}

}
