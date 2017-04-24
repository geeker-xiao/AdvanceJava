package com.beans;

import org.junit.Test;

import java.time.LocalTime;
import java.time.ZoneId;

/**
 * Created by sunii on 2017.4.23.
 */
public class LocalTimeExample {

    @Test
    public void testLocalTime(){
        LocalTime nowTime = LocalTime.now();
        System.out.println("当前时间是:"+nowTime);
    }

    @Test
    public void testLocalTimeByOf(){
        LocalTime specificTime = LocalTime.of(12, 20, 25, 40);
        System.out.println("Specific Time of Day=" + specificTime);
        System.out.println("具体时间是:" + specificTime);
    }

    @Test
    // 得到某一时区的时间
    public void testZoneTime(){
        LocalTime timeKolkata = LocalTime.now(ZoneId.of("Asia/Shanghai"));
        System.out.println("Current Time in IST=" + timeKolkata);
    }
}
