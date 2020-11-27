package com.org;

import java.util.ArrayList;
import java.util.List;

public class TestUser {
	public static void main(String[] args) {
		List<User> list = new ArrayList<User>();
		list.add(new User(100, "Taniya", "Taniya123"));
		list.add(new User(200, "Ammu", "Ammu123"));
		list.add(new User(300, "Leo", "Leo123"));
		list.add(new User(400, "Appu", "Appu123"));
		list.add(new User(500, "Hari", "Hari123"));
		
		for(User user : list) {
			if(user.getName().length() > 5) {
				System.out.println(user);
		}
		}
	}
}
