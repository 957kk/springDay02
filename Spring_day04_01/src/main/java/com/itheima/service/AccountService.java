package com.itheima.service;

import com.itheima.domain.Account;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(isolation = Isolation.DEFAULT)
public interface AccountService {

    /**
     * 转账操作
     *
     * @param outName 出账用户名
     * @param inName  入账用户名
     * @param money   转账金额
     */
    @Transactional(
            readOnly = false,
            timeout = -1,
            isolation = Isolation.DEFAULT,
            rollbackFor = {},
            noRollbackFor = {},
            propagation = Propagation.REQUIRED
    )
    public void transfer(String outName, String inName, Double money);

}
