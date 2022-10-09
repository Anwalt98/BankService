package com.company.bankservice.app;

import com.company.bankservice.entity.BankAccount;
import com.company.bankservice.entity.User;
import io.jmix.core.DataManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankAccountService {

    @Autowired
    DataManager dataManager;
    public List<BankAccount> findBankAccountByUserId(User user){

       return dataManager.load(BankAccount.class).query("select id from BankAccount where user_id = " + user.getId()).list();
    }

    public void makeTransaction()
    {}
}