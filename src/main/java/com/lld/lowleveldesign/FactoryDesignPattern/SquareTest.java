package com.lld.lowleveldesign.FactoryDesignPattern;

import static org.testng.AssertJUnit.assertNotNull;

public class SquareTest {
    public void testDraw(){
        Square square = new Square();
        assertNotNull(square);
        square.draw();
    }
}
