package com.emids.springcore.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("com/emids/springcore/autowiring/config.xml");
        Student s = ac.getBean("student",Student.class);
        System.out.println(s);
    }
}
