package com.beans.test;

import com.beans.Cat;
import com.xiaoleilu.hutool.cache.Cache;
import com.xiaoleilu.hutool.cache.CacheUtil;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by sunii on 2017.4.23.
 */
public class TestCat {

    Cache<String,Cat> catCache = CacheUtil.newFIFOCache(1000, TimeUnit.HOURS.toMinutes(10));


    @BeforeClass
    public static void beforeCla2(){
        System.out.println("@beforeClass2");
    }

    @BeforeClass
    public static void beforeClass1(){
        System.out.println("@beforeClass1");
    }
    @Before
    public void beforeStore(){
        Cat cat = new Cat();
        cat.setAge(11);
        cat.setName("abc");
        catCache.put("abc",cat);
        System.out.println("sssss");
    }

    @Test
    public void testCat(){
        Cat cat = new Cat();
        cat.setAge(11);
        cat.setName("abc");
        Cache<String,Cat> catCache = CacheUtil.newFIFOCache(1000, TimeUnit.HOURS.toMinutes(10));
        catCache.put("abc",cat);
    }

    @Test
    public void testGetCache(){
        //Cache<String,Cat> catCache = CacheUtil.newFIFOCache(1000, TimeUnit.HOURS.toMinutes(10));
        Cat cat = catCache.get("abc");
        System.out.println(cat.getName());
    }
}
