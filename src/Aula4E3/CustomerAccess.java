package Aula4E3;

import java.util.Optional;
import java.util.Scanner;

public class CustomerAccess {
	public CustomerAccess() {}
	
	public void login(String email, String password, HamburgerShop hamburgerShop) {
		Optional<Customer> customer = hamburgerShop.getCustomers().stream().filter(item -> item.getEmail().equals(email) && item.getPassword().equals(password)).findFirst();
		if(customer.isPresent()) {
			System.out.println("Login bem sucedido, você pode acompanhar ou cancelar seu pedido, além de alterar seu cadastro, o que você gostaria de fazer?");
			System.out.println("[cancelar, acompanhar, alterar]");
			Customer currentCustomer = customer.get();
			
			try (Scanner scanner = new Scanner(System.in)) {
				String response = scanner.next();
				if (response.equals("cancelar")) {
					currentCustomer.setRequests(0);
				} else if (response.equals("alterar")) {
					System.out.println("Informe o novo email");
					String newEmail = scanner.next();
					currentCustomer.setEmail(newEmail);
					
					System.out.println("Informe a nova senha");
					String newPassword = scanner.next();
					currentCustomer.setEmail(newPassword);
					
					System.out.println("Seus dados foram atualizados");
				} else {
					System.out.println("Você tem um total de " + currentCustomer.getRequests() + " pedidos hoje.");
				}
			}
		}
	}
	
}
