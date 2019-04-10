package com.kemo.controller;


import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 缓存测试Controller
 *
 * @author Jack
 * @since 2019-04-02
 */
@RestController
@RequestMapping("/cache")
public class CacheController {

    @Autowired
    private RedissonClient redissonClient;

    @GetMapping(value = {"", "/"})
    public String get(@RequestParam(name = "key") String key) {
//        return redissonClient.get
        return null;
    }
}
