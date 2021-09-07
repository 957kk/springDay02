package com.itheima.sm.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @Author byZhao
 * @Modify 2021/9/7 15:48
 * Talk is cheap. Show me the code.
 */
@Configuration
public class MybatisConfig {

    private static final String DOMAIN_PACKAGE="com.itheima.sm.domain";
    private static final String MAPPER_PACKAGE="com.itheima.sm.dal.mapper";


    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(@Autowired DataSource dataSource){

        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setTypeAliasesPackage(DOMAIN_PACKAGE);
        return sqlSessionFactoryBean;
    }


    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage(MAPPER_PACKAGE);
        return  mapperScannerConfigurer;
    }





}
