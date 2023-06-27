package Aula3;

public class Bike extends Vehicle {
	public Bike(String color, int whells, String bodywork, int chassis) {
		super(color, whells, bodywork, chassis);
	};

	public void sellBike() {
		System.out.println("Vendeu a moto");
	};
}
