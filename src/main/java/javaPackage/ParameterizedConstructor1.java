package javaPackage;

public class ParameterizedConstructor1 {
	int id;
	String name;
	String adress;

	ParameterizedConstructor1(int id, String name, String adress) {

		this.id = id;
		this.name = name;
		this.adress = adress;
	}

	public void displayInformation() {
		System.out.println(id + " " + name + " " + adress);
	}

	public static void main(String[] args) {
		ParameterizedConstructor1 pc1 = new ParameterizedConstructor1(1, "Vani", "Pune");
		ParameterizedConstructor1 pc2 = new ParameterizedConstructor1(2, "Leela", "UK");

		pc1.displayInformation();
		pc2.displayInformation();

	}

}
