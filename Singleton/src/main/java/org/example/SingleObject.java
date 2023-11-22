package org.example;

public class SingleObject {
    private static SingleObject instance = new SingleObject();
    //make the contructor private so that it can create only one object
    private SingleObject() {}

    public static SingleObject getInstance(){
        return instance;
    }

    public void check(){
        System.out.println("This is inside the object");
    }
}
