package javaPackage;

public abstract class BreakStatement2 {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++)
		{
			for(int j=0; j<10; j++)
			{
				if(i ==2 & j == 2)
					break;
				System.out.println(i + "   "+ j);
			}
			System.out.println("Control came out from inner Loop....");
			
			
		}
		System.out.println("Control came out from outer Loop.....");

	}

}
