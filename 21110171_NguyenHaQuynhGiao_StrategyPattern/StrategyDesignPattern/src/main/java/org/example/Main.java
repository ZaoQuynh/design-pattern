package org.example;

import org.example.manager.UserManager;
import org.example.model.User;
import org.example.sort.impl.AgeFilterStrategy;
import org.example.sort.impl.NameSortStrategy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        users.add(new User("C", 20));
        users.add(new User("A", 40));
        users.add(new User("B", 19));

        UserManager userManager = new UserManager(users);

        int minAge = 20;

        userManager.setFilterStrategy(new AgeFilterStrategy(minAge));
        System.out.printf("Danh sách người dùng trên " + minAge + " tuổi là:\n");
        List<User> filteredUsers = userManager.processUsers();
        for (User u: filteredUsers) {
            System.out.print("___________\n");
            System.out.printf("Tên: " + u.getName() + "\nTuổi: " + String.valueOf(u.getAge()) + "\n");
        }
        userManager.setFilterStrategy(null);

        userManager.setSortStrategy(new NameSortStrategy());
        System.out.print("Danh sách người dùng sau sắp xếp là:\n");
        List<User> sortedUsers = userManager.processUsers();
        for (User u: sortedUsers) {
            System.out.print("___________\n");
            System.out.printf("Tên: " + u.getName() + "\nTuổi: " + String.valueOf(u.getAge()) + "\n");
        }
    }
}