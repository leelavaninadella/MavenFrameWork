package JavaPrograms;

import java.util.Scanner;

public class primeNumbers4 {

	public static void main(String[] args) {
		int start, end;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start number : ");
		start = sc.nextInt();
		System.out.println("Enter end number : ");
		end = sc.nextInt();
		System.out.println("Prime numbers are : ");
		for (int i = start; i <= end; i++) {
			if (isPrime(i))
				System.out.print(i + "   ");
		}
		System.out.println();

	}

	public static boolean isPrime(int n) {

		if (n < 1)
			return false;

		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
