package com.itheima.sm.dal.mapper;

import com.itheima.sm.dal.mapper.sql.UserMapperSqlProvider;
import com.itheima.sm.domain.User;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author byZhao
 * @Modify 2021/9/7 15:19
 * Talk is cheap. Show me the code.
 */
@Mapper
public interface UserMapper {

     @InsertProvider(type = UserMapperSqlProvider.class   ,method = "insertUser")
     void insertUser(@Param("user")User user);
}
