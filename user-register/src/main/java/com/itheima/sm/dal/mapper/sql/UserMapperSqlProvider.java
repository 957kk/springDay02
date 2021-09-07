package com.itheima.sm.dal.mapper.sql;

import com.itheima.sm.domain.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.jdbc.SQL;

import java.util.Date;

/**
 * @Author byZhao
 * @Modify 2021/9/7 15:38
 * Talk is cheap. Show me the code.
 */
public class UserMapperSqlProvider {

    private static final String TABLE_NAME = "tb_user";

    public String insertUser(@Param("user") User user){
       return new SQL().INSERT_INTO(TABLE_NAME)
                .INTO_COLUMNS("id","name","password","create_time","update_time")
                 .INTO_VALUES("#{user.id}","#{user.name}","#{user.password}","#{user.createTime}","#{user.updateTime}")
                 .toString();
    }

    /*public static void main(String[] args) {

        UserMapperSqlProvider userMapperSqlProvider = new UserMapperSqlProvider();

        User user = new User();
        user.setId(10L);
        user.setName("zhaofeihu");
        user.setPassword("520");
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());

        String s = userMapperSqlProvider.insertUser(user);
        System.out.println(s);
    }*/
}
