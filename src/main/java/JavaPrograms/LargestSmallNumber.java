package JavaPrograms;

import java.util.Scanner;

public class LargestSmallNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Enter size of an array : ");
		n= sc.nextInt();
		
		int a[] = new int[n];
		System.out.println("Enter elements : ");
		for(int i=0; i<n; i++)
		{
			a[i]=sc.nextInt();
		}
		
		//Print rray elements
		for(int j=0; j<a.length; j++)
		{
			System.out.print( a[j]+ "   ");
		}
		System.out.println();
		
		int LargestNo = a[0];
		int smallNo = a[0];
		
		for(int i=1; i<a.length; i++)
		{
			if(a[i]>LargestNo)
			{
				LargestNo=a[i];
			}
			else if(a[i]<smallNo)
			{
				smallNo =  a[i];
			}
		}
		System.out.println("The Largest No. Is : " + LargestNo);
		System.out.println("The small No. Is : " + smallNo);

	}

}
