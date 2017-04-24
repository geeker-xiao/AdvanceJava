package com.beans.test;

import org.junit.Test;
import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * Created by sunii on 2017.4.23.
 */
public class TestUnsafeUser {

    @Test
    public void testUnsafeofUser() throws Exception{

        Field field = Unsafe.class.getDeclaredField("theUnsafe");
        // 设置该Field为可访问
        field.setAccessible(true);
        // 通过Field得到该Field对应的具体对象，传入null是因为该Field为static的
        Unsafe unsafe = (Unsafe) field.get(null);

        User user = (User) unsafe.allocateInstance(User.class);
        //System.out.println(user); //dont invoke constructor, print null: 0

        /*User userFromNormal = new User();
        System.out.println(userFromNormal); //print test: 22
        Field userField = userFromNormal.getClass().getDeclaredField("name");
        userField.setAccessible(true);
        long longs = unsafe.objectFieldOffset(userField);
        System.out.println("longs - "+longs);*/


        Class userclass = user.getClass();
        Field usersField = userclass.getDeclaredField("name");
        usersField.setAccessible(true);
        unsafe.putObject(user,unsafe.objectFieldOffset(usersField),"abc");

        System.out.println(user);

    }
}
