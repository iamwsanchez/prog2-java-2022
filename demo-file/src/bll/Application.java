package bll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dal.PersonDal;
import dol.Person;
import dol.Skill;
import ui.PersonForm;

public class Application {
	private Scanner scan;
	private List<Person> persons;
	private List<Skill> skills;
	private String pathToSave;
	public Application() {
		 scan = new Scanner(System.in);
		 persons = new ArrayList<Person>();
	}
	public Application(Scanner scannner) {
		 scan = scannner;
		 persons = new ArrayList<Person>();
		 initSkills();
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
		System.out.println("4. Agregar habilidad");
		System.out.println("5. Salir");		
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
					displaySkills();
					break;					
				case 5:
					System.exit(0);
					break;
				default:
					System.out.println("Opción no válida.");
					break;
			}
		}while(option!=5);
		
	}
	public void initSkills() {
		 skills = new ArrayList<Skill>();
		 skills.add(new Skill("Developer"));
		 skills.add(new Skill("Database administrator"));
		 skills.add(new Skill("Scrum master"));
	}
	public void displaySkills() {
		System.out.println("Indica el id de la habilidad que deseas agregar");
		for(Skill sk: skills) {
			System.out.printf("%s %s\n", sk.getId().toString(), sk.getName());
		}
		System.out.println("ESTE EJEMPLO NO ESTA COMPLETO");
	}
	public void catchSkill() {
		
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
