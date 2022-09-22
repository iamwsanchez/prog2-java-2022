package ui;

import java.util.Scanner;

import dol.Book;

public class BookForm {
	Scanner scan;
	Book book;
	public BookForm(Scanner scan) {
		super();
		this.scan = scan;
	}
	public BookForm(Book book) {
		super();
		this.book = book;
	}
	public Book catchBook() {
		Book b = new Book();
		System.out.println("Título: ");
		b.setTitle(scan.next());
		
		System.out.println("Autor: ");
		b.setAuthor(scan.next());
		
		return b;
	}
	
	public void showBook() {
		System.out.printf("Título: %s\n", book.getTitle());
		System.out.printf("Autor: %s\n", book.getAuthor());
		
	}
}
