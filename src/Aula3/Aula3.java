package Aula3;

public class Aula3 {
	public static void main(String[] args) {
		Vehicle corsa = new Car("vermelho", 4, "carroceria", 111111111);
		Vehicle mercedez1113 = new Truck("Azul", 8, "carroceria", 222222222);
		Vehicle cg160 = new Bike("Verde", 2, "carroceria", 333333333);
	
		System.out.println(corsa.getChassis());
		System.out.println(mercedez1113.getChassis());
		System.out.println(cg160.getChassis());
	}
}
