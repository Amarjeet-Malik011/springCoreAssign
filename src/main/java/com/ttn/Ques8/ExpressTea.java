package com.ttn.Ques8;

import org.springframework.stereotype.Component;

@Component("expressTea")
public class ExpressTea implements HotDrink {
    @Override
    public void prepareHotDrink() {
        System.out.println("ExpressTea");
        
    }
}
