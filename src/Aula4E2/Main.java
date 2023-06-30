package Aula4E2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

	private ItemListing listing = new ItemListing();

	public static void main(String[] args) {
		Main main = new Main();
		SellMode sellLead1 = new SellMode(true, main.listing.getLibraryItems(), main.listing);

		main.run();
		try {
			sellLead1.sellMagazine();
		} catch (Exception e) {
			e.printStackTrace();
		}
		main.listing.listMagazines();
	}

	public void run() {
		List<String> authors = Arrays.asList("J.K. Rowling", "C.S. Lewis", "Machado de Assis", "George Orwell",
				"J.R.R. Tolkien");
		String publishingCompany = "Editora Fictícia";
		List<String> bookTitles = Arrays.asList("Harry Potter e a Pedra Filosofal",
				"As Crônicas de Nárnia: O Leão, a Feiticeira e o Guarda-Roupa", "Dom Casmurro",
				"A Revolução dos Bichos", "O Senhor dos Anéis: A Sociedade do Anel");

		float basePrice = 30.0f;
		for (int i = 0; i < 5; i++) {
			String title = bookTitles.get(i);
			List<String> selectedAuthors = new ArrayList<>();
			selectedAuthors.add(authors.get(i));
			constructNewBook(title, "01/01/2023", basePrice + (i * 5), selectedAuthors, publishingCompany);
		}

		String magazinePublishingCompany = "Editora Fictícia de Revistas";
		List<String> magazineTitles = Arrays.asList("Revista A", "Revista B", "Revista C", "Revista D", "Revista E");
		Random random = new Random();
		double baseMagazinePrice = 10.0;
		for (int i = 0; i < 5; i++) {
			String title = magazineTitles.get(i);
			constructNewMagazine(title, "01/01/2023", baseMagazinePrice + (i * 2), random.nextInt(100), magazinePublishingCompany);
		}

		List<String> newspaperTitles = Arrays.asList("Jornal X", "Jornal Y", "Jornal Z", "Jornal W", "Jornal Q");
		double baseNewspaperPrice = 2.0;
		for (int i = 0; i < 5; i++) {
			String title = newspaperTitles.get(i);
			constructNewJournal(title, "01/01/2023", baseNewspaperPrice);
		}
	}

	public void constructNewBook(String title, String publishDate, double price, List<String> authors,
			String publishingCompany) {
		Book book = new Book(title, publishDate, price, authors, publishingCompany);
		listing.getLibraryItems().addBook(book);
		listing.addBook(book);
	}

	public void constructNewMagazine(String title, String publishDate, double price, int editionNumber,
			String publishingCompany) {
		Magazine magazine = new Magazine(title, publishDate, price, publishingCompany, editionNumber);
		listing.getLibraryItems().addMagazine(magazine);
		listing.addMagazine(magazine);
	}

	public void constructNewJournal(String title, String publishDate, double price) {
		Journal newspaper = new Journal(title, publishDate, price);
		listing.getLibraryItems().addJournal(newspaper);
		listing.addJournal(newspaper);
	}
}
