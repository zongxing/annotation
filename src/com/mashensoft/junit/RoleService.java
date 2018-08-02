package com.mashensoft.junit;

public class RoleService {
	public int plus(int a,int b) {
		return a+b;
	}
	public int minus(int a,int b) {
		return a-b;
	}
	public static void main(String[] args) {
		System.out.println(new RoleService().minus(1, 2));
	}
}
