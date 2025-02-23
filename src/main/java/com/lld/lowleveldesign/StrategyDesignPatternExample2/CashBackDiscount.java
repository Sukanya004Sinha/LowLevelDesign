package com.lld.lowleveldesign.StrategyDesignPatternExample2;
//Concrete Strategies:
public class CashBackDiscount implements DiscountStrategy{
    private double cashBackRate = 0.05;

    public void giveDiscount(){
        double orignalPrice = 100.0;
        double cashbackAmount = orignalPrice* cashBackRate;

        System.out.println("**********CashBackDiscount********");
        System.out.println("Original Price : $"+ orignalPrice);
        System.out.println("Cashback Amount : $" + cashbackAmount);
        System.out.println("Final price after 5% of cashback : $" + (orignalPrice - cashbackAmount));
    }
    }
