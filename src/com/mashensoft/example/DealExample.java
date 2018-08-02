package com.mashensoft.example;

import java.lang.reflect.Method;

public class DealExample {
	public static void dealIt() throws Exception {
		Class c = Class.forName("com.mashensoft.example.RoleService");
		RoleService roleService = (RoleService)c.newInstance();
		Method[] methods = c.getDeclaredMethods();
		for (int i = 0; i < methods.length; i++) {
			Method m = methods[i];
			boolean sign = m.isAnnotationPresent(Test.class);
			if(sign==true) {
				//ִ����Щ����
				int result = (int)m.invoke(roleService,1,2);
				System.out.println(m.getName()+"��������"+result);
			}
		}
	}
	
	public static void main(String[] args) {
		
		try {
			dealIt();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
