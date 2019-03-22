package com.ttn.Ques3_4_6_7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("springCoreAssign.xml");
        HotDrink hotDrink=context.getBean("tea",Tea.class);
        hotDrink.prepareHotDrink();
        HotDrink hotDrink1=context.getBean("expressTea",ExpressTea.class);
        hotDrink1.prepareHotDrink();
        Restaurant restaurant=context.getBean("expressTeaRestaurant",Restaurant.class);
        System.out.print("via inner bean: ");
        restaurant.getHotDrink().prepareHotDrink();

        //for Ques7
        Restaurant teaRestaurant=context.getBean("teaRestaurant",Restaurant.class);
        Restaurant teaRestaurant1=context.getBean("teaRestaurant",Restaurant.class);
        if(teaRestaurant.equals(teaRestaurant1))
            System.out.println("scope : singleton");
        else
            System.out.println("scope : prototype");
    }
}
