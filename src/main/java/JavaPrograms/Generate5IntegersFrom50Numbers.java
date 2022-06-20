package JavaPrograms;

public class Generate5IntegersFrom50Numbers {

	public static void main(String[] args) {
		int random ;
		for(int i=0; i<=5 ; i++)
		{
			random = (int) (Math.random()*50);
			System.out.println("Random Numbers : " +random);
			
			
		}
		

	}

}
