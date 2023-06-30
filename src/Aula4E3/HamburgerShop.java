package Aula4E3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HamburgerShop {
	private String name;
	private int cnpj;

	private List<Customer> customers;
	private List<Product> products;
	private List<Request> requests = new ArrayList<>();

	public HamburgerShop(String name, int cnpj, List<Customer> customers, List<Product> products) {
		this.name = name;
		this.cnpj = cnpj;
		this.customers = customers;
		this.products = products;
	}

	public String getName() {
		return name;
	}

	public int getCnpj() {
		return cnpj;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public void sellMode() {
		this.products.stream().forEach(product -> {
			System.out.println("| cod: " + product.getClass().hashCode() + " | name: " + product.getName()
					+ " | price: " + product.getPrice() + " |");
			System.out.println("================================================================");
		});
		System.out.println("Escolha o seu hamburguer pelo código");
		try (Scanner scanner = new Scanner(System.in)) {
			int choice = scanner.nextInt();
			Product chosenProdut = null;

			for (Product item : products) {
				if (item instanceof Product && item.getClass().hashCode() == choice) {
					chosenProdut = item;
					break;
				}
			}
			System.out.println("Você comprou o hamburguer " + chosenProdut.getName() + " e ganhou o adicional "
					+ chosenProdut.getAdditional());
			System.out.println("Qual o seu nome?");
			String name = scanner.next();

			boolean isRegistered = customers.stream().filter(customer -> customer.getName() == name) != null;
			
			if (isRegistered) {
				System.out.println(
						"Parece que você não está cadastrado no nosso sistema, vamos dar um jeito nisso! qual o seu endereço?");
				String address = scanner.next();
				
				System.out.println("Está quase acabando! Qual o seu número de telefone?");
				String contact = scanner.next();
				
				Customer newCostumer = new Customer(name, address, contact);
				customers.add(newCostumer);

				System.out.println("Perfeito! Você foi cadastrado com sucesso!");
			}

			System.out.println("Qual o método de pagamento?");
			String payment = scanner.next();

			System.out.println("certo... Você deseja que o pedido seja entregue? [y / n]");
			String isDelivery = scanner.next();

			boolean delivery = isDelivery.equals("y") ? true : false;

			Request newRequest = new Request("30/06/2023", "sendo preparado", payment, delivery, name);
			requests.add(newRequest);

			String status = newRequest.getStatus();

			while (!status.equals("concluido")) {
				System.out.println(status);
				System.out.println("(Quando informado 'concluido', o processo termina) Atualizar pedido para: ");
				status = scanner.next();
			}

			if (delivery) {
				System.out.println("Seu pedido foi entregue!");
			} else {
				System.out.println("Você retirou seu pedido!");
			}
		}
	}
}
