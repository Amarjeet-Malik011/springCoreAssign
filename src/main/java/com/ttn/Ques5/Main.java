package com.ttn.Ques5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("springCoreAssign.xml");
        Complex complex=context.getBean("complexBean",Complex.class);
        System.out.println("List: "+complex.getList());
        System.out.println("Set: "+complex.getSet());
        System.out.println("Map: "+complex.getMap());
    }
}
