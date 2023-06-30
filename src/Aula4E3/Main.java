package Aula4E3;

import java.util.ArrayList;
import java.util.List;

public class Main {
	private HamburgerShop hamburgerShop;
	

	public static void main(String[] args) {
		Main main = new Main();
		
		main.run();
		main.hamburgerShop.sellMode();
	}
	
	public void run() {
		Customer customer1 = new Customer("Carlos", "Av. das Flores, 123 - Bairro Felicidade, Cidade Feliz - SP",
				"(11) 98765-4321");
		Customer customer2 = new Customer("Ana", "Rua da Praia, 456 - Bairro Oceano, Cidade Azul - SC",
				"(47) 98765-4321");
		Customer customer3 = new Customer("Pedro", "Av. dos Bosques, 789 - Bairro Floresta, Cidade Verde - RJ",
				"(21) 98765-4321");
		Customer customer4 = new Customer("Maria", "Rua das Montanhas, 1010 - Bairro Serra, Cidade Aventureira - MG",
				"(31) 98765-4321");
		Customer customer5 = new Customer("Laura", "Av. do Sol, 222 - Bairro Verão, Cidade Quente - BA",
				"(71) 98765-4321");
		Customer customer6 = new Customer("Gustavo", "Rua das Estrelas, 333 - Bairro Céu, Cidade Espacial - RS",
				"(51) 98765-4321");

		List<Customer> customers = new ArrayList<>();
		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);
		customers.add(customer4);
		customers.add(customer5);
		customers.add(customer6);

		Product hamburger1 = new Product("Big Tasty", 12.99, "extra cheese");
		Product hamburger2 = new Product("Double Bacon", 10.49, "bacon strips");
		Product hamburger3 = new Product("Classic Cheeseburger", 8.99, "pickles");
		Product hamburger4 = new Product("Spicy Jalapeno", 11.99, "jalapenos");
		Product hamburger5 = new Product("Mushroom Swiss", 9.99, "mushrooms");
		Product hamburger6 = new Product("BBQ Bacon", 12.49, "BBQ sauce");
		Product hamburger7 = new Product("Veggie Burger", 9.99, "avocado");
		Product hamburger8 = new Product("Teriyaki Pineapple", 11.99, "grilled pineapple");
		Product hamburger9 = new Product("Pepperoni Burger", 10.99, "pepperoni slices");
		Product hamburger10 = new Product("Guacamole Burger", 12.49, "guacamole");
		Product hamburger11 = new Product("Blue Cheese Burger", 11.99, "blue cheese dressing");
		Product hamburger12 = new Product("Buffalo Chicken Burger", 10.99, "buffalo sauce");
		Product hamburger13 = new Product("Cheddar Melt", 9.99, "cheddar cheese");
		Product hamburger14 = new Product("Greek Burger", 12.49, "feta cheese");
		Product hamburger15 = new Product("Hawaiian Burger", 11.49, "ham slices");
		Product hamburger16 = new Product("Rodeo Burger", 10.99, "onion rings");
		Product hamburger17 = new Product("Egg Burger", 10.99, "fried egg");
		Product hamburger18 = new Product("Pesto Burger", 12.49, "pesto sauce");
		Product hamburger19 = new Product("Portobello Burger", 11.99, "portobello mushrooms");
		Product hamburger20 = new Product("Southwest Burger", 10.99, "chipotle mayo");

		List<Product> products = new ArrayList<>();
		products.add(hamburger1);
		products.add(hamburger2);
		products.add(hamburger3);
		products.add(hamburger4);
		products.add(hamburger5);
		products.add(hamburger6);
		products.add(hamburger7);
		products.add(hamburger8);
		products.add(hamburger9);
		products.add(hamburger10);
		products.add(hamburger11);
		products.add(hamburger12);
		products.add(hamburger13);
		products.add(hamburger14);
		products.add(hamburger15);
		products.add(hamburger16);
		products.add(hamburger17);
		products.add(hamburger18);
		products.add(hamburger19);
		products.add(hamburger20);

		this.hamburgerShop = new HamburgerShop("BurgerTime", 123456789, customers, products);
	}

	public HamburgerShop getHamburgerShop() {
		return hamburgerShop;
	}
}
