package com.lld.lowleveldesign.decoratordesignpattern;

public class VegDelight extends BasePizza{
    @Override
    public int cost(){
        return 250;
    }
    public String description(){
        return "VegDelight pizza is a combination of onion, capsicum, tomato, and mushroom";
    }
}
