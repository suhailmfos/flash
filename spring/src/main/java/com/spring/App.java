package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/config.xml");
        System.out.println("I love Java Programming");
        Samosa s1 = (Samosa)context.getBean("s1");
        System.out.println(s1);
    }
}
