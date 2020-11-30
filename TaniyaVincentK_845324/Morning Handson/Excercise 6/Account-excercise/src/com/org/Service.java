package com.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Service {

List<Account> AccountList = new ArrayList<Account>();
	
	public void addAccount(Account acc) throws AccountExistingExcpetion {
		
		for (Account acc1 : AccountList) {
			if(acc1.getid()==acc.getid())
				throw new AccountExistingExcpetion();
		}
		AccountList.add(acc);
	}
	
	public void findAccountId(int id ) throws NoAccountException {
		
		Account result = null;
		for (Account acc : AccountList) {
			if(acc.getid()==id)
				result=acc;
		}if(result==null)
			throw new NoAccountException();
		else
			System.out.println(result);
	}
		
	public void getAccounts() {
		for(Account acc:AccountList) {
			System.out.println(acc);
		}
	}
	
	public void getRemoveAccountById(int id) throws NoAccountException {
		Account result = null;
		for (Account acc : AccountList) {
			if(acc.getid()==id)
				result=acc;
		}
		if(result==null)
			throw new NoAccountException();
		else {
			for (Account acc : AccountList) {
				if(acc.getid()==id)
					AccountList.remove(acc);
			}}
		
	}
	
	
	
	public void getSortedAccountByBalance() {
		
		AccountList.stream().forEach(item->{if(item.getBalance()<1000) System.out.println(item);});
	
	
	}

		

	
}

