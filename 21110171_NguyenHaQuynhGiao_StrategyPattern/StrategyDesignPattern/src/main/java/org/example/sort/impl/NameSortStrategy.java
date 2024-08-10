package org.example.sort.impl;

import org.example.model.User;
import org.example.sort.SortStrategy;

import java.text.Collator;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class NameSortStrategy implements SortStrategy {
    @Override
    public void sort(List<User> users) {
        Comparator<User> comparator = Comparator.comparing(User::getName,
                Collator.getInstance(new Locale("vi")));
        users.sort(comparator);
    }
}
