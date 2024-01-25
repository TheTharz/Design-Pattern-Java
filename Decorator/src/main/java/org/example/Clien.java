package org.example;

public class Clien {
    public static void main(String[] args) {
        NormalCoffeeMachine normal = new NormalCoffeeMachine();
        EnhancedCoffeeMachine enhanced = new EnhancedCoffeeMachine(normal);

        normal.makeLargeCoffee();
        normal.makeSmallCoffee();

        enhanced.makeSmallCoffee();
        enhanced.makeLargeCoffee();
        enhanced.makeEspresso();
    }
}
