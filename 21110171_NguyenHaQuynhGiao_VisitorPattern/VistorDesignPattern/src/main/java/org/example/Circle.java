package org.example;

public class Circle implements Shape{
    protected double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public void accept(ShapeVictor shapeVictor) {
        shapeVictor.visitCircle(this);
    }
}
