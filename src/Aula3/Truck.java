package Aula3;

public class Truck extends Vehicle {
	public Truck(String color, int whells, String bodywork, int chassis) {
		super(color, whells, bodywork, chassis);
	};

	public void sellTruck() {
		System.out.println("Vendeu o caminhão");
	}
}
