package Aula4E2;

import java.util.ArrayList;
import java.util.List;

public class LibraryManager {
	private List<Book> libraryBooks;
	private List<Magazine> libraryMagazine;
	private List<Journal> libraryJournal;

	public LibraryManager() {
		this.libraryBooks = new ArrayList<>();
		this.libraryMagazine = new ArrayList<>();
		this.libraryJournal = new ArrayList<>();
	}

	public void addBook(Book item) {
		this.libraryBooks.add(item);
	}

	public void updateBook(int index, Book item) {
		this.libraryBooks.set(index, item);
	}

	public void removeBook(Book item) {
		this.libraryBooks.remove(item);
	}

	public void addMagazine(Magazine item) {
		this.libraryMagazine.add(item);
	}

	public void updateMagazine(int index, Magazine item) {
		this.libraryMagazine.set(index, item);
	}

	public void removeMagazine(Magazine item) {
		this.libraryMagazine.remove(item);
	}

	public void addJournal(Journal item) {
		this.libraryJournal.add(item);
	}

	public void updateJournal(int index, Journal item) {
		this.libraryJournal.set(index, item);
	}

	public void removeJournal(Journal item) {
		this.libraryJournal.remove(item);
	}
	
	public List<Book> getLibraryBooks() {
		return libraryBooks;
	}

	public List<Magazine> getLibraryMagazine() {
		return libraryMagazine;
	}

	public List<Journal> getLibraryJournal() {
		return libraryJournal;
	}
}
