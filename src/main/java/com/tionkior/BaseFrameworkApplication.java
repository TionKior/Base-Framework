package com.tionkior;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author TionKior
 */


@SpringBootApplication
@MapperScan(basePackages = {"com.tionkior.mapper"})
public class BaseFrameworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseFrameworkApplication.class, args);
    }

}
