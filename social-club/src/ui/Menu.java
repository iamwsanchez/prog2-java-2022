package ui;
import java.util.Scanner;
public class Menu implements IMenu{
	Scanner scan = new Scanner(System.in);
	@Override
	public void displayOptions() {
		System.out.println("Gestión de club social");
		System.out.println("1. Empleados");
		System.out.println("2. Miembros");
		System.out.println("3. Salir");
	} 
	

	@Override
	public void show() {
		short option = 0;
		do {
			System.out.println();
			displayOptions();
			System.out.println();
			option = scan.nextShort();
			switch (option) {
				case 1:
					EmployeeMenu em = new EmployeeMenu();
					em.show();
					break;
				case 2:
					MemberMenu mm = new MemberMenu();
					mm.show();
					break;
				case 3:
					System.exit(0);
					break;
				default:
					System.out.println("Opción no válida.");
					break;
			}
		}while(option!=3);
		
	}
	
}
