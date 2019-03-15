package com.ttn.Ques1_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AssignmentMain {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("springCoreAssign.xml");
        Database database=context.getBean("database",Database.class);
        System.out.println("port no.= "+database.getPort());
        System.out.println("database name= "+database.getName());

    }
}
