package org.example.sort;

import org.example.model.User;

import java.util.List;

public interface SortStrategy {
    public void sort(List<User> users);
}
