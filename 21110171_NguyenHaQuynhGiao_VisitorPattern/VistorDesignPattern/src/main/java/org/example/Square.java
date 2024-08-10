package org.example;

public class Square implements Shape{

    protected double side;

    public Square(double side){
        this.side = side;
    }

    @Override
    public void accept(ShapeVictor shapeVictor) {
        shapeVictor.visitSquare(this);
    }
}
