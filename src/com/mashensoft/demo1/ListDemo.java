package com.mashensoft.demo1;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	//@SuppressWarnings("all")
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		//list.add("abc");
		list.add(100);
		
		//String a  = (String)list.get(0);
		
		Integer c = (Integer)list.get(0);
		Integer b = (Integer)list.get(1);
		
		
		//System.out.println(a);
		System.out.println(b);
		
		
		
		@SuppressWarnings("all")
		List list2 = new ArrayList();
		list2.add(100);
		list2.add(200);
		
		
		@SuppressWarnings("unused")
		int m = 0;
		//int n = m;
		//System.out.println(n);
	}

}
