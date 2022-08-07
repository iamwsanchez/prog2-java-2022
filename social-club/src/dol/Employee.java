/**
 * 
 */
package dol;

import java.util.Date;

/**
 * @author willj
 *
 */
public class Employee extends Person implements IPerson{
	private String employeeNumber;
	private Date entryDate;
	private String job;
	
	public Employee(String firstName, String middleName, String surName, String secondSurname, String gender,
			Date birthDate) {
		super(firstName, middleName, surName, secondSurname, gender, birthDate);
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String firstName, String middleName, String surName, String secondSurname, String gender,
			Date birthDate, String employeeNumber, Date entryDate, String job) {
		super(firstName, middleName, surName, secondSurname, gender, birthDate);
		this.employeeNumber = employeeNumber;
		this.entryDate = entryDate;
		this.job = job;
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public Date getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public void showDataAsRow() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showDataAsForm() {
		// TODO Auto-generated method stub
		
	}
}
