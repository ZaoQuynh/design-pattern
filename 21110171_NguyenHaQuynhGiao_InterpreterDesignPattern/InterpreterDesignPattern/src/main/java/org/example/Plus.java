package org.example;

public class Plus implements Expression{
    private Expression leftOperand;
    private Expression rightOperand;

    public Plus(Expression leftOperand, Expression rightOperand){
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    @Override
    public int interpret(Context context) {
        return this.leftOperand.interpret(context) + rightOperand.interpret(context);
    }
}
