package bll;

import java.util.Scanner;

import dal.BookDal;
import ui.BookForm;

public class Application {
	private Scanner scan;
	public Application() {
		scan = new Scanner(System.in);
	}
	public void displayOptions() {
		System.out.println("Gestionar libros");
		System.out.println("1. Guardar");
		System.out.println("2. Abrir");
		System.out.println("3. Salir");
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
					save();
					break;
				case 2:
					open();
					break;
				case 3:
					System.exit(0);
					break;
			}
		}while(option!=3);
	}
	
	public void save() {
		BookForm bf = new BookForm(scan);
		BookDal bd = new BookDal();
		bd.setBook(bf.catchBook());
		
		System.out.println("Por favor indica la ruta para guardar el archivo: ");
		bd.setFilePath(scan.next());
		
		System.out.println("Por favor indica el nombre del archivo: ");		
		bd.setFileName(scan.next());
		
		bd.save();
	}
	
	public void open() {
		System.out.println("Por favor indica la ruta del archivo a abrir: ");
		String filePath = scan.next();
		BookDal bd = new BookDal();
		bd.setFilePath(filePath);
		
		BookForm bf = new BookForm(bd.open());
		bf.showBook();
	}
}
