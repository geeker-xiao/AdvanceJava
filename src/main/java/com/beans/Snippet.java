package com.beans;

import org.junit.Test;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by sunii on 2017.4.23.
 */
public class Snippet {


    @Test
    public void testSnippet(){
        Stream<String> names = Stream.of("Lamurudu", "Okanbi", "Oduduwa");

        Optional<String> startswl = names.filter(name -> name.startsWith("L")).findFirst();

        //判断是否不为null
        if(startswl.isPresent()){
            System.out.println(startswl.get());
        }

        //if值为null：打印“null”；if值不为null：打印原值
        System.out.println(startswl.orElse("null"));

        //if值不为null，执行Lambda表达式
        startswl.ifPresent(name -> {
            String s = name.toUpperCase();
            System.out.println(s);
        });
    }
}
