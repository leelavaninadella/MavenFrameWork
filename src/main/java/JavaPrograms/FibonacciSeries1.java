package JavaPrograms;

public class FibonacciSeries1 {

	public static void main(String[] args) {
		
		int f1, f2=0, f3=1;
		System.out.print(f2+ " ");

		for(int i=1;i<5; i++)
		{
			System.out.print(f3 + " ");
			f1=f2;
			f2=f3;
			f3=f1+f2;
		}
	}

}
