package bll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dal.PersonDal;
import dol.Person;
import ui.PersonForm;

public class Application {
	private Scanner scan;
	private List<Person> persons;
	
	public Application() {
		 scan = new Scanner(System.in);
		 persons = new ArrayList<Person>();
	}
	public void displayOptions() {
		System.out.println("Gestionar personas");
		System.out.println("1. Agregar");
		System.out.println("2. Guardar");
		System.out.println("3. Abrir");
		System.out.println("4. Salir");
		
	}

	public void show() {
		short option = 0;
		
		do {
			System.out.println();
			displayOptions();
			System.out.println();
			option = scan.nextShort();
			switch (option) {
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
					System.out.println("Opción no válida.");
					break;
			}
		}while(option!=4);
		
	}
	public void add() {
		PersonForm pf = new PersonForm(scan);
		persons.add(pf.catchPerson());
	}
	public void save() {
		PersonDal pd = new PersonDal();
		
		System.out.println("Por favor indica la ruta para guardar el archivo: ");
		String filePath = scan.next();
		System.out.println("Por favor indica el nombre del archivo: ");
		String fileName = scan.next();
		pd.setPersons(persons);
		pd.setFilePath(filePath);
		pd.setFileName(fileName);
		pd.saveList();
	}
	
	public void open() {	
			
		System.out.println("Por favor indica la ruta del archivo a abrir");
		String filePath = scan.next();
		PersonDal pd = new PersonDal();
		pd.setFilePath(filePath);
		persons = pd.openList();
		PersonForm pf = new PersonForm(persons);
		pf.showPersons();
		
	}

}
