package ui;

import java.util.Date;
import java.util.List;
import java.util.Scanner;
import dol.Person;
import misc.DateUtil;

public class PersonForm {
	Scanner scan;
	Person person;
	List<Person> persons;
	
	public PersonForm(Scanner scanner) {
		scan = scanner;
	}
	
	public PersonForm(Person p) {
		person = p;
	}
	
	public PersonForm(List<Person> p) {
		persons = p;
	}
	
	public Person catchPerson() {
		Person p = new Person();
		System.out.println("Primer nombre: ");
		p.setFirstName(scan.next());
		
		System.out.println("Segundo nombre: ");
		p.setMiddleName(scan.next());
		
		System.out.println("Primer apellido: ");
		p.setSurName(scan.next());
		
		System.out.println("Segundo apellido: ");
		p.setSecondSurname(scan.next());
		
		System.out.println("Género: ");
		p.setGender(scan.next());
		
		Date date = DateUtil.catchValidDate(scan, "Fecha de nacimiento (dd/MM/yyyy): ");
		p.setBirthDate(date);
			
		return p;
	}
	
	public void showPerson() {
		System.out.printf("Primer nombre: %s\n" , person.getFirstName());		
		
		System.out.printf("Segundo nombre: %s\n", person.getMiddleName());
		
		System.out.printf("Primer apellido: %s\n", person.getSurName());
		
		System.out.printf("Segundo apellido: %s\n", person.getSecondSurname());
		
		System.out.printf("Género: %s\n", person.getGender());
		
		System.out.printf("Fecha de nacimiento: %s\n", DateUtil.dateToString(person.getBirthDate(), "dd/MM/yyyy"));

			
	}
	
	public void showPersons() {
		System.out.println("Indice | Primer nombre | Segundo nombre | Primer apellido | Segundo apellido | Género | Fecha de nacimiento");		
		
		for(int i=0; i<persons.size();i++) {
			System.out.printf("%d | %s | %s | %s | %s | %s\n", i + 1, persons.get(i).getMiddleName(), persons.get(i).getSurName(), persons.get(i).getSecondSurname(), persons.get(i).getGender(), DateUtil.dateToString(persons.get(i).getBirthDate(), "dd/MM/yyyy"));
		}		
	}
	
}
