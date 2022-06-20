package javaPackage;

public class UnaryOperator3 {

	public static void main(String[] args) {
		
		int x=2;
		int y=x++;
		System.out.println(x);//3
		System.out.println(y);//2
		System.out.println(x);//3
		System.out.println(x);//3
		System.out.println(y);//2
		System.out.println(x);//3
		System.out.println(y);//2

	}

}
