package misc;

import java.util.Scanner;

public class ScannerUtil {
	private Scanner scanner;
	public ScannerUtil() {
		scanner = new Scanner(System.in);
	}
	public int catchValidDivisor() {
		int output = 0;
		do {
			System.out.println("Indica el divisor: ");
			output = scanner.nextInt();
			if(output==0) {
				System.out.println("El número no puede ser cero.");
			}
		}while(output == 0);
		
		return output;
	}
}
