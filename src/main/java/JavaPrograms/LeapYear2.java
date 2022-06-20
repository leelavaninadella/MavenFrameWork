package JavaPrograms;

import java.util.Scanner;

public class LeapYear2 {

	static Scanner sc = new Scanner(System.in);
	static int year;

	public static void main(String[] args) {

		System.out.println("Enter year : ");
		year = sc.nextInt();

		if ((year % 400 == 0) || (year % 100 != 0) && (year % 4 == 0))
			System.out.println("Entered year is Leap Year....");

		else
			System.out.println("Entered year is not a leap year.......");
	}

}
