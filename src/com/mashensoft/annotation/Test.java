package com.mashensoft.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//�������Ԫע���ע�⣬ȥ����һ�����࣬��������Ҳ�������ע��
@Inherited
//�������Ԫע���ע�⣬����javadoc�����
@Documented
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Test {

}
