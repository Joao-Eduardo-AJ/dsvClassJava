package Aula4E3;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class SellMode {

	public SellMode() {
	}

	public void runSellMode(HamburgerShop hamburguerShop) {
		hamburguerShop.getProducts().stream().forEach(product -> {
			System.out.println("| cod: " + product.getClass().hashCode() + " | name: " + product.getName()
					+ " | price: " + product.getPrice() + " |");
			System.out.println("================================================================");
		});
		System.out.println("Escolha o seu hamburguer pelo código");
		try (Scanner scanner = new Scanner(System.in)) {
			int choice = scanner.nextInt();
			Product chosenProdut = null;

			for (Product item : hamburguerShop.getProducts()) {
				if (item instanceof Product && item.getClass().hashCode() == choice) {
					chosenProdut = item;
					break;
				}
			}
			System.out.println("Você comprou o hamburguer " + chosenProdut.getName() + " e ganhou o adicional "
					+ chosenProdut.getAdditional());
			System.out.println("Qual o seu nome?");
			String name = scanner.next();

			List<Customer> customers = hamburguerShop.getCustomers();

			Optional<Customer> customer = customers.stream().filter(item -> item.getName().equals(name)).findFirst();

			if (customer.isEmpty()) {
				System.out.println(
						"Parece que você não está cadastrado no nosso sistema, vamos dar um jeito nisso! qual o seu endereço?");
				String address = scanner.next();

				System.out.println("Está quase acabando! Qual o seu número de telefone?");
				String contact = scanner.next();

				System.out.println("Informe seu email.");
				String email = scanner.next();

				System.out.println("Cadastre sua senha.");
				String password = scanner.next();

				if (!contact.isEmpty() && !address.isEmpty()) {
					Customer newCostumer = new Customer(name, address, contact, email, password);
					hamburguerShop.addCostumer(newCostumer);
					System.out.println("Perfeito! Você foi cadastrado com sucesso!");
				}
			}

			System.out.println("Qual o método de pagamento?");
			String payment = scanner.next();

			System.out.println("certo... Você deseja que o pedido seja entregue? [y / n]");
			String isDelivery = scanner.next();

			boolean delivery = isDelivery.equals("y") ? true : false;

			Request newRequest = new Request("30/06/2023", "sendo preparado", payment, delivery, name);
			hamburguerShop.addRequest(newRequest);

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

			customers = hamburguerShop.getCustomers();

			customer = customers.stream().filter(item -> item.getName().equals(name)).findFirst();

			if (customer.isPresent()) {
				Customer currentCustomer = customer.get();
				long requestNumber = hamburguerShop.getRequests().stream()
						.filter(item -> item.getCustomerName().equals(currentCustomer.getName())).count();
				currentCustomer.setRequests(requestNumber);
				System.out.println("O seu total de pedidos hoje é " + currentCustomer.getRequests());

				System.out.println("Você deseja fazer outro pedido? [y / n]");
				String response = scanner.next();
				if (response.equals("y")) {
					if (currentCustomer.getRequests() >= 50) {
						System.out.println(
								"Você atingiu o máximo de pedidos diários, por favor aguarde o dia de amanhã.");
					} else {
						runSellMode(hamburguerShop);
					}
				} else {
					System.out.println("Você gostaria de acessar seu ambiente de cliente? [y / n]");
					String res = scanner.next();

					if (res.equals("y")) {
						List<Customer> customerList = hamburguerShop.getCustomers();

						Optional<Customer> client = customerList.stream().filter(item -> item.getName().equals(name))
								.findFirst();

						Customer currentClient = client.get();

						CustomerAccess customerAccess = new CustomerAccess();
						customerAccess.login(currentClient.getEmail(), currentClient.getPassword(), hamburguerShop);
					} else {
						System.out.println("Fluxo finalizado, obrigado por comprar na " + hamburguerShop.getName());
					}
				}
			}

		}
	}
}
