package com.lld.lowleveldesign.decoratordesignpattern.Toppings;

import com.lld.lowleveldesign.decoratordesignpattern.BasePizza;

public class ExtraVeggies extends ToppingsDecorator {
 BasePizza basePizza;
    public ExtraVeggies(BasePizza pizza){
        this.basePizza = pizza;
    }
    public int cost(){
        return this.basePizza.cost() +20;
    }
    public String description(){
        return this.basePizza.description() + " with extra veggies";
    }
}
