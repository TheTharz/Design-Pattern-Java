package org.example;

public abstract class CaffeineBeverages {
    final void prepareReceipe(){
        boilWater();
        brew();
        pourToCup();
        addCondiments();
    }

    void pourToCup() {
        System.out.println("Pouring to cup");
    }

    void boilWater() {
        System.out.println("Boiling water");
    }

     abstract void brew();

    abstract void addCondiments();
}
