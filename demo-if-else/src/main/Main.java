package main;

import java.util.Scanner;

import misc.Comparator;

public class Main {


	public static void main(String[] args) {
		int i, j = 55, k = 19;
		String userName = "William";
		Scanner scan = new Scanner(System.in);
		i=10;
		/*if(i>j) {
			//System.out.println("i es mayor");
			System.out.printf("Usuario %s, %d es mayor que %d",userName,i,j);
		}
		else {
			System.out.println("j es mayor");
		}*/
		
		if(i>j && i>k) {
			System.out.printf("Usuario %s, %d es el número mayor.",userName,i);
		}
		else if(j>i && j>k) {
			System.out.printf("Usuario %s, %d es el número mayor.",userName,j);
		}
		else {
			System.out.printf("Usuario %s, %d es el número mayor.",userName,k);
		}
		System.out.println();
		Comparator c = new Comparator();
		System.out.println("Indica el número 1: ");
		c.setNumber1(scan.nextInt());
		System.out.println("Indica el número 2: ");
		c.setNumber2(scan.nextInt());
		System.out.println("Indica el número 3: ");
		c.setNumber3(scan.nextInt());
		c.compare();
		
		
	}

}

