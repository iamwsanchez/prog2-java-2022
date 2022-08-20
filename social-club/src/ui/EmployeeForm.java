package ui;

import java.util.Date;
import java.util.Scanner;

import dol.Employee;
import misc.DateOperator;

public class EmployeeForm {
	private Scanner scan = new Scanner(System.in);
	
	public EmployeeForm() {
		
	}
	
	public Employee catchEmployee() {
		Employee e = new Employee();
		System.out.println("Primer nombre: ");
		e.setFirstName(scan.next());
		
		System.out.println("Segundo nombre: ");
		e.setMiddleName(scan.next());
		
		System.out.println("Primer apellido: ");
		e.setSurName(scan.next());
		
		System.out.println("Segundo apellido: ");
		e.setSecondSurname(scan.next());
		
		System.out.println("Género: ");
		e.setGender(scan.next());
		
		Date date = DateOperator.catchValidDate(scan, "Fecha de nacimiento (dd/MM/yyyy): ");
		e.setBirthDate(date);
		
		System.out.println("Número de empleado: ");
		e.setEmployeeNumber(scan.next());
		
		date = DateOperator.catchValidDate(scan, "Fecha de entrada (dd/MM/yyyy): ");
		e.setEntryDate(date);
		
		System.out.println("Puesto de trabajo: ");
		e.setJob(scan.next());
		
		return e;
	}
}
