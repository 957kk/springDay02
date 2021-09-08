package com.itheima.sm.service.impl;

import com.alibaba.druid.util.StringUtils;
import com.itheima.sm.dal.cache.Cache;
import com.itheima.sm.dal.mapper.UserMapper;
import com.itheima.sm.domain.User;
import com.itheima.sm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @Author byZhao
 * @Modify 2021/9/7 15:22
 * Talk is cheap. Show me the code.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /*@Autowired
    Cache cache;

    private static final String SET_NAME = "SET_NAME_REGISTER";*/

    //  AOP 学完要改造
    @Override
    public boolean register(User user) {
            userMapper.insertUser(user);
        return true;
    }
}
