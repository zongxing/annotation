package com.mashensoft.food;


import java.util.Enumeration;
import java.util.Vector;

public class Demo {
	public static void main(String[] args) {
		System.out.println(Colors.values().length);
		for (int i = 0; i < Colors.values().length; i++) {
			System.out.println(Colors.values()[i]);
		}
		Vector<String> v = new Vector<>();
		Enumeration<String> e = v.elements();
		while(e.hasMoreElements()) {
			e.nextElement();
		}
	}
}
