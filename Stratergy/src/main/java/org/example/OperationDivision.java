package org.example;

public class OperationDivision implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {

        return num1/num2;
    }
}
