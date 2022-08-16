package bll;

import dol.Club;
import dol.Employee;

public final class Application {
	public static Club socialClub = new Club();
	public static void addEmployee(Employee e) {
		socialClub.addEmployee(e);
	}
	public static void showEmployeesAsTable() {
		socialClub.showEmployeesAsTable();
	}
}
