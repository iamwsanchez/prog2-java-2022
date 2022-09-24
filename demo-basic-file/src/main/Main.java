package main;

import misc.Buffer;
import misc.Demo1;
import misc.Writer;

public class Main {

	public static void main(String[] args) {
		System.out.println("Ejemplo de uso de file");
		Demo1 dfile = new Demo1();
		dfile.crete();
		dfile.getFileInfo();
		dfile.deleteFile();
		
		System.out.println();
		System.out.println("Ejemplo de uso de writer");
		Writer writer = new Writer();
		writer.writeFile();
		
		System.out.println();
		System.out.println("Ejemplo de uso de buffer");
		Buffer buffer = new Buffer();
		buffer.write();
		buffer.read();
		
		System.exit(0);
	}

}
