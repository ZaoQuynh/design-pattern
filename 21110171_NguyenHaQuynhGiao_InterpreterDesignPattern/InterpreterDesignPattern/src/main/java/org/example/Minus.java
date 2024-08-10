package org.example;

public class Minus implements Expression {
    private Expression leftOperand;
    private Expression rightOperand;

    public Minus(Expression leftOperand, Expression rightOperand){
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    @Override
    public int interpret(Context context) {
        return this.leftOperand.interpret(context) - rightOperand.interpret(context);
    }
}
