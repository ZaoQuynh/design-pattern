package org.example.sort;

import org.example.model.User;

import java.util.List;

public interface FilterStrategy {
    public List<User> filter(List<User> users);
}
