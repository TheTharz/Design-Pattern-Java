package org.example;

public class Client {
    public static void main(String[] args) {
        //ekathu krnna oni
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        //adu krnna oni nm
        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        //multiply krnna oni nm
        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));

        //bedanna oni nm
        context = new Context(new OperationDivision());
        System.out.println("10 / 2 = " + context.executeStrategy(10, 3));
    }
}

//open close eka violate krn
//implementation details hide krnna puluwn

//podi stratergy ganakata loku effect na
