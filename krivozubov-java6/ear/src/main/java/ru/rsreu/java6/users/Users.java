package ru.rsreu.java6.users;

import java.util.ArrayList;
import java.util.List;

public class Users {

    private List<User> users;

    public Users() {
        users = new ArrayList<User>();
    }

    public List<User> getUsers() {
        return users;
    }
}
