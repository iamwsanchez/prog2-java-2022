package misc;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {
	public void writeFile() {
	    try {
	        FileWriter myWriter = new FileWriter("Archivo2.txt");
	        myWriter.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam vestibulum mi non felis pretium volutpat. Morbi sodales, nisl id tempor vulputate, nisl mi auctor sem, quis tempus massa elit convallis urna. Donec iaculis elementum neque nec consequat. Ut iaculis cursus sapien. In quis sapien suscipit, gravida leo sit amet, suscipit mi. Integer gravida vestibulum mauris ut ornare. Phasellus varius libero a iaculis gravida. Nullam tristique nunc et purus volutpat ultricies. Nam in ornare mauris. Curabitur ac porta ligula, nec lobortis diam. Pellentesque ut magna a mauris molestie rutrum sed ac purus. ");
	        myWriter.close();
	        System.out.println("Archivo escrito exitosamente.");
	      } catch (IOException e) {
	        System.out.println("Ha ocurrido un error.");
	        e.printStackTrace();
	      }
	}
}
