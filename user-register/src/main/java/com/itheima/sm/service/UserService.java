package com.itheima.sm.service;

import com.itheima.sm.domain.User;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author byZhao
 * @Modify 2021/9/7 15:22
 * Talk is cheap. Show me the code.
 */
public interface UserService {
    /**
     * user Register
     *
     * @param user
     * @return
     */
    @Transactional(
            readOnly = false,
            timeout = -1,
            isolation = Isolation.DEFAULT,
            rollbackFor = {Exception.class},
            noRollbackFor = {},
            propagation = Propagation.REQUIRED
    )
    boolean register(User user);

}
