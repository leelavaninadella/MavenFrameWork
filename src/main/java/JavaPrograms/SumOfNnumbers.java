package JavaPrograms;

import java.util.Scanner;

public class SumOfNnumbers {

	public static void main(String[] args) {

int n,sum=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter n numbers : ");
n = sc.nextInt();

for(int i=0; i<=n; i++)
{
sum = sum+i;
}

System.out.println("Sum of upto " + n + "Numbers is : " + sum);
	}

}
