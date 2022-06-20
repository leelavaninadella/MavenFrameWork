package JavaPrograms;

import java.util.Scanner;

public class LeapYear5 {

	public static void main(String[] args) {
		int year;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year : ");
		year = sc.nextInt();

		if ((year % 400 == 0) && (year % 100 != 0) || (year % 4 == 0))
			System.out.println(year + "   is Leap Year...");
		else
			System.out.println(year + "  is not Leap year..");

	}

}
