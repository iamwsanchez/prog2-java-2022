package ui;

import java.util.Scanner;

import bll.Application;

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
					Application.catchEmployee();
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


}
