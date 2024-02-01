package org.example;

public class Tea extends CaffeineBeverages{
    @Override
    void brew() {
        System.out.println("Brewing tea with bags");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon to tea");
    }
}


