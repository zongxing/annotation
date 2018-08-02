package com.mashensoft.food;

import java.awt.Color;
import java.util.Properties;

//键值对。如果你的属性的名称正好叫value，这时候就可以省略
//@Apple(value="I am red apple")
@Apple(value="I am red apple",age=20,names= {"果子","红富士"},colors= {Colors.RED,Colors.GREEN})
public class Food {
	public static void main(String[] args) {
		Apple apple = Food.class.getAnnotation(Apple.class);
		String value = apple.value();
		System.out.println(value);
		
		
		int age = apple.age();
		System.out.println(age);
		
		
		Properties p = new Properties();
		System.out.println(p.getProperty("aaa"));
		
		
		
		String[] names = apple.names();
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		System.out.println(Colors.BLACK);
		System.out.println("--------我是分隔符---------");
		
		
		Colors[] color = apple.colors();
		for(int i=0;i<color.length;i++) {
			System.out.println(color[i]);
		}
	}
}
