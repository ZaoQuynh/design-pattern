package org.example;

import org.example.context.SelectThePath;
import org.example.strategies.impl.PathA;
import org.example.strategies.impl.PathB;

public class Main {

    public static void main(String[] args) {
        SelectThePath select = new SelectThePath();

        select.setPath(new PathA());
        select.movingToDistance();

        select.setPath(new PathB());
        select.movingToDistance();
    }

}