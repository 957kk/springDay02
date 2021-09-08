package com.itheima.sm.config;

import org.springframework.context.annotation.*;

import java.util.Optional;

/**
 * @program: springDay02
 * @description:
 * @author: zhaoxuekai
 * @GitHub: 9527mmm
 * @Create: 2021-09-07 14:35
 **/
@Configuration
@ComponentScan("com.itheima")
@PropertySource({"jdbc.properties"})
@Import({MybatisConfig.class, JDBCConfig.class})
public class SpringConfig {
    
}
