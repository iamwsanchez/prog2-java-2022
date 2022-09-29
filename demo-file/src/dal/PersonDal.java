package dal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import dol.Person;

public class PersonDal {
	private Person person;
	private List<Person> persons;
	private String filePath;
	private String fileName;
	public PersonDal() {
		super();
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public List<Person> getPersons() {
	    return persons;
	}
	public void setPersons(List<Person> persons) {
	    this.persons = persons;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public void save() {
		if(fileName.trim().length()==0) {
			fileName = person.getFirstName().trim() + person.getSurName().trim() + ".dat";
		}
		
		File file = new File(filePath + "\\" + fileName);

        ObjectOutputStream w;
		try {
			w = new ObjectOutputStream(new FileOutputStream(file));
	        w.writeObject(getPerson());
	        w.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 

	}
	
	public Person open() {
        try{
        	File file = new File(filePath);
            ObjectInputStream ois =  new ObjectInputStream(new FileInputStream(file));
            Person p = (Person)ois.readObject();
            ois.close();
            return p;
        }
        catch(FileNotFoundException e){
        	e.printStackTrace();
        } catch (IOException | ClassNotFoundException ex) {
        	ex.printStackTrace();
        }
        return null;
	}
	
	public void saveList() {

	    File file = new File(filePath + "\\" + fileName);

	    ObjectOutputStream w;
	    try {
	        w = new ObjectOutputStream(new FileOutputStream(file));
	        w.writeObject(getPersons());
	        w.flush();
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    } catch (IOException e) {
	        e.printStackTrace();
	    } 

	}

	public List<Person> openList() {
	    try{
	        File file = new File(filePath);
	        ObjectInputStream ois =  new ObjectInputStream(new FileInputStream(file));
	        List<Person> persons = (List<Person>)ois.readObject();
	        ois.close();
	        return persons;
	    }
	    catch(FileNotFoundException e){
	        e.printStackTrace();
	    } catch (IOException | ClassNotFoundException ex) {
	        ex.printStackTrace();
	    }
	    return null;
	}
}
