package com.task4.task4.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

public class User {

    @NotEmpty(message = "fName is mandatory")
    public String fName;

    @NotEmpty(message = "lName is mandatory")
    public String lName;

    @NotEmpty(message = "patronymic is mandatory")
    public String patronymic;

    public String getView (){
        return this.fName + " " + this.lName + " " + this.patronymic;
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
