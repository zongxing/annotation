package com.mashensoft.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//用了这个元注解的注解，去修饰一个父类，它的子类也会有这个注解
@Inherited
//用了这个元注解的注解，会在javadoc里出现
@Documented
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Test {

}
