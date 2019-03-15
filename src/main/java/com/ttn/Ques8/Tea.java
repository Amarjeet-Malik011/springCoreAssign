package com.ttn.Ques8;

import org.springframework.stereotype.Component;

@Component("tea")
public class Tea implements HotDrink {
    @Override
    public void prepareHotDrink() {
        System.out.println("Tea");
        
    }

}
