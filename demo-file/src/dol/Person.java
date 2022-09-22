package dol;

import java.io.Serializable;
import java.util.Date;
import misc.DateUtil;

public class Person  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -9084317113443864281L;
	private String firstName;
	private String middleName;
	private String surName;
	private String secondSurname;
	private String gender;
	private Date birthDate;
	
	public Person() {
		
	}

	public Person(String firstName, String middleName, String surName, String secondSurname, String gender,
			Date birthDate) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.surName = surName;
		this.secondSurname = secondSurname;
		this.gender = gender;
		this.birthDate = birthDate;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getSecondSurname() {
		return secondSurname;
	}

	public void setSecondSurname(String secondSurname) {
		this.secondSurname = secondSurname;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return DateUtil.getAge(birthDate);
	}
	
	
}
