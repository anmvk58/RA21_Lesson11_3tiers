package com.backend.businessLayer;

import com.backend.dataLayer.AccountRepository;
import com.backend.dataLayer.IAccountRepository;
import com.entity.Account;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class AccountService implements IAccountService{
    IAccountRepository repository;

    public AccountService() {
        this.repository = new AccountRepository();
    }

    public List<Account> getListAccounts() throws SQLException, IOException, ClassNotFoundException {
        return repository.getListAccounts();
    }
}
