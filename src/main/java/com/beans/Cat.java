package com.beans;

import com.xiaoleilu.hutool.clone.CloneRuntimeException;
import com.xiaoleilu.hutool.clone.Cloneable;

/**
 * Created by sunii on 2017.4.23.
 */
public class Cat implements Cloneable<Cat> {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public Cat clone() {
        try {
            return (Cat) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new CloneRuntimeException(e);
        }
    }
}
