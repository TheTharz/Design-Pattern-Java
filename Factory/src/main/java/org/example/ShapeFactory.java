package org.example;

public class ShapeFactory {
    public Food getFood(String shape){
        if(shape==null){
            return null;
        }

        switch (shape){
            case "Round" : return new Pizza();
            case "Cylindrical" : return new Roles();
            default:throw new IllegalArgumentException("Not a valid shape");
        }
    }
}
