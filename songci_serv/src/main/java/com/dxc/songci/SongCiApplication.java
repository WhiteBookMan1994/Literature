package com.dxc.songci;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan(value = "com.dxc.songci.model.mapper")
@ComponentScan(basePackages = "com.dxc.songci")
@SpringBootApplication
public class SongCiApplication {
    public static void main(String[] args) {
        SpringApplication.run(SongCiApplication.class, args);
    }
}
