package main;

import java.util.Scanner;

import bll.Application;
import misc.PropertyFile;

public class Main {

	public static void main(String[] args) {
		String pathToSave;
		Scanner scan = new Scanner(System.in);
		PropertyFile myprops = new PropertyFile();
		myprops.open();
		pathToSave = myprops.getProperty("PathToSave");
		while (pathToSave.length()<=0) {
			System.out.println("Por favor indica la ruta donde se guardaran los archivos: ");
			pathToSave = scan.next();
		}
		myprops.setProperty("PathToSave", pathToSave);
		myprops.save();
		Application app = new Application(scan);
		app.setPathToSave(pathToSave);
		app.show();
		
	}

}
