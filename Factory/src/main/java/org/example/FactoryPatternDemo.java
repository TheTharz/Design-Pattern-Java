package org.example;

public class FactoryPatternDemo {
    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();

        //to get a circle
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        shape1.draw();

        //to get a rectangle
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        shape2.draw();

        //to get a square
        Shape shape3 = shapeFactory.getShape("SQUARE");

        shape3.draw();
    }
}
