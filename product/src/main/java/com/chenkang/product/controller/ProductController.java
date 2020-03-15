package com.chenkang.product.controller;

import com.chenkang.user.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * <p>
 * 负载均衡 Ribbon 测试控制器
 * </p>
 *
 * @author chenkang
 * @date 2020/3/15
 */
@Slf4j
@RestController
@RequestMapping("product")
public class ProductController {


    @Autowired
    private RestTemplate restTemplate;


    @GetMapping
    public User ribbon() {
        User user = null;
        for (int i = 0; i < 10; i++) {
            user = restTemplate.getForObject("http://USER/user/userInfo/" + i, User.class);
        }
        return user;
    }


}
