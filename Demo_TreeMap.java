package com.callection;

import java.util.TreeMap;

public class Demo_TreeMap {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		tm.put(1, "Developer");
		tm.put(34,"Data Analysis");
		tm.put(32,"Dala Science" );
		tm.put(2,"System Analysis");
		tm.put(0,"Tester");
		
		
		System.out.println(tm);
		System.out.println(tm.put(123, null));
		 tm.put(11,"Developer");
		
		System.out.println(tm.size()); 
		
		System.out.println(tm.firstKey());
		
		System.out.println(tm.lastKey());
		
		System.out.println(tm.remove(2));
		
		System.out.println(tm.isEmpty());
		
		System.out.println(tm.floorKey(1));
		
		
		System.out.println(tm.containsValue("Tester"));
		System.out.println(tm);
		
		TreeMap<Double,Integer> tm1 = new TreeMap<Double,Integer>();
		
		tm1.put(234.44,326);
		tm1.put(235.44,325);
		tm1.put(254.44,323);
		tm1.put(265.44,322);
		System.out.println(tm1.ceilingKey(234.44));//using the enter number output is showing
		
		System.out.println(tm1.descendingKeySet());//yes this successful descending order
		
		System.out.println(tm1.floorKey(265.44));//using the enter number output is showing
		
		System.out.println(tm1.tailMap(254.44));//staring the using the element of number all element is output
		
		System.out.println(tm1);
		
		
	

	}

}
