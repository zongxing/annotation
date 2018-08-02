package com.mashensoft.annotation;

import java.lang.reflect.Method;
import java.util.Date;
/**
 * 功能：演示isAnnotationPresent方法来展示是否有注解
 * @author zongx
 * @since v1.0
 * @version v1.1
 *
 */
public class Demo {
	/**
	 * 功能：让线程休眠
	 * @param age  年龄
	 * @param time 时间
	 * @return true:正常，false:不正常  
	 */
	public boolean sleep(int age,Date time) {
		return false;
	}
	public static void main(String[] args) {
		
		
		Class c = UserService.class;
		boolean sign = c.isAnnotationPresent(Test.class);
		System.out.println(sign);
		
		
		try {
			Method method = c.getDeclaredMethod("eat");
			boolean sign2 = method.isAnnotationPresent(Test.class);
			System.out.println(sign2);
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
	}
}
