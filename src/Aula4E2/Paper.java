package Aula4E2;

import java.util.List;

public class Paper {
	private String title;
	private String text;
	private List<String> authors;

	public Paper(String title, String text, List<String> authors) {
		this.title = title;
		this.text = text;
		this.authors = authors;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
}
