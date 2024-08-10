package org.example.manager;

import org.example.model.User;
import org.example.sort.FilterStrategy;
import org.example.sort.SortStrategy;

import java.util.List;

public class UserManager {
    private List<User> users;
    private FilterStrategy filterStrategy ;
    private SortStrategy sortStrategy;

    public UserManager(List<User> users) {
        this.users = users;
    }

    public void setFilterStrategy(FilterStrategy filterStrategy) {
        this.filterStrategy = filterStrategy;
    }

    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public List<User> processUsers(){
        List<User> tempUsers = this.users;

        if (filterStrategy != null) tempUsers = filterStrategy.filter(tempUsers);
        if (sortStrategy != null) sortStrategy.sort(tempUsers);

        return tempUsers;
    }
}
