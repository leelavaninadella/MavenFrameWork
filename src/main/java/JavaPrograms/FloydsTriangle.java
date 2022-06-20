package JavaPrograms;

import java.util.Scanner;

public class FloydsTriangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n, num=1;
		
		System.out.println("Enter Number : ");
		n=sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(num + "  ");
				num++;
			}
			System.out.println();
		}

	}

}
