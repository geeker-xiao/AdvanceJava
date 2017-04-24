package com.beans;

/**
 * Created by sunii on 2017.4.23.
 */
public class Person implements Cloneable {

    private int age ;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Person() {}

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public Person clone() throws CloneNotSupportedException {
        Person person =  (Person)super.clone();
       // name.clone()
        return person;
    }
}
