package com.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {
	public static void main(String[] args) {
		List<Items> list = new ArrayList<Items>();
		list.add(new Items(300, "TV", 35000));
		list.add(new Items(100, "Mobile", 25000));
		list.add(new Items(200, "Laptop", 50000));
		for(Items item : list) System.out.println(item);

		System.out.println("---- Sorting By name ascending ----");
		Collections.sort(list, new Comparator<Items>() { 
			public int compare(Items i1, Items i2) { 
				return i1.getName().compareTo(i2.getName());
			}
		});
		for(Items item : list)  System.out.println(item);
		System.out.println("---- Sorting By Id ascending ----");
		Collections.sort(list, new Comparator<Items>() { 
			public int compare(Items i1, Items i2) { 
				return i1.getId()-i2.getId();
			}
		});
		for(Items item : list)  System.out.println(item);
		System.out.println("---- Sorting By Price ascending----");
		Collections.sort(list, new Comparator<Items>() { 
			public int compare(Items i1, Items i2) { 
				return (int) (i1.getPrice()-i2.getPrice());
			}
		});
		for(Items item : list)  System.out.println(item);
		
		
		
		System.out.println("---- Sorting By name descending ----");
		Collections.sort(list, new Comparator<Items>() { 
			public int compare(Items i1, Items i2) { 
				return i2.getName().compareTo(i1.getName());
			}
		});
		for(Items item : list)  System.out.println(item);
		System.out.println("---- Sorting By Id descending ----");
		Collections.sort(list, new Comparator<Items>() { 
			public int compare(Items i1, Items i2) { 
				return i2.getId()-i1.getId();
			}
		});
		for(Items item : list)  System.out.println(item);
		System.out.println("---- Sorting By Price descending----");
		Collections.sort(list, new Comparator<Items>() { 
			public int compare(Items i1, Items i2) { 
				return (int) (i2.getPrice()-i1.getPrice());
			}
		});
		for(Items item : list)  System.out.println(item);
		
	}
}
