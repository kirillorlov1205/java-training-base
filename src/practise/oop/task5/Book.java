package practise.oop.task5;

import java.util.ArrayList;

public class Book {
	private String title;
	private String author;
	private String isbn;
	private static ArrayList<Book> bookCollection = new ArrayList<Book>();

	public Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}

	public static void addBookToCollection(Book book) {
		bookCollection.add(book);
	}

	public static String showBookCollection() {
		return bookCollection.toString();
	}

	@Override
	public String toString() {
		return "Book{" +
				"title='" + title + '\'' +
				", author='" + author + '\'' +
				", isbn='" + isbn + '\'' +
				'}';
	}
}