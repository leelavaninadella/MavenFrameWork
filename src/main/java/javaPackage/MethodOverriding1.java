package javaPackage;

public class MethodOverriding1 {
	
	static void m1()
	{
		System.out.println("A m1 is static, can not be override");
	}

	void m2()
	{
		System.out.println("A m2");
	}
	
	static void m3()
	{
		System.out.println("A m3, No Parameter");
	}
	
	int m3(String s)
	{
		System.out.println("A m3, String parameter");
		return 50;
	}
}
