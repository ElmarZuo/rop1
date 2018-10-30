package com.heima.controller;

import com.heima.domain.Account;
import com.heima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {


    @Autowired
    private AccountService as;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层：查询账户");
        List<Account> list = as.findAll();
        model.addAttribute("list",list);
        return "list";
    }
    @RequestMapping("/save")
    public void save(Account account, HttpServletResponse response, HttpServletRequest request) throws Exception {
        System.out.println("业务层：保存账户");
        as.save(account);
        response.sendRedirect(request.getContextPath()+"/account/findAll");
      return;
    }

}
