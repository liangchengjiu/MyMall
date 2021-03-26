package com.ricardo.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: MyMall
 * @description: 启动类
 * @author: liangchengjiu
 * @create: 2021-03-26 22:22
 **/
@SpringBootApplication
@MapperScan(value = {"com.ricardo.mall.**.mapper"})
public class MyMallApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyMallApplication.class, args);
    }
}
