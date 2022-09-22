package main;

import dol.Gender;
import dol.Person;

public class Main {

	public static void main(String[] args) {
		
		Person person = new Person();
		person.setFirstName("William");
		person.setLastName("Sanchez");
		person.setGender(Gender.MALE);
		
		System.out.print(person.toString());
	}

}

