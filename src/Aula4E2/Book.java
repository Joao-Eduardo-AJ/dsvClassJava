package Aula4E2;

import java.util.List;

public class Book extends ReadClass {
	private String publishingCompany;
	private List<String> authors;

	public Book(String title, String publishDate, double price, List<String> authors, String publishingCompany) {
		super(title, publishDate, price);
		this.authors = authors;
		this.publishingCompany = publishingCompany;
	}

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	public String getPublishingCompany() {
		return publishingCompany;
	}

	public void setPublishingCompany(String publishingCompany) {
		this.publishingCompany = publishingCompany;
	}
}
