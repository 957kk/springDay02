package com.itheima.sm.aop;

import com.alibaba.druid.util.StringUtils;
import com.itheima.sm.dal.cache.Cache;
import com.itheima.sm.domain.User;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @program: springDay02
 * @description:
 * @author: zhaoxuekai
 * @GitHub: 9527mmm
 * @Create: 2021-09-08 19:51
 **/
@Component
@Aspect
public class CacheAdvice {

    @Autowired
    Cache cache;

    private static final String SET_NAME = "SET_NAME_REGISTER";

    @Pointcut("execution(* com.itheima.sm.service..*(..))")
    public void pt() {

    }

    @Around("pt()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        User user = (User) args[0];

        if (!Optional.ofNullable(user).isPresent()) {
            return false;
        }
        String name = user.getName();
        if (StringUtils.isEmpty(name)) {
            return false;
        }
        boolean flag = cache.put(SET_NAME, name);
        // 用户名已经存在
        if (!flag) {
            return false;
        }

        Object proceed = pjp.proceed();
        return proceed;
    }
}
