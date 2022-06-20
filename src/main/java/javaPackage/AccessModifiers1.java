package javaPackage;

import myPackage.DatePicker1;

public class AccessModifiers1  {

	public static void main(String[] args) {
	


		a();
		
	}
	
	static void a() {
		System.out.println("a is Private method.....");
		
	}
	
	public class  A
	{
		public void b()
		{
			AccessModifiers1.a();
		}
	}

}
