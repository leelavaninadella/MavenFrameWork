package javaPackage;

public class MethodOverriding2 extends MethodOverriding1 {

	static void m1() {
		System.out.println("B m1");
	}

	void m2() {
		System.out.println("B m2");
	}

	void m3(float f, int x) {
		System.out.println("B m3 float , int parameter");
	}
}
