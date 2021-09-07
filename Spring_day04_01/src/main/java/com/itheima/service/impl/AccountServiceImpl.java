package com.itheima.service.impl;


import com.itheima.dao.AccountDao;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public void transfer(String outName, String inName, Double money) {

        accountDao.inMoney(outName, money);
        //int i = 1 / 0;
        accountDao.outMoney(inName, money);

    }


//    public void transfer(String outName, String inName, Double money) {
//        //开启事务
//        PlatformTransactionManager ptm = new DataSourceTransactionManager(dataSource);
//        //事务定义
//        TransactionDefinition td = new DefaultTransactionDefinition();
//        //事务状态
//        TransactionStatus ts = ptm.getTransaction(td);
//
//        accountDao.inMoney(outName,money);
//        int i = 1/0;
//        accountDao.outMoney(inName,money);
//
//        //提交事务
//        ptm.commit(ts);
//    }

}
