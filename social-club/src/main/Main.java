package main;

import java.util.Scanner;

import bll.Application;
import ui.Menu;

public class Main {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		do {
			System.out.println("Indica el nombre del club: ");
			Application.socialClub.setName(scan.next());
		}while(Application.socialClub.getName()==null || Application.socialClub.getName()=="");
		
		Menu menu = new Menu();
		menu.show();
	}

}
