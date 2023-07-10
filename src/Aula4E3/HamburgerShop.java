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
	
	public void addCostumer(Customer customer) {
		this.customers.add(customer);
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void addProduct(Product product) {
		this.products.add(product);
	}
	
	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public List<Request> getRequests() {
		return requests;
	}
	
	public void addRequest(Request request) {
		this.requests.add(request);
	}

	public void setRequests(List<Request> requests) {
		this.requests = requests;
	}
}
