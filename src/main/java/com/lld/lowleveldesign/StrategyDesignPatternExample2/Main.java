package com.lld.lowleveldesign.StrategyDesignPatternExample2;

public class Main {
    public static void main(String[] args){
        ApplyDiscount applyDiscount = new ApplyDiscount(new FlatDiscount());
        applyDiscount.getDiscount();
        applyDiscount.setStrategy(new CouponDiscount());
        applyDiscount.getDiscount();
        applyDiscount.setStrategy(new CashBackDiscount());
        applyDiscount.getDiscount();


    }
}
