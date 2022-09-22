package main;

import java.util.Scanner;

import misc.ScannerUtil;

public class Main {
//ArithmeticException
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		ScannerUtil scanu  = new ScannerUtil();
		System.out.println("Indica el dividendo: ");
		int i = scan.nextInt();
		int j = scanu.catchValidDivisor();
			try {
				float k = i/j;
				System.out.printf("El resultado %f\n", k);
			}
			catch(ArithmeticException ex ) {
				System.out.println(ex.getMessage());
			}
			finally {
				System.out.println("El programa terminó.");
			}

	}

}
