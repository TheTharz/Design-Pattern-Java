package org.example;

public class Client {
    public static void main(String[] args) {
        CommandProcessor processor = new CommandProcessor();

        processor.addCommand(new AddOrderCommand(1,12))
                .addCommand(new AddOrderCommand(2,16))
                .addCommand(new ExcuteOrderCommand(1))
                .addCommand(new ExcuteOrderCommand(2)).processCommands();
    }
}
