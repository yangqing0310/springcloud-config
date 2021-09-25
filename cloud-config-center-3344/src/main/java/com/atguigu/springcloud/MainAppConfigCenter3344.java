package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Auther: yangqing
 * @Date: 2021/9/24 - 09 - 24 - 12:19
 * @Description: com.atguigu.springcloud
 * @version: 1.0
 */
@SpringBootApplication
@EnableConfigServer
public class MainAppConfigCenter3344 {
    public static void main(String[] args) {
            SpringApplication.run(MainAppConfigCenter3344.class, args);
        }
}
