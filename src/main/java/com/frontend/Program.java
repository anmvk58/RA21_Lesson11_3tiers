package com.frontend;

import com.backend.presentationLayer.AccountController;
import com.entity.Account;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class Program {
    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        AccountController controller = new AccountController();
        List<Account> accountList = controller.getListAccounts();

        for(Account a : accountList){
            System.out.println(a);
        }
    }
}
