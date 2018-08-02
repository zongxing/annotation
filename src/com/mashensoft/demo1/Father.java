package com.mashensoft.demo1;

import com.mashensoft.annotation.Test;

@Test
public class Father{
	/**
	 * 子类继承父类，子类的方法默认会有父类的方法的注解
	 */
	@Test
	public void getMoney() {
		System.out.println("卖房子");
	}
}
