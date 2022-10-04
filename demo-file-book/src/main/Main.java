package main;

import java.util.Scanner;

import bll.Application;
import misc.PropertyFile;

public class Main {

	public static void main(String[] args) {
		PropertyFile props = new PropertyFile();
		String pathToSave = "";
		Scanner scan = new Scanner(System.in);
		Application app = new Application(scan);
		props.open();
		if(props.isFileExists()) {
			pathToSave = props.getProperty("PathToSave");
		}
		while(pathToSave.length()==0) {
			System.out.println("Por favor indica la ruta donde se guardarán los archivos: ");
			pathToSave = scan.next();
		}
		app.setPathToSave(pathToSave);
		props.setPropertyt("PathToSave", pathToSave);
		props.save();
		app.show();
	}

}
