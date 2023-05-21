package practise.oop.task5;

import java.util.Collection;

public class Book {
	private String title;
	private String author;
	private String isbn;
	private static Collection<Book> bookCollection;

	public Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}

	public static void addBookToCollection(Book book) {
		Book.bookCollection.add(book);
	}

	public static Collection<Book> getBookCollection() {
		return Book.bookCollection;
	}
}