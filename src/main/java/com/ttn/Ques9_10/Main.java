package com.ttn.Ques9_10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springCoreAssign9_10.xml");
        Restaurant restaurant=context.getBean("restaurant",Restaurant.class);
        restaurant.getHotDrink().prepareHotDrink();
    }
}
