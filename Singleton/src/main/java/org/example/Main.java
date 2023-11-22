package org.example;

public class Main {
    public static void main(String[] args) {
        //below one can not be done because the constructor is private
        //SingleObject singleObject = new SingleObject();

        SingleObject object = SingleObject.getInstance();
        object.check();
    }
}