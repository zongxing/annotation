package com.mashensoft.example;

public class RoleService {
	@Test
	public int plus(int a,int b) {
		return a+b;
	}
	@Test
	public int minus(int a,int b) {
		return a-b;
	}
	public void doSomething() {
		
	}
	public static void main(String[] args) {
		System.out.println(new RoleService().minus(1, 2));
	}
}
