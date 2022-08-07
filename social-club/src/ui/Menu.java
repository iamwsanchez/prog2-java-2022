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
			displayOptions();
			option = scan.nextShort();
			switch (option) {
				case 1:
					
					break;
				case 2:
					
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
