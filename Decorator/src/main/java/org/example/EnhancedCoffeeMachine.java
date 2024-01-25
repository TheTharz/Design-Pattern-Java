package org.example;

public class EnhancedCoffeeMachine implements CoffeeMachine{

    //parana coffee machine eka
    private NormalCoffeeMachine machine;

    //aluthen enhanced machine ekak hadaddi parana eka pass karnwa
    EnhancedCoffeeMachine(NormalCoffeeMachine machine){
        this.machine = machine;
    }

    //parana functionality
    @Override
    public void makeSmallCoffee() {
        System.out.println("Enhanced Coffee Machine : Making Small Coffee with milk");
    }

    //meka parana ekak habay use krala tyenne parana coffee machine ekamai
    @Override
    public void makeLargeCoffee() {
        machine.makeLargeCoffee();
    }

    //aluthen dapu function eka
    public void makeEspresso(){
        System.out.println("Enhanced Coffee Machine : Making Espresso");
    }
}
