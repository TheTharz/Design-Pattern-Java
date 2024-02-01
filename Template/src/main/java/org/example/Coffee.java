package org.example;

public class Coffee extends CaffeineBeverages{
    @Override
    public void brew() {
        System.out.println("Brewing coffee with seeds");
    }

    @Override
    public void addCondiments() {
        System.out.println("Add milk and sugar");
    }
}
