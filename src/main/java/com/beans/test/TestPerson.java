package com.beans.test;

import com.beans.Person;
import org.junit.Test;

/**
 * Created by sunii on 2017.4.23.
 */
public class TestPerson {


    @Test
    public void testPersonClone() throws Exception{
        Person p = new Person(23, "zhang");
        Person p1 = (Person) p.clone();

        System.out.println(p.getName().hashCode());
        System.out.println(p1.getName().hashCode());
    }
}
