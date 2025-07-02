package com.zhuo.zhuopicturebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.zhuo.zhuopicturebackend.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class ZhuoPictureBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhuoPictureBackendApplication.class, args);
    }

}
