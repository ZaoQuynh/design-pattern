package org.example;

public class Triangle implements Shape{
    protected double base;
    protected double height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    public void accept(ShapeVictor shapeVictor) {
        shapeVictor.visitTriangle(this);
    }
}
