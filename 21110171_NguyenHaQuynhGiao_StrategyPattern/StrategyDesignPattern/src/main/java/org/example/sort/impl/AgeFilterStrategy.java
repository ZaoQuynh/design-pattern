package org.example.sort.impl;

import org.example.model.User;
import org.example.sort.FilterStrategy;

import java.util.List;
import java.util.stream.Collectors;

public class AgeFilterStrategy implements FilterStrategy {

    private final int minAge;

    public AgeFilterStrategy(int age){
        this.minAge = age;
    }

    public List<User> filter(List<User> users){
        return users.stream()
                .filter(u -> u.getAge() >= this.minAge)
                .collect(Collectors.toList());
    }
}
