package com.chenkang.usersecond;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @author chenkang
 */
@RefreshScope
@EnableDiscoveryClient
@SpringBootApplication
public class UserSecondApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserSecondApplication.class, args);
    }

}
