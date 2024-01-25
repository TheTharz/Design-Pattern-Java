package org.example;

public class NormalCoffeeMachine implements CoffeeMachine{
    @Override
    public void makeSmallCoffee() {
        System.out.println("Normal Coffee Machine : Making Small Coffee");
    }

    @Override
    public void makeLargeCoffee() {
        System.out.println("Normal Coffee Machine : Making Large Coffee");
    }
}

