package com.itheima;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;

public class LogTest {

    private static final Logger log = LoggerFactory.getLogger(LogTest.class);
    /*因为是面向接口的编程，所以这里导入的时候导入的是slf4j中的即可*/

    @Test
    public void testLog(){
//        System.out.println(LocalDateTime.now() + " : 开始计算...");
        log.debug("开始计算...");

        int sum = 0;
        int[] nums = {1, 5, 3, 2, 1, 4, 5, 4, 6, 7, 4, 34, 2, 23};
        for (int num : nums) {
            sum += num;
        }

        log.debug("计算结果为："+sum);
        log.debug("结束计算...");
    }

}
