package com.beans;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

/**
 * Created by sunii on 2017.4.23.
 */
public class LocalDateExample {


    @Test
    // TODO  当前日期
    public void testLocalDate() {
        LocalDate today = LocalDate.now();
        System.out.println("当前日期是:" + today);
    }

    @Test
    // TODO 通过传入指定的参数创建LocalDate对象
    public void testLocalDateByExample() {
        LocalDate localDate = LocalDate.of(2017, Month.APRIL, 2);
        System.out.println("指定日期:" + localDate);
        /*
        * 根据有效输入创建日期，以下代码会抛异常，无效输入，2014年2月没有29日
        * LocalDate feb29_2014 = LocalDate.of(2014, Month.FEBRUARY, 29);
        * Invalid date 'February 29' as '2014' is not a leap year
        *
        */
    }

    @Test
    // TODO 获取不同时区的日期
    public void testDifferZone() {
        LocalDate todayKolkata = LocalDate.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("当前印度标准日期=" + todayKolkata);
    }

    @Test
    // TODO 从基准日期获取日期  例如： 01/01/1970
    public void testEpochDay() {
        LocalDate dateFromBase = LocalDate.ofEpochDay(365);
        System.out.println("基准日期的第365天= " + dateFromBase);
    }

    @Test
    // TODO 2014年的第一百天
    public void test() {
        LocalDate hundredDay2014 = LocalDate.ofYearDay(2014, 100);
        System.out.println("2014年的第一百天=" + hundredDay2014);
    }
}
