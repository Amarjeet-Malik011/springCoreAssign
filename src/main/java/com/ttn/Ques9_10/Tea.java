package com.ttn.Ques9_10;

import org.springframework.stereotype.Component;

@Component("tea")
public class Tea implements HotDrink {
    public Tea() {
    }

    @Override
    public void prepareHotDrink() {
        System.out.println("Tea");
        
    }

}
