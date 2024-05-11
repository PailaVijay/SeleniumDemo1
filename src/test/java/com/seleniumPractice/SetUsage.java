package com.seleniumPractice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetUsage {

	public static void main(String[] args) {
		
		Set<String> set= new HashSet<String>();
		set.add("rahul");
		set.add("marnus");
		set.add("nicolas");
		set.add("krunal");
		set.add("badoni");
		
		System.out.println("unordered list");
		System.out.println(set);
		System.out.println("Ordered list");
		
		Set<String> lSet= new LinkedHashSet<String>();
		lSet.add("rahul");
		lSet.add("marnus");
		lSet.add("nicolas");
		lSet.add("krunal");
		lSet.add("badoni");
		System.out.println(lSet);
		
        System.out.println("Sorted Ordered list");
		
		Set<String> tSet= new TreeSet<String>();
		tSet.add("rahul");
		tSet.add("marnus");
		tSet.add("nicolas");
		tSet.add("krunal");
		tSet.add("badoni");
		System.out.println(tSet);
	}

}
