package com.itheima.sm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPool;

/**
 * @Author byZhao
 * @Modify 2021/9/7 16:06
 * Talk is cheap. Show me the code.
 */
@Configuration
public class RedisConfig {

    // 第三方bean的加载

    @Bean
    public JedisPool jedisPool() {
        JedisPool jedisPool = new JedisPool("127.0.0.1", 6379);
        return jedisPool;
    }

}
