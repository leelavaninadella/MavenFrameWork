package JavaPrograms;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		
		//Century year is should be divided by 400
		//Normal year is should be divided by 4 which is not divided by 100
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year : ");
		int year = sc.nextInt();
		
		if((year%400 == 0)||((year %100 != 0) && (year%4 == 0)))
				{
			System.out.println(year + "  is Leap Year");
				}
		else
			System.out.println(year + "  is not Leap year....");

	}

}
