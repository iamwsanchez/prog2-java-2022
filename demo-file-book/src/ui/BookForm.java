package ui;

import java.util.List;
import java.util.Scanner;

import dol.Book;

public class BookForm {
	private Scanner scan;
	private Book book;
	private List<Book> books;
	
	public BookForm(Scanner scan) {
		super();
		this.scan = scan;
	}
	public BookForm(Book book) {
		super();
		this.book = book;
	}
	
	public BookForm(List<Book> books) {
		super();
		this.books = books;
	}
	
	public Book catchBook() {
		Book b = new Book();
		System.out.println("Título: ");
		scan.nextLine();//Esto es necesario para descartar la nueva linea.
		b.setTitle(scan.nextLine());
		
		System.out.println("Autor: ");
		b.setAuthor(scan.nextLine());
		
		return b;
	}
	
	public void showBook() {
		System.out.printf("Título: %s\n", book.getTitle());
		System.out.printf("Autor: %s\n", book.getAuthor());
		
	}
	
	public void showBooks() {
		for(int i=0; i<books.size(); i++) {
			System.out.printf("%d | %s | %s\n", i+1, books.get(i).getTitle(), books.get(i).getAuthor());
		}
	}
}
