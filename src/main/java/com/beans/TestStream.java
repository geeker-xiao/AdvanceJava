package com.beans;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by sunii on 2017.4.23.
 */
public class TestStream {

    // TODO  什么是Stream
    @Test
    public void whatIsStream() {
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myList
            .stream()
            .filter(s -> s.startsWith("c"))       // TODO 过滤以c字母开头
            .map(String::toUpperCase)             // TODO 字符变成大写
            .sorted()                             // TODO 排序
            .forEach(System.out::println);        // TODO 打印输出
    }


    @Test
    // TODO Stream的创建
    // TODO 使用Stream.of
    public void createStream1(){
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        stream.forEach(p -> System.out.println(p));
    }

    @Test
    // TODO Stream的创建
    // TODO 使用Arrays.stream
    public void createStream2(){
        Stream<Integer> stream = Arrays.stream(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        stream.forEach(p -> System.out.println(p));
    }

    @Test
    // TODO Stream的创建
    // TODO 使用Collection.stream()
    public void createStream3(){
        List<Integer> list =
                new ArrayList<Integer>(Arrays.asList(new Integer[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9 }));

        Stream<Integer> stream = list.stream();
        stream.forEach(p -> System.out.println(p));
    }

    @Test
    // TODO Stream的创建
    // TODO Collection.parallelStream()
    public void createStream4(){
        List<Integer> list =
                new ArrayList<Integer>(Arrays.asList(new Integer[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9 }));

        Stream<Integer> stream = list.parallelStream();
        stream.forEach(p -> System.out.println(p));
    }

    @Test
    // TODO Stream的创建
    // TODO 使用IntStream.range
    public void createStream5(){
        IntStream stream = IntStream.range(1, 9);
        stream.forEach(p -> System.out.println(p));
    }

    @Test
    // TODO Stream的创建
    // TODO 使用Random.ints()
    public void createStream6(){
        IntStream stream = new Random().ints(1, 10);
        // 有异常
        stream.forEach(p -> System.out.println(p));
    }

}
