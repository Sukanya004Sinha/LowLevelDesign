package com.lld.lowleveldesign.FactoryDesignPattern;

import static org.testng.AssertJUnit.assertNotNull;

public class RectangleTest {
    public void testDraw(){
        Rectangle rectangle = new Rectangle();
        assertNotNull(rectangle);
        rectangle.draw();
    }
}
