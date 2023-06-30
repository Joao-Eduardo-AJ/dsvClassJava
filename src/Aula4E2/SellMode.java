package Aula4E2;

import java.util.Scanner;

public class SellMode {
	private boolean isStudent;
	private LibraryManager repo;
	private ItemListing bookShelf;

	public SellMode(boolean isStudent, LibraryManager repo, ItemListing bookShelf) {
		this.isStudent = isStudent;
		this.repo = repo;
		this.bookShelf = bookShelf;
	}

	public void sellBook() throws Exception {
		if (repo.getLibraryBooks().isEmpty())
			throw new Exception("Prateleira vazia");
		bookShelf.listEveryBooks();
		System.out.println("Escolha um livro pelo seu código");

		try (Scanner scanner = new Scanner(System.in)) {
			int choice = scanner.nextInt();
			Book chosenBook = null;

			for (Book item : repo.getLibraryBooks()) {
				if (item instanceof Book && item.hashCode() == choice) {
					chosenBook = item;
					double sellPrice = isStudent ? chosenBook.getPrice() / 2 : chosenBook.getPrice();
					System.out.println("O livro vendido foi o " + chosenBook.getTitle() + " por R$" + sellPrice);
					if (isStudent) {
						System.out.println(" por ser estudante");
					}
					System.out.print("");
					repo.removeBook(chosenBook);
					break;
				}
			}
		}
	}

	public void sellMagazine() throws Exception {
		if (repo.getLibraryMagazine().isEmpty())
			throw new Exception("Prateleira vazia");
		bookShelf.listEveryMagazines();
		System.out.println("Escolha uma revista pelo seu código");

		try (Scanner scanner = new Scanner(System.in)) {
			int choice = scanner.nextInt();
			Magazine chosenMagazine = null;

			for (Magazine item : repo.getLibraryMagazine()) {
				if (item instanceof Magazine && item.hashCode() == choice) {
					chosenMagazine = item;
					double sellPrice = isStudent ? chosenMagazine.getPrice() / 2 : chosenMagazine.getPrice();
					System.out.println("A revista vendida foi a " + chosenMagazine.getTitle() + " por R$" + sellPrice);
					if (isStudent) {
						System.out.println(" por ser estudante");
					}
					repo.removeMagazine(chosenMagazine);
					break;
				}
			}
		}
	}

	public void sellJournal() throws Exception {
		if (repo.getLibraryJournal().isEmpty())
			throw new Exception("Prateleira vazia");
		bookShelf.listEveryJournals();
		System.out.println("Escolha um jornal pelo seu código");

		try (Scanner scanner = new Scanner(System.in)) {
			int choice = scanner.nextInt();
			Journal chosenJournal = null;

			for (Journal item : repo.getLibraryJournal()) {
				if (item instanceof Journal && item.hashCode() == choice) {
					chosenJournal = item;
					System.out.println("O jornal vendido foi o " + chosenJournal.getTitle() + " por R$"
							+ chosenJournal.getPrice());
					repo.removeJournal(chosenJournal);
					break;
				}
			}
		}
	}
}
