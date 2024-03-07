package org.example;

public class AddOrderCommand implements Command{
    int id;
    double price;

    public AddOrderCommand(int id,double price){
        this.id = id;
        this.price = price;
    }

    @Override
    public void execute() {
        System.out.println("Added order " + id + " price " + price);
    }
}
