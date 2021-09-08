package com.itheima.sm.dal.cache.impl;

import com.itheima.sm.dal.cache.Cache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.JedisPool;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author byZhao
 * @Modify 2021/9/7 15:20
 * Talk is cheap. Show me the code.
 */
@Component
public class RedisCache implements Cache {

    @Autowired
    JedisPool jedisPool;

    @Override
    public boolean put(String key, String value) {
        Long sadd = jedisPool.getResource().sadd(key.getBytes(), value.getBytes());
        if (sadd == 0) {
            return false;
        }
        if (sadd == 1) {
            return true;
        }
        return false;
    }

    @Override
    public Set<String> get(String key) {
        Set<byte[]> smembers = jedisPool.getResource().smembers(key.getBytes());
        Set<String> set = new HashSet<>();
        for (byte[] smember : smembers) {
            String s = new String(smember);
            set.add(s);
        }
        return set;
    }

    @Override
    public boolean sRem(String key, String value) {
        Long srem = jedisPool.getResource().srem(key.getBytes(), value.getBytes());
        System.out.println(srem);
        if (srem == 0) {
            return false;
        }
        if (srem == 1) {
            return true;
        }
        return false;
    }


}
