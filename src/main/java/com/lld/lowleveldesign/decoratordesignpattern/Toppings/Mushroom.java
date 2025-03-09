package com.lld.lowleveldesign.decoratordesignpattern.Toppings;

import com.lld.lowleveldesign.decoratordesignpattern.BasePizza;

public class Mushroom extends ToppingsDecorator{
    BasePizza basePizza;
    public Mushroom(BasePizza pizza) {
        this.basePizza = pizza;
    }
    public int cost(){
        return this.basePizza.cost() +70;
    }
    public String description(){
        return this.basePizza.description() + "with mushroom";
    }

}
