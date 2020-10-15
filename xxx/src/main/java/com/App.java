package com;

import com.beans.MyUser;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@MapperScan("com.mapper") //扫描mapper
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}

