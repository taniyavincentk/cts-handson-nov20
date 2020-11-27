package com.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Service {

	List<Employee> employeeList = new ArrayList<Employee>();
	
	public void addEmployee(Employee e) {
		employeeList.add(e);
	}
	
	public void findEmployeeId(int id ) {
		
		for(Employee emp:employeeList) {
			if(emp.getId()==id) {
				System.out.println(emp);
			}
		}
	}
	
	public void getEmployees() {
		for(Employee emp:employeeList) {
			System.out.println(emp);
		}
	}
	
	public void getSortedEmployeeById() {
		Collections.sort(employeeList,(e1,e2)->e1.getId()-e2.getId());
		for(Employee emp:employeeList) {
			System.out.println(emp);
		}
	}
	
	public void getSortedEmployeeByName() {
		Collections.sort(employeeList,(e1,e2)->e1.getName().compareTo(e2.getName()));
		for(Employee emp:employeeList) {
			System.out.println(emp);
		}
	}
	
	public void getSortedEmployeeBySalary() {
		Collections.sort(employeeList,(e1,e2)->Double.compare(e1.getSalary(), e2.getSalary()));
		for(Employee emp:employeeList) {
			System.out.println(emp);
		}
	}
	
	public void getSortedEmployeeByDob() {
		Collections.sort(employeeList,(e1,e2)->e1.getDob().compareTo(e2.getDob()));
		for(Employee emp:employeeList) {
			System.out.println(emp);
		}
	}
}