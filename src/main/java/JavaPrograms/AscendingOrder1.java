package JavaPrograms;

import java.util.Scanner;

public class AscendingOrder1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n, temp;
		
		System.out.println("Enter no. of elements : ");
		n=sc.nextInt();
		
		int a[] = new int[n];
		System.out.println("Enter elements : ");
		
		for(int i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				if(a[i]>a[j])
				{
					temp = a[i];
					a[i]= a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Ascending Order Is : ");
		for(int i=0; i<n-1; i++)
		{
			System.out.print(a[i]+ "  ");
		}
		System.out.print(a[n-1]);
			

	}

}
