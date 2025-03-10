package com.lld.lowleveldesign.FactoryDesignPattern;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class ShapeFactoryTest {
    @Test
    public void testGetShapeFactory(){
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("CIRCLE");
        assertNotNull(shape);
        assertTrue(shape instanceof Circle);


    }
    @Test
    public void testGetShapeFactorySquare() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("SQUARE");
        assertNotNull(shape);
        assertTrue(shape instanceof Square);
    }
        @Test
        public void testGetShapeFactoryRectangle(){
            ShapeFactory shapeFactory = new ShapeFactory();
            Shape shape = shapeFactory.getShape("RECTANGLE");
            assertNotNull(shape);
            assertTrue(shape instanceof Rectangle);
        }
        @Test
    public void testGetShape_Invalid(){
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("TRIANGLE");
        assertNull(shape);
        }
}
