package com.ttn.Ques9_10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Restaurant {

//    @Autowired
//    @Qualifier("tea")
    HotDrink hotDrink;

    public HotDrink getHotDrink()
    {
        return hotDrink;
    }

//    @Autowired
//    @Qualifier("tea")
    public void setHotDrink( HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    public Restaurant() {
    }

    @Autowired
    public Restaurant(/*@Qualifier("tea")*/ HotDrink hotDrink) {
        this.hotDrink=hotDrink;
    }
}