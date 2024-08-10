package org.example;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.setValue("x", 10);
        context.setValue("y", 5);

        Expression expression1 = new Plus(new Number(20), new Variable("x"));
        Expression expression2 = new Minus(new Variable("y"), new Number(2));

        int result1 = expression1.interpret(context);
        int result2 = expression2.interpret(context);

        System.out.println("Result of expression1: " + result1);
        System.out.println("Result of expression2: " + result2);
    }
}