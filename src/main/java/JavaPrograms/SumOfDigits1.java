package JavaPrograms;

import java.util.Scanner;

public class SumOfDigits1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sum = 0, input;

		System.out.println("Enter input value : ");
		input = sc.nextInt();

		while (input != 0) {
			int lastDigit = input % 10;
			sum = sum + lastDigit;
			input = input / 10;
		}
		System.out.println("The sum of digits is : " + sum);

	}

}
