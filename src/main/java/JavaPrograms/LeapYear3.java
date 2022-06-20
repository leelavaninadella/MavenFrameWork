package JavaPrograms;

import java.util.Scanner;

public class LeapYear3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int year;
		System.out.println("Enter year : ");
		year = sc.nextInt();
		
		if((year%400 == 0) || (year%100 != 0) && (year%4 == 0))
			System.out.println("The entered year"+ year+" is Leap year.......");
		else
			System.out.println("The entered year " + year + " is not Leap year.....");

	}

}
