package com.callection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraList_Collection {

	 public static void main(String[] args) {
	        List<Student> list = new ArrayList<Student>();

	        list.add(new Student(121, "vijay", 23));
	        list.add(new Student(122, "chinna", 24));
	        list.add(new Student(123, "Raghu", 25));

	        Student s = new Student(124, "cm", 25);

	        list.add(s);

	        for (Student s1 : list) {
	            System.out.println(s1);
	        }

	        Collections.sort(null);{
	   
	        System.out.println("After sorting:");
	        for (Student s1 : list) {
	            System.out.println(s1);
	        
	        }
	    }
	 }
}
