package com.itheima.sm.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @Author byZhao
 * @Modify 2021/9/7 15:47
 * Talk is cheap. Show me the code.
 */
@Configuration
public class DataSourceConfig {

    @Value("${jdbc.db.driver}")
    private String driverClassName;
    @Value("${jdbc.db.url}")
    private String url;
    @Value("${jdbc.db.username}")
    private String username;
    @Value("${jdbc.db.password}")
    private String password;



    @Bean
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }


}
