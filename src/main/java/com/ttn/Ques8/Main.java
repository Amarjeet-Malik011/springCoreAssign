package com.ttn.Ques8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("springCoreAssign8.xml");

        Restaurant restaurant=context.getBean("teaRestaurant", Restaurant.class);
        System.out.print("via inner bean: ");
        restaurant.getHotDrink().prepareHotDrink();

            
    }
}
