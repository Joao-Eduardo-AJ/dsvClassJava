package Aula4E2;

import java.util.List;

public class ItemListing extends LibraryManager {
	private LibraryManager libraryItems;
	
	public ItemListing() {
		super();
		this.libraryItems = new LibraryManager();
	}

	public void listBooks() {
		List<Book> bookList = libraryItems.getLibraryBooks();
		System.out.println("========== Livros à venda ==========");
		
		bookList.stream().forEach(item -> {
			System.out.println("| cod: " + item.hashCode() + " | " + "Type: " + item.getClass().getSimpleName() + " | " + "Title: " + item.getTitle() + " |");
			System.out.println("===============================================================================================================");
		}); 
	}
	
	public void listMagazines() {
		List<Magazine> magazineList = libraryItems.getLibraryMagazine();
		System.out.println("========== Revistas à venda ==========");
		
		magazineList.stream().forEach(item -> {
			System.out.println("| cod: " + item.hashCode() + " | " + "Type: " + item.getClass().getSimpleName() + " | " + "Title: " + item.getTitle() + " |");
			System.out.println("===============================================================================================================");
		}); 
	}
	
	public void listJournals() {
		List<Journal> journalList = libraryItems.getLibraryJournal();
		System.out.println("========== Jornais à venda ==========");
		
		journalList.stream().forEach(item -> {
			System.out.println("| cod: " + item.hashCode() + " | " + "Type: " + item.getClass().getSimpleName() + " | " + "Title: " + item.getTitle() + " |");
			System.out.println("===============================================================================================================");
		}); 
	}

	public void listEveryBooks() {
		List<Book> bookList = libraryItems.getLibraryBooks();
		System.out.println("========== Livros à venda ==========");
		
		bookList.stream().forEach(item -> {
			System.out.println("| cod: " + item.hashCode() + " | Type: " + item.getClass().getSimpleName() + " | Title: " + item.getTitle() + " | Price: R$" + item.getPrice() + " | Publish date: " + item.getPublishDate() + " | Publishing company: " + item.getPublishingCompany() + " | Autores: " + item.getAuthors() + " |");
			System.out.println("===============================================================================================================");
		}); 
	}

	public void listEveryMagazines() {
		List<Magazine> magazineList = libraryItems.getLibraryMagazine();
		System.out.println("========== Revistas à venda ==========");
		
		magazineList.stream().forEach(item -> {
			System.out.println("| cod: " + item.hashCode() + " | Type: " + item.getClass().getSimpleName() + " | Title: " + item.getTitle() + " | Price: R$" + item.getPrice() + " | Publish date: " + item.getPublishDate() + " | Publishing company: " + item.getPublishingCompany() + " |");
			System.out.println("===============================================================================================================");
		}); 
	}
	
	public void listEveryJournals() {
		List<Journal> journalList = libraryItems.getLibraryJournal();
		System.out.println("========== Jornais à venda ==========");
		
		journalList.stream().forEach(item -> {
			System.out.println("| cod: " + item.hashCode() + " | Type: " + item.getClass().getSimpleName() + " | Title: " + item.getTitle() + " | Price: R$" + item.getPrice() + " | Publish date: " + item.getPublishDate() + " |");
			System.out.println("===============================================================================================================");
		}); 
	}

	public LibraryManager getLibraryItems() {
		return libraryItems;
	}
}
