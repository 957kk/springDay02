package com.itheima.sm.domain;

import lombok.Data;

import java.util.Date;

/**
 * @Author byZhao
 * @Modify 2021/9/7 15:22
 * Talk is cheap. Show me the code.
 */
@Data
public class User {

    private Long id;
    private String name;
    private String password;
    private Date createTime;
    private Date updateTime;

}
