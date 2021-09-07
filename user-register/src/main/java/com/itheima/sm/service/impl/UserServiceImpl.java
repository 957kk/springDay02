package com.itheima.sm.service.impl;

import com.itheima.sm.dal.cache.Cache;
import com.itheima.sm.dal.mapper.UserMapper;
import com.itheima.sm.domain.User;
import com.itheima.sm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author byZhao
 * @Modify 2021/9/7 15:22
 * Talk is cheap. Show me the code.
 */
//@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    Cache cache;

    private static final String SET_NAME = "SET_NAME_REGISTER";

    //  AOP 学完要改造
    @Override
    public boolean register(User user) {

        // 1、根据用户名查询redis， redis中存在，不允许注册  【set】
        String name = user.getName();
        boolean flag = cache.put(SET_NAME, name);
        // 用户名已经存在
        if (!flag) {
            return false;
        }

        // 2. redis 不存在，允许注册
        try {
            userMapper.insertUser(user);
        } catch (Exception e) {
            // 采集日志 ，设置埋点
            System.out.println("用户注册失败了 用户的id"+user.getId());
            return false;
        }

        //  4、提示用户注册成功
        return true;
    }
}
