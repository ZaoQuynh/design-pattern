package org.example;

public class AreaCalculator implements ShapeVictor{
    @Override
    public void visitCircle(Circle circle) {
        double area = Math.pow(circle.radius, 2) * Math.PI;
        System.out.println("Area of Circle is " + area);
    }

    @Override
    public void visitSquare(Square square) {
        double area = Math.pow(square.side, 2);
        System.out.println("Area of Square is " + area);
    }

    @Override
    public void visitTriangle(Triangle triangle) {
        double area = 0.5 * triangle.base * triangle.height;
        System.out.println("Area of Square is " + area);
    }
}
