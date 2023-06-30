package Aula4E2;

public class ReadClass {
	private double price;
	private String title;
	private String publishDate;

	public ReadClass(String title, String publishDate, double price) {
		this.price = price;
		this.title = title;
		this.publishDate = publishDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}
}
