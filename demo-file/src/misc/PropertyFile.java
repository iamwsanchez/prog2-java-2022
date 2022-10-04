package misc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PropertyFile {    
    Properties properties;
    boolean fileExists;
    
    public PropertyFile(){
        properties = new Properties();                     
    }
    public void open(){
        try {
            File f = new File("config.properties");
            if (f.isFile() && f.canRead()) {                
                InputStream input = new FileInputStream("config.properties");
                properties.load(input);
                input.close();  
                fileExists=true;
            }
            else
            {
                fileExists=false;
            }
        } 
        catch (FileNotFoundException ex) {  
            Logger.getLogger(PropertyFile.class.getName()).log(Level.SEVERE, "PropertyFile", ex);
        } 
        catch (IOException ex) {
            Logger.getLogger(PropertyFile.class.getName()).log(Level.SEVERE, "PropertyFile", ex);
        }  
    }

    public boolean isFileExists() {
        return fileExists;
    }
    
    public String getProperty(String PropertyName){  
        String PropertyValue;
        try{
            PropertyValue = properties.getProperty(PropertyName);
        }
        catch(Exception ex){
            PropertyValue= "";
        }
        if(PropertyValue==null)
            PropertyValue = "";
        return PropertyValue;
    }
    public void setProperty(String PropertyName,String PropertyValue)
    {
        properties.setProperty(PropertyName, PropertyValue);
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
            Logger.getLogger(PropertyFile.class.getName()).log(Level.SEVERE, "PropertyFile", ex);
        }
        return r;
    }   
}
