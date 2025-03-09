package com.lld.lowleveldesign.decoratordesignpattern;

public class Farmhouse extends BasePizza{
    @Override
    public int cost(){
        return 200;
    }
    public String description(){
        return "Farmhouse pizza is a combination of onion, capsicum, tomato, and mushroom";
    }
}
