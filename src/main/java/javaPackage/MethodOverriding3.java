package javaPackage;

public class MethodOverriding3 {

	public static void main(String[] args) {
		
		MethodOverriding2 mo2 = new MethodOverriding2();
		mo2.m1();
		mo2.m2();
		mo2.m3();
		mo2.m3("ABC");
		mo2.m3(12.12f, 12);
		
		System.out.println("****************************8");
		
		MethodOverriding1 mo1 = new MethodOverriding2();
		mo1.m1();
		mo1.m2();

	}

}
