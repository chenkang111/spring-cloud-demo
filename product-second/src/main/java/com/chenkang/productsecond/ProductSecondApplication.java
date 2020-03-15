package com.chenkang.productsecond;

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
public class ProductSecondApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductSecondApplication.class, args);
    }

}
