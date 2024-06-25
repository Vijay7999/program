package com.callection;

import java.util.HashMap;

public class DemoHashMap {

	public static void main(String[] args) {
		HashMap<Integer,String> cities = new HashMap<Integer,String>();
		
		cities.put(1,"Andhra pradesh");
		cities.put(2, "Telangana ");
		cities.put(5,"karnataka");
		cities.put(4, "kerala");
		cities.put(3,"Thamilnadu");
		
		System.out.println(cities);
		
		System.out.println(cities.isEmpty());
		
		System.out.println(cities.hashCode());
		
		System.out.println(cities.containsKey(5));
		
		System.out.println(cities.containsValue("kerala"));
		
		System.out.println(cities.put(6, "cities"));
		
		System.out.println(cities);
		
		System.out.println(cities.replace(2, "vijayanagaram"));
		
		System.out.println(cities);
		
		System.out.println(cities.remove(5, "thamilnadu"));
		
		System.out.println(cities);
		
		System.out.println(cities.put(0, ""));
		
		System.out.println(cities);
	}

}
