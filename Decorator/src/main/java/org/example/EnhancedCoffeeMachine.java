package org.example;

public class EnhancedCoffeeMachine implements CoffeeMachine{

    private NormalCoffeeMachine machine;

    EnhancedCoffeeMachine(NormalCoffeeMachine machine){
        this.machine = machine;
    }

    @Override
    public void makeSmallCoffee() {
        System.out.println("Enhanced Coffee Machine : Making Small Coffee");
    }

    @Override
    public void makeLargeCoffee() {
        machine.makeLargeCoffee();
    }

    public void makeEspresso(){
        System.out.println("Enhanced Coffee Machine : Making Espresso");
    }
}
