package com.ttn.Ques9_10;

import org.springframework.stereotype.Component;

@Component("expressTea")
public class ExpressTea implements HotDrink {
    @Override
    public void prepareHotDrink() {
        System.out.println("ExpressTea");
        
    }
}
