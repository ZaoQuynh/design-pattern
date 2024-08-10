package org.example;

public class ShapeDrawer implements ShapeVictor{
    @Override
    public void visitCircle(Circle circle) {
        System.out.println("Drawing circle...");
    }

    @Override
    public void visitSquare(Square square) {
        System.out.println("Drawing square...");
    }

    @Override
    public void visitTriangle(Triangle triangle) {
        System.out.println("Drawing triangle...");
    }
}
