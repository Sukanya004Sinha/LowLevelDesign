package com.lld.lowleveldesign.decoratordesignpattern.Toppings;

import com.lld.lowleveldesign.decoratordesignpattern.BasePizza;

public abstract  class ToppingsDecorator extends BasePizza {
    public abstract int cost();
    public abstract String description();


}
