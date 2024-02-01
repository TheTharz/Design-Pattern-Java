package org.example;

public class Client {
    public static void main(String[] args) {
        Tea myTea = new Tea();
        myTea.prepareReceipe();

        Coffee myCoffee = new Coffee();
        myCoffee.prepareReceipe();
    }
}
