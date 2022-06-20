package javaPackage;

public class ParameterizedConstructor {

	 int id;
	 String name;
	 String adress;

	ParameterizedConstructor(int a, String b, String c) {
		id = a;
		name = b;
		adress = c;
	}

	public  void displayInformation() {
		System.out.println(id + " " + name + " " + adress);
	}

	public static void main(String[] args) {

		ParameterizedConstructor pc1 = new ParameterizedConstructor(1, "Vani", "Pune");
		ParameterizedConstructor pc2 = new ParameterizedConstructor(2, "Leela", "Luknow");

		pc1.displayInformation();
		pc2.displayInformation(); 

	}

}
