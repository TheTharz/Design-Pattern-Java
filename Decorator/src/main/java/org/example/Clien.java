package org.example;

public class Clien {
    public static void main(String[] args) {
        NormalCoffeeMachine normal = new NormalCoffeeMachine();
        EnhancedCoffeeMachine enhanced = new EnhancedCoffeeMachine(normal);

        //normal eken espresso hadann ba
        normal.makeLargeCoffee();
        normal.makeSmallCoffee();

        //meken thunama puluwn
        enhanced.makeSmallCoffee();
        enhanced.makeLargeCoffee();
        enhanced.makeEspresso();
    }
}

//flexible
//expansion is easy
//readable

//high complexity of code
//large number of objects
