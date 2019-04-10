package com.kemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring boot 启动入口
 *
 * @author Jack
 * @since 2019-04-02
 */
@SpringBootApplication
public class RedissonApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedissonApplication.class, args);
    }
}
