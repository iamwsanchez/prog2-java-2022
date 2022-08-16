package ui;

import java.util.Date;
import java.util.Scanner;

import bll.Application;
import dol.Employee;
import misc.DateOperator;

public class EmployeeMenu implements IMenu{
	private Scanner scan = new Scanner(System.in);
	@Override
	public void displayOptions() {
		System.out.println("Gestión de club social > Empleados");
		System.out.println("1. Agregar");
		System.out.println("2. Mostrar empleados");
		System.out.println("3. Volver");
		
	}

	@Override
	public void show() {
		short option = 0;
		Menu menu = new Menu();
		
		do {
			System.out.println();
			displayOptions();
			System.out.println();
			option = scan.nextShort();
			switch (option) {
				case 1:
					catchEmployee();
					break;
				case 2:
					Application.showEmployeesAsTable();
					break;
				case 3:
					menu.show();
					break;
				default:
					System.out.println("Opción no válida.");
					break;
			}
		}while(option!=3);
		
	}
	private void catchEmployee() {
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
		
		Application.addEmployee(e);
	}

}
