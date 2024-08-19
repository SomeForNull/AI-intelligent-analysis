package com.yunshu.aiintelligent.manager;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RedisLimiterManagerTest {
    @Resource
    private RedisLimiterManager redisLimiterManager;

    @Test
    void doRateLimit() {
        String userId = "1";
        try {
            for (int i = 0; i < 5; i++) {
                redisLimiterManager.doRateLimit(userId);
                System.out.println("第" + (i + 1) + "次访问");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}