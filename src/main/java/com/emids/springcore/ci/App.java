package com.emids.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("com/emids/springcore/ci/config.xml");
        Student s = (Student)ac.getBean("student");
        System.out.println(s);
    }
}
