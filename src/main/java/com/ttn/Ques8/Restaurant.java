package com.ttn.Ques8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

//@Component
public class Restaurant {
    @Autowired
    @Qualifier("tea")
    HotDrink hotDrink;
    @Autowired
    private Tea tea;
    private ExpressTea expressTea;
    @Autowired
    public void setTea(Tea tea) {
        this.tea = tea;
    }

    public void setExpressTea(ExpressTea expressTea) {
        this.expressTea = expressTea;
    }

    public HotDrink getHotDrink() {
        return hotDrink;
    }

    @Required
    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }
/*    @Autowired
    public Restaurant(Tea tea) {
        this.tea = tea;
    }*/

    public Restaurant() {
    }
}