package com.org;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.stream.Collectors;

	public class Stream {

		public static void main(String[] args) {
			
			List<String> list = new ArrayList<>();
			list.add("Lenovo");
			list.add("Dell");
			list.add("Macc");
			list.add("Samsung");
			list.add("Oppo");
			list.add("Oneplus");
			list.add("HTC");
			list.add("Intel");
			list.add(null);
			list.add("Microsoft");
			list.add("Jetbrains");
			list.add("Titan");
			list.add("Fossil");
			
			
			List<String> finalList = list.stream().filter(str -> str != null && str.length() > 4).map(String::toUpperCase).sorted()
			.collect(Collectors.toList());
			
			 System.out.print(finalList);
			
			
			
		}

	}


