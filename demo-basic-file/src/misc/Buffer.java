package misc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Buffer {
	public void write() {
		String fileName = "ArchivoConBuffer.txt";
		File file = new File(fileName);

		if (file.exists()) {
			System.out.println("El archivo " + fileName + " ya existe");	
		}
		else {
		  try{
		     BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
				
		     // Escribimos 10 filas
		     for (int x=0;x<10;x++)
		       bw.write("Fila numero " + x + "\n");

		     // Hay que cerrar el archivo
		     bw.close();
		  } catch (IOException ioe){
		     ioe.printStackTrace();
		  }
		}

	}
	
	public void read() {
		String strCurrentLine;
		try{ 
			BufferedReader br = new BufferedReader(new FileReader("ArchivoConBuffer.txt"));
			   while ((strCurrentLine = br.readLine()) != null) {

				    System.out.println(strCurrentLine);
				   }
		} catch (IOException ioe){ 
		 ioe.printStackTrace();
		}
	}
}
