package javaPackage;

public class ChildClass extends ParentClass {
	
	public void eat()
	{
		System.out.println("Dog is eationg");
	}
	public void bark()
	{
		System.out.println("I am barking");
	}
	
	public void roar()
	{
		System.out.println("Lion is roaring");
	}

	public static void main(String[] args) {
		ParentClass objp = new ChildClass();
		
		objp.eat();
		objp.bark();
		
	}
}
