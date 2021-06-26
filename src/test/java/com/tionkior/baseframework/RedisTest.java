package com.tionkior.baseframework;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @ClassName : RedisTest
 * @Author : TionKior
 * @Date : 2021/6/26 11:09
 * @Version : V1.0
 * @Description :
 */

@SpringBootTest
public class RedisTest {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

}
