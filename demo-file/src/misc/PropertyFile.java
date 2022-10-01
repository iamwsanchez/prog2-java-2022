package misc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertyFile {
	private Properties properties;
	private boolean isOpen;
	
	public PropertyFile() {
		super();
		properties = new Properties();
		isOpen = open();
	}
	
	public boolean open() {
        try{
        	File file = new File("config.properties");
            ObjectInputStream ois =  new ObjectInputStream(new FileInputStream(file));
            properties.load(ois);
            ois.close();
            return true;
        }
        catch(FileNotFoundException e){
        	//e.printStackTrace();
        } catch (IOException ex) {
        	//ex.printStackTrace();
        }
        return false;
	}
	public String getProperty(String key) {
		try {
			if(isOpen)
				return properties.getProperty(key);
			else
				return "";
		}
		catch(Exception ex) {
			return "";
		}
	}
	public boolean setProperty(String key, String value) {
		try {
			if(isOpen) {
				properties.setProperty(key, value);
				return true;
			}
			else
				return false;
		}
		catch(Exception ex) {
			return false;
		}
	}
	
    public boolean save(){
        boolean r;        
        try {
            try (OutputStream output = new FileOutputStream("config.properties")) {
                properties.store(output, "Configuración");
                output.flush();
            }
            r=true;
        } catch (IOException ex) {
            r=false;
        }
        return r;
    } 
}
