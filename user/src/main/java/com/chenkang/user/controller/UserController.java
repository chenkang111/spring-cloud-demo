package com.chenkang.user.controller;

import com.chenkang.user.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * <p>
 * Ribbon(负载均衡)  测试
 * </p>
 *
 * @author chenkang
 * @since 2020/3/15
 */
@Slf4j
@RestController
@RequestMapping("user")
public class UserController {

    /**
     * 由boot来自动装配了
     */
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/userInfo/{id}")
    public User findUserInfo(@PathVariable("id") String id) {
        /*获取微服务*/
        ServiceInstance serviceInstance = discoveryClient.getInstances("USER").get(0);
        log.info("微服务地址：{}，实例标识：{}", serviceInstance.getHost(), serviceInstance.getInstanceId());
        return User.builder(id, "张三", "123456");
    }

}
