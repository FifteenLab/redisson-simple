package com.kemo.simple;

import org.redisson.Redisson;
import org.redisson.api.LocalCachedMapOptions;
import org.redisson.api.RAtomicLong;
import org.redisson.api.RLocalCachedMap;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.redisson.codec.FstCodec;
import org.redisson.codec.JsonJacksonCodec;
import org.redisson.config.Config;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public class SimpleApplication {

    private static RedissonClient redissonClient;

    static {
        Config config = new Config();
        config.useSingleServer().setAddress("redis://127.0.0.1:6379");
        redissonClient = Redisson.create(config);
    }

    public static void main(String[] args) {
        RLocalCachedMap<String, String> localCachedMap = redissonClient.getLocalCachedMap("local_map_test", new JsonJacksonCodec(), LocalCachedMapOptions.defaults());
        localCachedMap.put("k1", "v1");

        redissonClient.shutdown();
    }
}
