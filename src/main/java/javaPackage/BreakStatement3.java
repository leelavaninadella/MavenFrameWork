package javaPackage;

public class BreakStatement3 {

	public static void main(String[] args) {
		
		int i=1;
		
		while(i<=10)
		{
			if(i==5)
				break;
			System.out.println(i);
			i++;
		}
		System.out.println("Control came out from the loop.....");

	}

}
