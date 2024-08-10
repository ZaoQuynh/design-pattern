package org.example.strategies.impl;

import org.example.strategies.Path;

public class PathA implements Path {
    @Override
    public void go() {
        System.out.print("=============o0o=============\n");
        System.out.print("Chosen Path A: \n");
        System.out.print("Distance: a->b\n");
        System.out.print("Total dístance: 100m\n");
        System.out.print("Distance: b->d\n");
        System.out.print("Total dístance: 500m\n");
        System.out.print("Distance: d->x\n");
        System.out.print("Total dístance: 2000m\n");
        System.out.print("Distance: x->z\n");
        System.out.print("Total dístance: 100m\n");
        System.out.print("=============o0o=============\n");
    }
}
