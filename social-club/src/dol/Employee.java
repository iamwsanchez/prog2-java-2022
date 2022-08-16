/**
 * 
 */
package dol;

import java.util.Date;

import misc.DateOperator;

/**
 * @author willj
 *
 */
public class Employee extends Person implements IPerson{
	private String employeeNumber;
	private Date entryDate;
	private String job;
	public Employee() {
		super();
	}
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
		System.out.printf("\n%s %s %s %s %s %s %s %d %s %s\n",
				getEmployeeNumber(),
				getFirstName(), 
				getMiddleName(),
				getSurName(),
				getSecondSurname(),
				getGender(),
				DateOperator.dateToString(getBirthDate(), "dd/MM/yyyy"),
				getAge(),
				DateOperator.dateToString(getEntryDate(), "dd/MM/yyyy"),
				getJob()
				);
		System.out.println("_______________________________________________________________________________________");
		
	}

	@Override
	public void showDataAsForm() {
		System.out.println();
				System.out.printf("\n Numero de empleado: %s\n Primer nombre: %s\n Segundo nombre: %s\n Primer apellido: %s\n Segundo apellido: %s\n Género: %s\n Fecha de nacimiento: %s\n Edad: %d\n Fecha de entrada: %s\n Puesto de trabajo: %s\n",
				getEmployeeNumber(),
				getFirstName(), 
				getMiddleName(),
				getSurName(),
				getSecondSurname(),
				getGender(),
				DateOperator.dateToString(getBirthDate(), "dd/MM/yyyy"),
				getAge(),
				DateOperator.dateToString(getEntryDate(), "dd/MM/yyyy"),
				getJob()
				);
		System.out.println();
	}
}
