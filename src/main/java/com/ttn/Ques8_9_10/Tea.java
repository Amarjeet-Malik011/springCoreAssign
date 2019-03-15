package com.ttn.Ques8_9_10;

import org.springframework.stereotype.Component;

@Component("tea")
public class Tea implements HotDrink {
    @Override
    public void prepareHotDrink() {
        System.out.println("Tea");
        
    }

}
