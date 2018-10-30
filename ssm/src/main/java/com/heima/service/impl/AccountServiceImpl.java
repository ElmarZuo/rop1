package com.heima.service.impl;

import com.heima.dao.AccountDao;
import com.heima.domain.Account;
import com.heima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    public AccountServiceImpl() {
    }

    @Override
    public List<Account> findAll() {
        System.out.println("业务层查询所有账户");
        return accountDao.findAll();
    }

    @Override
    public void save(Account account) {
        accountDao.save(account);
        System.out.println("业务层11，保存账户");

    }
}
