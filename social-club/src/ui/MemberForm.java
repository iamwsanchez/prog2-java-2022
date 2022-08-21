package ui;

import java.util.Date;
import java.util.Scanner;

import dol.Member;
import misc.DateOperator;

public class MemberForm {
	private Scanner scan = new Scanner(System.in);
	
	public MemberForm() {
		
	}
	public Member catchMember() {
		Member m = new Member();
		System.out.println("Primer nombre: ");
		m.setFirstName(scan.next());
		
		System.out.println("Segundo nombre: ");
		m.setMiddleName(scan.next());
		
		System.out.println("Primer apellido: ");
		m.setSurName(scan.next());
		
		System.out.println("Segundo apellido: ");
		m.setSecondSurname(scan.next());
		
		System.out.println("Género: ");
		m.setGender(scan.next());
		
		Date date = DateOperator.catchValidDate(scan, "Fecha de nacimiento (dd/MM/yyyy): ");
		m.setBirthDate(date);
		
		System.out.println("Número de membresía: ");
		m.setMembershipNumber(scan.next());
		
		date = DateOperator.catchValidDate(scan, "Miembro desde (dd/MM/yyyy): ");
		m.setMemberSince(date);
		
		date = DateOperator.catchValidDate(scan, "Fecha de emisión de membresía (dd/MM/yyyy): ");
		m.setMembershipIssuance(date);
		
		
		return m;
	}
}
