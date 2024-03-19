package com.tpr.entities;

import lombok.Getter;

import java.util.Date;

@Getter
public class Student {

    private String firstName;

    private String lastName;

    private Date birthday;

    private String gender;

    private String grade;

    public String getFullName() {
        String var = firstName + ' ' + lastName;
        return var;
    }
}
