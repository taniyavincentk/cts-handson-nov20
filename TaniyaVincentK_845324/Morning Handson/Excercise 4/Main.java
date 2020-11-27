package com.org;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

       int choice;
       
       Scanner scanner=new Scanner(System.in);
		
		Service service=new Service();
		do {
			System.out.println("Enter choice:");
			choice=scanner.nextInt();
			switch(choice) {
			
				case 1: {
				
					System.out.println("Enter Employee details-id, name, salary, DOB");
					Employee emp=new Employee();
					int id= scanner.nextInt();
					String name=scanner.next();
					double salary=scanner.nextDouble();
					LocalDate dob=LocalDate.parse(scanner.next());
					
					
					emp.setId(id);
					emp.setName(name);
					emp.setSalary(salary);
					emp.setDob(dob);
					
					service.addEmployee(emp);
					break;
				}
			
				case 2:{
					System.out.println("Enter Employee id to search:");
					int id=scanner.nextInt();
					Employee emp=new Employee();
					emp.setId(id);
					
					service.findEmployeeId(id);
					break;
				}
				case 3:{
					System.out.println("List of all Employees:");
					service.getEmployees();
					break;
				}
				case 4:{
					System.out.println("Employees sorted by Id:");
					service.getSortedEmployeeById();
					break;
				}
				case 5:{
					System.out.println("Employees sorted by name:");
					service.getSortedEmployeeByName();
					break;
				}
				case 6:{
					System.out.println("Employees sorted by salary:");
					service.getSortedEmployeeBySalary();
					break;
				}
				case 7:{
					System.out.println("Employees sorted by DOB:");
					service.getSortedEmployeeByDob();
					break;
				}
				
			}
		}while(choice!=8);
	}

}
