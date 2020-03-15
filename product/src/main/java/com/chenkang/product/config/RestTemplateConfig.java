package com.chenkang.product.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author chenkang
 * @date 2020/3/15
 */
@Configuration
public class RestTemplateConfig {

    /**
     * 多节点负载均衡 @Balanced
     * 指定bean 名称为 restTemplate
     *
     * @return
     */
    @LoadBalanced
    @Bean(name = "restTemplate")
    public RestTemplate initRestTemplate() {
        return new RestTemplate();
    }


}
