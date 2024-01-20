package org.example;


import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeFactoryTest {
    ShapeFactory factory = new ShapeFactory();
    Food roundFood = factory.getFood("Round");
    Food cyclindricalFood = factory.getFood("Cylindrical");

    @Test
    public void FactoryMethodTest(){
        assertEquals("Round",roundFood.getShape());
        assertEquals("Cylindrical",cyclindricalFood.getShape());
    }

}
