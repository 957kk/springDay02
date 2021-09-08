package com.itheima.sm.dal.cache;

import java.util.Set;

/**
 * @Author byZhao
 * @Modify 2021/9/7 15:19
 * Talk is cheap. Show me the code.
 */
public interface Cache {


      boolean  put(String key ,String value);

      Set<String> get(String key);

      boolean sRem(String key ,String value);



}
