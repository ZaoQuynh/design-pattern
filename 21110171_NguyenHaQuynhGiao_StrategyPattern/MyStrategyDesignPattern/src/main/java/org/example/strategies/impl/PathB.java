package org.example.strategies.impl;

import org.example.strategies.Path;

public class PathB implements Path {
    @Override
    public void go() {
        System.out.print("=============o0o=============\n");
        System.out.print("Chosen Path B: \n");
        System.out.print("Distance: a->c\n");
        System.out.print("Total dístance: 350m\n");
        System.out.print("Distance: c->m\n");
        System.out.print("Total dístance: 1000m\n");
        System.out.print("Distance: m->x\n");
        System.out.print("=============o0o=============\n");
    }
}
