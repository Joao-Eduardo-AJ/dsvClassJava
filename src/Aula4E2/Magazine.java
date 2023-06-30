package Aula4E2;

import java.util.List;

public class Magazine extends ReadClass {
	private String publishingCompany;
	private int editionNumber;
	private List<Article> articles;

	public Magazine(String title, String publishDate, double price, String publishingCompany, int editionNumber) {
		super(title, publishDate, price);
		this.publishingCompany = publishingCompany;
		this.editionNumber = editionNumber;
	}

	public void addNewArticle(String title, String publishingCompany, List<String> authors) {
		Article article = new Article(title, publishingCompany, authors);
		this.articles.add(article);
	}

	public void removeArticle(Article article) {
		this.articles.remove(article);
	}

	public String getPublishingCompany() {
		return publishingCompany;
	}

	public void setPublishingCompany(String publishingCompany) {
		this.publishingCompany = publishingCompany;
	}

	public int getEditionNumber() {
		return editionNumber;
	}

	public void setEditionNumber(int editionNumber) {
		this.editionNumber = editionNumber;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
}
