package dol;

import java.util.ArrayList;
import java.util.List;

public class Club {
	private String name;
	private List<Member> members;
	private List<Employee> employees;
	public Club(String name, List<Member> members, List<Employee> employees) {
		super();
		this.name = name;
		this.members = members;
		this.employees = employees;
	}
	public Club(String name) {
		super();
		this.name = name;
		members = new ArrayList<Member>();
		employees = new ArrayList<Employee>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Member> getMembers() {
		return members;
	}
	public void setMembers(List<Member> members) {
		this.members = members;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public void addEmployee(Employee e) {
		this.employees.add(e);
	}
	public void addMember(Member m) {
		this.members.add(m);
	}
	public void showMembersAsTable() {
		System.out.printf("\n========================== Listado de miembros del Club %n ==========================", name);
		for(int i=0; i<members.size();i++) {
			members.get(i).showDataAsRow();
		}
		System.out.println("\n=====================================================================================");
	}
	public void showEmployeesAsTable() {
		System.out.printf("\n========================== Listado de empleados del Club %n ==========================", name);
		for(int i=0; i<employees.size();i++) {
			employees.get(i).showDataAsRow();
		}
		System.out.println("\n=====================================================================================");
	}
}
