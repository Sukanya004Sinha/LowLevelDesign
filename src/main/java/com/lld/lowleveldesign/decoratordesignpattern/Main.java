package com.lld.lowleveldesign.decoratordesignpattern;

import com.lld.lowleveldesign.decoratordesignpattern.BasePizza;
import com.lld.lowleveldesign.decoratordesignpattern.Margherita;
import com.lld.lowleveldesign.decoratordesignpattern.Toppings.ExtraCheese;
import com.lld.lowleveldesign.decoratordesignpattern.Toppings.ExtraVeggies;
import com.lld.lowleveldesign.decoratordesignpattern.Toppings.Mushroom;
import com.lld.lowleveldesign.decoratordesignpattern.VegDelight;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza = new Margherita();
        System.out.println(pizza.description() + " costs " + pizza.cost());

        pizza = new ExtraCheese(pizza);
        System.out.println(pizza.description() + " costs " + pizza.cost());

        // Add more toppings here in a similar manner
        BasePizza vegDelight = new VegDelight();
        BasePizza vegDelightWithAllToppings = new ExtraCheese( new ExtraVeggies (new Mushroom(vegDelight)));
        System.out.println(vegDelightWithAllToppings.description() + " costs " + vegDelightWithAllToppings.cost());
    }
}