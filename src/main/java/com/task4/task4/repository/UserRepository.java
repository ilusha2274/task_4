package com.task4.task4.repository;

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
    public ArrayList<User> addUser(String fName,String lName,String patronymic) {
        User user = new User(fName,lName,patronymic);
        userArrayList.add(user);
        return userArrayList;
    }
}
