package com.mashensoft.annotation;

import java.lang.reflect.Method;
import java.util.Date;
/**
 * ���ܣ���ʾisAnnotationPresent������չʾ�Ƿ���ע��
 * @author zongx
 * @since v1.0
 * @version v1.1
 *
 */
public class Demo {
	/**
	 * ���ܣ����߳�����
	 * @param age  ����
	 * @param time ʱ��
	 * @return true:������false:������  
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
