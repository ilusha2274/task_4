package com.task4.task4.repository;

public class User {
    public String fName;
    public String lName;
    public String patronymic;

    public User(String fName, String lName, String patronymic) {
        this.fName = fName;
        this.lName = lName;
        this.patronymic = patronymic;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
}
