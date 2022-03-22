package com.backend.dataLayer;

import com.entity.Account;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface IAccountRepository {
    public List<Account> getListAccounts() throws IOException, SQLException, ClassNotFoundException;
}
