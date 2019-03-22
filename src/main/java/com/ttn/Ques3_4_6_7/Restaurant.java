package com.ttn.Ques3_4_6_7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Restaurant {
    @Autowired
    @Qualifier("tea")
    HotDrink hotDrink;
    private Tea tea;
    private ExpressTea expressTea;

    public void setTea(Tea tea) {
        this.tea = tea;
    }

    public void setExpressTea(ExpressTea expressTea) {
        this.expressTea = expressTea;
    }

    public HotDrink getHotDrink() {
        return hotDrink;
    }

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