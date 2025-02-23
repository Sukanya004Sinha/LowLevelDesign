package com.lld.lowleveldesign.StrategyDesignPatternExample2;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FlatDiscountTest {
    @Test
    public void testGiveDiscount() {
        FlatDiscount flatDiscount = new FlatDiscount();
        double originalPrice = 100;
        double expectedFinalPrice = 90.0;
        double discountAmount = originalPrice * 0.10;
        double finalPrice = originalPrice - discountAmount;
        assertEquals(expectedFinalPrice,finalPrice, 0.01);
    }

}
