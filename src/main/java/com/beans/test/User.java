package com.beans.test;

/**
 * Created by sunii on 2017.4.23.
 */
public class User {
    private String name = "";
    private int age = 0;

    public User() {
        this.name = "test";
        this.age = 22;
    }

    @Override
    public String toString() {
        return name + ": " + age;
    }
}
