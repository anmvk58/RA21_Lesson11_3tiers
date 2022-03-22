package com.backend.presentationLayer;

import com.backend.businessLayer.AccountService;
import com.backend.businessLayer.IAccountService;
import com.entity.Account;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class AccountController {
    IAccountService service;

    public AccountController() {
        this.service = new AccountService();
    }

    public List<Account> getListAccounts() throws SQLException, IOException, ClassNotFoundException {
        return service.getListAccounts();
    }
}
