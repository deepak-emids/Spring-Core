package com.emids.springcore.si;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
        Student s = (Student)ac.getBean("student");
        System.out.println(s);
    }
}
