package superKeyword;

public class Dog extends Animal{
	
	public void eat()
	{
		System.out.println("Dog is eating....");
	}
	
	public void bark()
	{
		System.out.println("Dog is barking...");
	}
	
	
	public void work()
	{
		super.eat();//eating..
		eat();//Dog is eating....
		bark();//Dog is barking...
	}

}
