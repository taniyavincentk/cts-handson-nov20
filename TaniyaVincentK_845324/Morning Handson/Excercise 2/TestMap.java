package com.org;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {

	public static void main(String[] args) {
		List<Student> list1 = new ArrayList<>();
		
		List<Student> list2 = new ArrayList<>();
		Map<String,List<Student>> finalMap = new TreeMap<>(); 
		
		list1.add(new Student(1,"Taniya"));
		list1.add(new Student(2,"Ammu"));
		list2.add(new Student(3,"Appu"));
		list2.add(new Student(4,"Anaya"));
		finalMap.put("CS",list1);
		finalMap.put("EC",list2);
	System.out.println(finalMap.get("EC"));
		
		
	}
}
