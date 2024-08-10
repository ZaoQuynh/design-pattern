package org.example;

public class Main {
    public static void main(String[] args) {
        ShapeVictor area = new AreaCalculator();
        ShapeVictor draw = new ShapeDrawer();

        Shape circle = new Circle(4);
        Shape square = new Square(4);
        Shape triangle = new Triangle(4, 4);

        circle.accept(area);
        square.accept(area);
        triangle.accept(area);

        circle.accept(draw);
        square.accept(draw);
        triangle.accept(draw);
    }
}