package com.heima.dao;

import com.heima.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface AccountDao {

    @Insert(value="insert into account (name,age,money) values (#{name},#{age},#{money})")
    public void save(Account account);
    @Select("select * from account")
    public List<Account> findAll();
}
