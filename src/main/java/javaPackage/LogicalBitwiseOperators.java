package javaPackage;

public class LogicalBitwiseOperators {

	public static void main(String[] args) {
		
		
		int a=10;
		int b=11;
		
		System.out.println(a>b && a++<=b);
		System.out.println(a);//10
		
		System.out.println(a>b & a++<=b);
		System.out.println(a);//11
	}

}

//Logical Operator : If first condition is false, It will not check 2nd condition. Controller will check next line of code
//Bitwise Operator : It always check both the conditions either first condition is false or true.
