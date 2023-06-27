package Aula3;

public class Vehicle {
	private String color;
	private int whells;
	private String bodywork;
	private int chassis;

	public Vehicle(String color, int whells, String bodywork, int chassis) {
		this.setColor(color);
		this.setWhells(whells);
		this.setBodywork(bodywork);
		this.setChassis(chassis);
	}

	public void speedUp() {
		System.out.println("Vrumm");
	}
	
	public void slowDown() {
		System.out.println("Fiuuu");
	}
	
	public void stop() {
		System.out.println("Ram dan dan dan");
	}
	
	public void turnOff() {
		System.out.println("Desligou o carro");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWhells() {
		return whells;
	}

	public void setWhells(int whells) {
		this.whells = whells;
	}

	public String getBodywork() {
		return bodywork;
	}

	public void setBodywork(String bodywork) {
		this.bodywork = bodywork;
	}

	public int getChassis() {
		return chassis;
	}

	public void setChassis(int chassis) {
		this.chassis = chassis;
	}
}
