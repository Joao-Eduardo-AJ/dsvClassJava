package Aula3;

public class Car extends Vehicle {
	public Car(String color, int whells, String bodywork, int chassis) {
		super(color, whells, bodywork, chassis);
	};

	public void sellCar() {
		System.out.println("Vendeu o carro");
	}
}
