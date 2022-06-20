package JavaPrograms;

import java.util.Scanner;

public class SmallLargestNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter size of an array : ");
		n= sc.nextInt();
		
		int a[] = new int[n];
		System.out.println("Enter elements of n array : ");
		for(int i=0; i<n ; i++)
		{
			a[i] = sc.nextInt();
		}
		
		//Print Array Elements
		
		System.out.println("The array Elements are : ");
		for(int i=0 ; i< a.length; i++)
		{
			
			System.out.print(a[i] + "  ");
		}
		System.out.println();
		
		//Find Smallest & Largest Number
		
	 int largestNo = a[0];
	 int smallNo = a[0];
	 
	 for(int i =0 ; i< n; i++)
	 {
		 if(largestNo < a[i])
			 largestNo = a[i];
		 else if(smallNo > a[i])
			 smallNo = a[i];
	 }
	 
	 System.out.println("The smallest Number : " + smallNo);
	 System.out.println("The Largest Number : " + largestNo);
		
		
	}

}
