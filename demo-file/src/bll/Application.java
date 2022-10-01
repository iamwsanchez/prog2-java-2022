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
	private String pathToSave;
	public Application() {
		 scan = new Scanner(System.in);
		 persons = new ArrayList<Person>();
	}
	public String getPathToSave() {
		return pathToSave;
	}
	public void setPathToSave(String pathToSave) {
		this.pathToSave = pathToSave;
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
		
		//System.out.println("Por favor indica la ruta para guardar el archivo: ");

		System.out.println("Por favor indica el nombre del archivo: ");
		String fileName = scan.next();
		pd.setPersons(persons);
		pd.setFilePath(pathToSave);
		pd.setFileName(fileName);
		pd.saveList();
	}
	
	public void open() {	
			
		System.out.println("Por favor indica el nombre del archivo a abrir: ");
		String fileName = scan.next();
		String filePath = pathToSave + "\\" + fileName;
		PersonDal pd = new PersonDal();
		pd.setFilePath(filePath);
		persons = pd.openList();
		PersonForm pf = new PersonForm(persons);
		pf.showPersons();
		
	}

}
