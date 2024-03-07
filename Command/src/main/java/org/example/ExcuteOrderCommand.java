package org.example;

public class ExcuteOrderCommand implements Command{
    int id;

    public ExcuteOrderCommand(int id){
        this.id = id;
    }

    @Override
    public void execute() {
        System.out.println("Executing order " + id);
    }
}

