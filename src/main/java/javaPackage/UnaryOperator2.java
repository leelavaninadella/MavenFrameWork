package javaPackage;

public class UnaryOperator2 {

	public static void main(String[] args) {
		
		int a=2;
		int b=3;
		
		System.out.println(a + b);//2+ 3=5
		System.out.println(a++ + ++a);//2,3,4,4(7)
		System.out.println(a++ + ++a);//4,5,6,6
		System.out.println(++a + a++);//7,7,7,8
		System.out.println(++a + ++a);//9,9,10,10
		
		System.out.println(a++ + ++b);//10,11,4,4

	}

}
