package JavaPrograms;

import java.util.Scanner;

public class SumOfnNumbers1 {

	public static void main(String[] args) {
		
		int n,sum=0;
		System.out.println("Eneter number : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int i=0 ; i<=n; i++)
		{
			sum = sum + i;
			
		}
		System.out.println("The sum is : " + sum);

	}

}
