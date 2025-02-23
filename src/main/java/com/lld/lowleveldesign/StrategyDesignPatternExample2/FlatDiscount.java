package com.lld.lowleveldesign.StrategyDesignPatternExample2;
//Concrete Strategies:
public class FlatDiscount implements DiscountStrategy{
    private double discountRate= 0.10;
    public void giveDiscount(){
        double orignalPrice= 100.0; // Orignal Price
        double discountAmount = orignalPrice * discountRate;
        double finalPrice = orignalPrice - discountAmount ;
        System.out.println("**********FlatDiscount********");
        System.out.println("orignal Price : $" + orignalPrice);
        System.out.println("Discount Amount: $ " +discountAmount);
        System.out.println("Final price after 10% discount : $" +finalPrice);
    }
}


