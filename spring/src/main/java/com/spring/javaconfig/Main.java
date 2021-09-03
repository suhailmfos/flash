package com.spring.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Student student = context.getBean("firststudent",Student.class);
		student.study();
		System.out.println(student);
	}

}
