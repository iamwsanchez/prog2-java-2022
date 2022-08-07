package dol;

import java.util.Date;

public class Member extends Person implements IPerson{

	private String membershipNumber;
	private Date memberSince;
	private Date membershipIssuance;
	private Date membershipExpiration;
	
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
		return membershipExpiration;
	}

	public void setMembershipExpiration(Date membershipExpiration) {
		this.membershipExpiration = membershipExpiration;
	}

	@Override
	public void showDataAsRow() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void showDataAsForm() {
		System.out.printf("\nMiembro número: %s", getMembershipNumber());
		System.out.printf("\nPrimer nombre: %s", getFirstName());
		System.out.printf("\nSegundo nombre: %s", getMiddleName());
		System.out.printf("\nPrimer apellido: %s", getSurName());
		System.out.printf("\nPrimer nombre: %s", getSecondSurname());
	}


}
