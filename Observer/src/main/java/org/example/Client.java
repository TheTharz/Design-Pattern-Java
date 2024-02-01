package org.example;

public class Client {
    public static void main(String[] args) {
        Subject subject = new Subject();

        Observer binaryObserver = new BinaryObserver(subject);
        Observer hexaObserver = new HexaObserver(subject);
        Observer octaObserver = new OctaObserver(subject);

        subject.setState(15);
        subject.setState(20);
    }
}
