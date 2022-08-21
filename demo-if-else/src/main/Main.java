package main;

import java.util.Scanner;

import misc.Comparator;

public class Main {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int i, j, k;
		i = 3; j = 5; k=8;
		if(i>j) {
			System.out.println("i es mayor que j.");
		}
		else {
			System.out.println("j es mayor que i.");
		}
		if(i>j && i>k) {
			System.out.println("i es el mayor de todos.");
		}
		else if(j>i && j>k) {
			System.out.println("i es el mayor de todos.");
		}
		else {
			System.out.println("k es el mayor de todos.");
		}
		
		Comparator comp = new Comparator();
		System.out.println("Indica el número 1: ");
		comp.setNumber1(scan.nextInt());
		System.out.println("Indica el número 2: ");
		comp.setNumber2(scan.nextInt());
		System.out.println("Indica el número 3: ");
		comp.setNumber3(scan.nextInt());
		comp.compare();
	}

}
