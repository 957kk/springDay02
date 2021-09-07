package com.itheima.sm.config;

import org.springframework.context.annotation.*;

/**
 * @Author byZhao
 * @Modify 2021/9/7 15:47
 * Talk is cheap. Show me the code.
 */
@Configuration  // 声明 当前类是一个配置类，类似xml
@ComponentScan(basePackages = "com.itheima.sm") // 包扫描
@PropertySource(value = {"classpath:jdbc.properties"})  // 加载属性文件
@Import({DataSourceConfig.class, MybatisConfig.class, RedisConfig.class})  // 导入其他配置类
@EnableAspectJAutoProxy
public class SpringConfig {


}
