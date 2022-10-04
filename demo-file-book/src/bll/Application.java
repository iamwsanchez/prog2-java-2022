package bll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dal.BookDal;
import dol.Book;
import ui.BookForm;

public class Application {
	private Scanner scan;
	private List<Book> books;
	private String pathToSave;
	private String fileName;

	public Application() {
		scan = new Scanner(System.in);
		fileName = "";
		books = new ArrayList<Book>();
	}
	public Application(Scanner scanner) {
		scan = scanner;
		fileName = "";
		books = new ArrayList<Book>();
	}
	
	public String getPathToSave() {
		return pathToSave;
	}
	public void setPathToSave(String pathToSave) {
		this.pathToSave = pathToSave;
	}
	
	public void displayOptions() {
		System.out.println("Gestionar libros");
		System.out.println("1. Agregar");
		System.out.println("2. Guardar");
		System.out.println("3. Abrir");
		System.out.println("4. Salir");
	}
	
	public void show() {
		short option =0;
		do {
			System.out.println();
			displayOptions();
			System.out.println();
			option = scan.nextShort();
			switch(option) {
				case 1:
					add();
					break;
				case 2:
					save();
					break;
				case 3:
					open();
					break;
				case 4:
					System.exit(0);
					break;
				default:
					System.out.println("Opción no válida");
					break;
			}
		}while(option!=4);
	}
	
	private void add() {
		BookForm bf = new BookForm(scan);
		books.add(bf.catchBook());
	}
	
	public void save() {

		BookDal bd = new BookDal();
			
		bd.setFilePath(pathToSave);
		
		while(fileName.length()==0) {			
			System.out.println("Por favor indica el nombre del archivo: ");		
			fileName = scan.next();
		}
		
		bd.setFileName(fileName);
		
		bd.setBooks(books);
		
		bd.saveList();
	}
	
	public void open() {
		System.out.println("Por favor indica el nombre del archivo a abrir: ");
		fileName = scan.next();
		String filePath = pathToSave + "\\" + fileName;
		BookDal bd = new BookDal();
		bd.setFilePath(filePath);
		books = bd.openList();
		
		BookForm bf = new BookForm(books);
		bf.showBooks();
	}
}
