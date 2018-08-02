package com.mashensoft.demo1;

import com.mashensoft.annotation.Test;

public class Son  extends Father {
	/**
	 * 我们本意：覆盖父类的方法
	 * 什么方法可以让我们不要写错方法名
	 */
	@Override
	public void getMoney() {
		System.out.println("靠直播赚钱");
	}
	
	public static void main(String[] args) {
//		Son son = new Son();
//		son.getMoney();
//		
//		
//		
//		Person xingge = new Person();
//		xingge.eat(new Food());
//		xingge.eat(new FreshMeat());
//		Thread t = new Thread();
//		t.interrupt();
//		t.resume();
		
		boolean sign = Son.class.isAnnotationPresent(Test.class);
		System.out.println(sign);
		boolean sign2 = false;
		try {
			sign2 = Son.class.getMethod("getMoney").isAnnotationPresent(Test.class);
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		System.out.println(sign2);
		
	}
}
