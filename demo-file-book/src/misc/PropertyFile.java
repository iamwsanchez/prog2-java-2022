package misc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.util.logging.Logger;
import java.util.logging.Level;

public class PropertyFile {
	private Properties properties;
	private boolean fileExists;
	public PropertyFile() {
		super();
		properties = new Properties();
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	public boolean isFileExists() {
		return fileExists;
	}
	public void setFileExists(boolean fileExists) {
		this.fileExists = fileExists;
	}
	public void open() {
		try {
			File file = new File("config.properties");
			if(file.isFile() && file.canRead()) {
				InputStream input = new FileInputStream("config.properties");
				properties.load(input);
				input.close();
				fileExists = true;
			}
			else {
				fileExists = false;
			}
		}
		catch(IOException ex ) {
			Logger.getLogger(PropertyFile.class.getName()).log(Level.SEVERE, "PropertyFile", ex);
		}
	}
	public String getProperty(String key) {
		return properties.getProperty(key);
	}
	public void setPropertyt(String key, String value) {
		properties.setProperty(key, value);
	}
	public boolean save() {
		boolean response;
		try {
			OutputStream output = new FileOutputStream("config.properties");
			properties.store(output, "Configuración");
			output.flush();
			response = true;
		}
		catch(IOException ex ) {
			response = false;
			Logger.getLogger(PropertyFile.class.getName()).log(Level.SEVERE, "PropertyFile", ex);
		}
		
		return response;
	}
}
