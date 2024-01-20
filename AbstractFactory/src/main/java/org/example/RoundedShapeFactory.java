package org.example;

public class RoundedShapeFactory extends AbstractFactory{
    @Override
    Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("Rectangle")){
            return new RoundedRectangle();
        }else if(shapeType.equalsIgnoreCase("Square")){
            return new RoundedSquare();
        }
        return null;
    }
}
