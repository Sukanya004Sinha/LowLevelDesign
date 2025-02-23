package com.lld.lowleveldesign.StrategyDesignPatternExample2;

public class CouponDiscount implements DiscountStrategy{
    private double couponValue = 20.0;

    public void giveDiscount(){
        double originalPrice = 100.0;
        double finalPrice = originalPrice-couponValue;
        System.out.println("**********CouponDiscount********");
        System.out.println("Original price :$ + originalPrice");
        System.out.println("Coupon Value :$" +couponValue);
        System.out.println("Final price after applying coupon :$" +finalPrice);

    }
}
