package main;

import java.util.Scanner;

import misc.Comparator;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<=10; i++) {
			System.out.printf("%d ", i);
		}
		
		int [] numbers;
		System.out.println();
		System.out.println("¿Cuantos números proporcionarás?");
		int n = scan.nextInt();
		numbers = new int[n];
		for(int i=0;i<n;i++) {
			System.out.printf("Indica número[%d]: ", i+1);
			numbers[i] = scan.nextInt();
		}
		System.out.println();
		System.out.println("Los números que indicaste son: ");
		for(int i=0;i<n;i++) {
			System.out.printf("[%d] = %d\n", i+1, numbers[i]);
		}
		
		Comparator comp = new Comparator();
		comp.setNumbers(numbers);
		comp.compare();
	}

}
