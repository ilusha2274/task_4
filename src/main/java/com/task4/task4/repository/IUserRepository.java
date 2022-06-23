package com.task4.task4.repository;

import java.util.ArrayList;

public interface IUserRepository {
    ArrayList<User> getUserArrayList ();
    ArrayList<User> addUser (String fName,String lName,String patronymic);
}
