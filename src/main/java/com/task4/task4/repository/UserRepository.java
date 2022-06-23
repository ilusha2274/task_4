package com.task4.task4.repository;

import com.task4.task4.domain.User;

import java.util.ArrayList;

public class UserRepository implements IUserRepository{
    public ArrayList<User> userArrayList;

    public UserRepository() {
        this.userArrayList = new ArrayList<>();
    }

    @Override
    public ArrayList<User> getUserArrayList() {
        return userArrayList;
    }

    @Override
    public ArrayList<User> addUser(User user) {
        userArrayList.add(user);
        return userArrayList;
    }
}
