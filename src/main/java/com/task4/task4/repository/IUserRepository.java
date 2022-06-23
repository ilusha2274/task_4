package com.task4.task4.repository;

import com.task4.task4.domain.User;

import java.util.ArrayList;

public interface IUserRepository {
    ArrayList<User> getUserArrayList ();
    ArrayList<User> addUser (User user);
}
