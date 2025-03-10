package com.lld.lowleveldesign.FactoryDesignPattern;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertNotNull;


public class CircleTest {
    @Test
    public void testDraw(){
        Circle circle = new Circle();
        assertNotNull(circle);
        circle.draw();
    }
}
