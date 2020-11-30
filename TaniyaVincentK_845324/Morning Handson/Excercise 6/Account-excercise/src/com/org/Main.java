package com.org;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws NoAccountException {
	
	int choice;
    
    Scanner scanner=new Scanner(System.in);
		
	Service service=new Service();
		
	do {
			System.out.println("Enter choice:");
			choice=scanner.nextInt();
			switch(choice) {
			
				case 1: {
				
					System.out.println("Enter Account details-id, name,balance");
					Account acc=new Account();
					int id= scanner.nextInt();
					String name=scanner.next();
					int balance=scanner.nextInt();
					
					
					acc.setid(id);
					acc.setName(name);
					acc.setBalance(balance);
					try {
						service.addAccount(acc);

					} catch (AccountExistingExcpetion e) {
						System.out.println("Duplicate account creation");
					}
					break;
				}
			
				case 2:{
					System.out.println("Enter Account id to search:");
					int id=scanner.nextInt();
					Account emp=new Account();
					emp.setid(id);
					try {
						service.findAccountId(id);

					} catch (NoAccountException e) {
						System.out.println("account not exist");
					}
					break;
				}
				case 3:{
					System.out.println("List of all Accounts:");
					service.getAccounts();
					break;
				}
				case 4:{
					System.out.println("Remove Accounts by Id:");
					try {
						service.getRemoveAccountById(scanner.nextInt());

					} catch ( NoAccountException e) {
						System.out.println("account not exist");
					}
					break;
				}
				case 5:{
					System.out.println("Accounts that hav balance less than 1000:");
					service.getSortedAccountByBalance();
					break;
				}
				
			}
		}while(choice!=6);
	}

}


