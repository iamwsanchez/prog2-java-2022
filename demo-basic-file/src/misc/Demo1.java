package misc;

import java.io.File;
import java.io.IOException;

public class Demo1 {
	public void crete() {
	    try {
	        File myObj = new File("Archivo.txt");
	        if (myObj.createNewFile()) {
	          System.out.println("Archivo: " + myObj.getName());
	        } else {
	          System.out.println("El archivo ya existe.");
	        }
	      } catch (IOException e) {
	        System.out.println("Ocurrió un error.");
	        e.printStackTrace();
	      }
	}
	public void getFileInfo () {
	    File myObj = new File("Archivo.txt");
	    if (myObj.exists()) {
	      System.out.println("Nombre de archivo: " + myObj.getName());
	      System.out.println("Ruta absoluta: " + myObj.getAbsolutePath());
	      System.out.println("Editable: " + myObj.canWrite());
	      System.out.println("Legible: " + myObj.canRead());
	      System.out.println("Tamaño de archivo en bytes: " + myObj.length());
	    } else {
	      System.out.println("El archivo no existe.");
	    }
	}
	public void deleteFile() {
	    File myObj = new File("Archivo.txt"); 
	    if (myObj.delete()) { 
	      System.out.println("Archivo borrado: " + myObj.getName());
	    } else {
	      System.out.println("Ha fallado la eliminación del archivo.");
	    } 
	}
}
