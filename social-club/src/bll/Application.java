package bll;

import dol.Club;
import dol.Employee;
import dol.Member;
import ui.EmployeeForm;
import ui.MemberForm;

public final class Application {

	public static Club socialClub = new Club();
	public static void addEmployee(Employee e) {
		socialClub.addEmployee(e);
	}
	public static void catchEmployee() {
		EmployeeForm ef = new EmployeeForm();
		addEmployee(ef.catchEmployee());
	}
	public static void showEmployeesAsTable() {
		socialClub.showEmployeesAsTable();
	}
	public static void addMember(Member m) {
		socialClub.addMember(m);
	}
	public static void catchMember() {
		MemberForm mf = new MemberForm();
		addMember(mf.catchMember());
	}
	public static void showMembersAsTable() {
		socialClub.showMembersAsTable();
	}
}
