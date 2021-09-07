package com.itheima.sm.service;

import com.itheima.sm.config.SpringConfig;
import com.itheima.sm.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * @Author byZhao
 * @Modify 2021/9/7 16:58
 * Talk is cheap. Show me the code.
 */
@RunWith(SpringRunner.class)
@SpringJUnitConfig(SpringConfig.class)
public class UserServiceTest {

    @Autowired
    UserService userService;

    @Test
    public void testRegister(){
        User user = new User();
        user.setId(3L);
        user.setName("lisi3");
        user.setPassword("1314");
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        boolean register = userService.register(user);
        System.out.println(register);
    }

}
