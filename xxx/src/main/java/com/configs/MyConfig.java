package com.configs;

import com.beans.MyCat;
import com.beans.MyUser;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
//类似于<beans></beans>，标记该类是一个配置类
@Configuration
public class MyConfig {
    @Value("jack")
    private String name;
    @Bean
    public MyCat getMyCat(){
       return  new MyCat();
    }
    @Bean//类似于<bean> ，相当于往ioc放一个MyUser，名字默认是方法名
    public MyUser getMyUser(){
        MyUser u=new MyUser();
        u.setUsername(name);
        u.setCat(getMyCat());
        return u;
    }
}
