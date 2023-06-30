package Aula4E3;

public class Product {
	private String name;
	private double price;
	private String additional;
	private int maxRequests = 50;

	public Product(String name, double price, String additional) {
		this.name = name;
		this.price = price;
		this.additional = additional;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAdditional() {
		return additional;
	}

	public void setAdditional(String additionals) {
		this.additional = additionals;
	}
	
	public double getMaxRequests() {
		return maxRequests;
	}
}
