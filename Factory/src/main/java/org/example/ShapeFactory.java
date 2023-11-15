package org.example;

public class ShapeFactory {
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }else if(shapeType == "CIRCLE"){
            return new Circle();
        }else if(shapeType == "RECTANGLE"){
            return new Rectangle();
        }else if(shapeType == "SQUARE"){
            return new Square();
        }

        return null;
    }
}
