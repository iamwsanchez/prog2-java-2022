package dol;

import java.util.Date;

import misc.DateOperator;

public class Member extends Person implements IPerson{

	private String membershipNumber;
	private Date memberSince;
	private Date membershipIssuance;
	private Date membershipExpiration;
	
	public Member() {
		
	}
	
	public Member(String firstName, String middleName, String surName, String secondSurname, String gender,
			Date birthDate) {
		super(firstName, middleName, surName, secondSurname, gender, birthDate);
		// TODO Auto-generated constructor stub
	}

	
	public Member(String firstName, String middleName, String surName, String secondSurname, String gender,
			Date birthDate, String membershipNumber, Date memberSince, Date membershipIssuance,
			Date membershipExpiration) {
		super(firstName, middleName, surName, secondSurname, gender, birthDate);
		this.membershipNumber = membershipNumber;
		this.memberSince = memberSince;
		this.membershipIssuance = membershipIssuance;
		this.membershipExpiration = membershipExpiration;
	}


	public String getMembershipNumber() {
		return membershipNumber;
	}

	public void setMembershipNumber(String membershipNumber) {
		this.membershipNumber = membershipNumber;
	}

	public Date getMemberSince() {
		return memberSince;
	}

	public void setMemberSince(Date memberSince) {
		this.memberSince = memberSince;
	}

	public Date getMembershipIssuance() {
		return membershipIssuance;
	}

	public void setMembershipIssuance(Date membershipIssuance) {
		this.membershipIssuance = membershipIssuance;
	}

	public Date getMembershipExpiration() {
		membershipExpiration = DateOperator.addYears(membershipIssuance, 2);
		return membershipExpiration;
	}


	@Override
	public void showDataAsRow() {
		System.out.printf("\n%s %s %s %s %s %s %s %d %s %s %s\n",
				getMembershipNumber(),
				getFirstName(), 
				getMiddleName(),
				getSurName(),
				getSecondSurname(),
				getGender(),
				DateOperator.dateToString(getBirthDate(), "dd/MM/yyyy"),
				getAge(),
				DateOperator.dateToString(getMemberSince(), "dd/MM/yyyy"),
				DateOperator.dateToString(getMembershipIssuance(), "dd/MM/yyyy"),
				DateOperator.dateToString(getMembershipExpiration(), "dd/MM/yyyy")
			);
		System.out.println("_______________________________________________________________________________________");
		
	}


	@Override
	public void showDataAsForm() {
		System.out.printf("\nNúmero de membresía: %s", getMembershipNumber());
		System.out.printf("\nPrimer nombre: %s", getFirstName());
		System.out.printf("\nSegundo nombre: %s", getMiddleName());
		System.out.printf("\nPrimer apellido: %s", getSurName());
		System.out.printf("\nSegundo apellido: %s", getSecondSurname());
		System.out.printf("\nGénero: %s", getGender());
		System.out.printf("\nFecha de nacimiento: %s", getBirthDate());
		System.out.printf("\nEdad: %s", getAge());
		System.out.printf("\nMienbro desde: %s", getMemberSince());
		System.out.printf("\nFecha de emisión de membresía: %s", getMembershipIssuance());
		System.out.printf("\nFecha de expiración de membresía: %s", DateOperator.dateToString(getMembershipExpiration(), "dd/MM/yyyy"));
	}


}
