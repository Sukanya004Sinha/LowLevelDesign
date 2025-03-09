package com.lld.lowleveldesign.decoratordesignpattern;

public class Margherita extends BasePizza{

    public int cost(){
        return 150;
    }
    public String description(){
        return "Margherita pizza is a speciality of Naples, Italy. It is made with tomatoes, sliced mozzarella, basil, and extra virgin olive oil.";
    }
}
