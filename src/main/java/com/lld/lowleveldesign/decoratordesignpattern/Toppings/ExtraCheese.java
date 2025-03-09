package com.lld.lowleveldesign.decoratordesignpattern.Toppings;

import com.lld.lowleveldesign.decoratordesignpattern.BasePizza;

public class ExtraCheese extends ToppingsDecorator {
    BasePizza basePizza;

    public ExtraCheese(BasePizza pizza) {
        this.basePizza = pizza;
    }
        @Override
        public int cost() {
             return this.basePizza.cost();

        }
        public String description() {
            return this.basePizza.description() + " with extra cheese";


    }
}
