package com.heima.service;

import com.heima.domain.Account;

import java.util.List;

public interface AccountService {

    public List<Account> findAll();


    public void save(Account account);


}
