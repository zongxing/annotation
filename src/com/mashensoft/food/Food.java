package com.mashensoft.food;

import java.awt.Color;
import java.util.Properties;

//��ֵ�ԡ����������Ե��������ý�value����ʱ��Ϳ���ʡ��
//@Apple(value="I am red apple")
@Apple(value="I am red apple",age=20,names= {"����","�츻ʿ"},colors= {Colors.RED,Colors.GREEN})
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
		System.out.println("--------���Ƿָ���---------");
		
		
		Colors[] color = apple.colors();
		for(int i=0;i<color.length;i++) {
			System.out.println(color[i]);
		}
	}
}
