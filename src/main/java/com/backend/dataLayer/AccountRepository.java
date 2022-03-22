package com.backend.dataLayer;

import com.entity.Account;
import com.utils.JDBCUtils;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccountRepository implements IAccountRepository{
    public JDBCUtils jdbcUtils;

    public AccountRepository() {
        jdbcUtils = new JDBCUtils();
    }

    public List<Account> getListAccounts() throws IOException, SQLException, ClassNotFoundException {
        Connection connection = jdbcUtils.getConnection();

        //Tạo đối tượng Statement để thực hiện querry
        Statement statement = connection.createStatement();

        //Hứng dữ liệu của truy vấn
        ResultSet resultSet = statement.executeQuery("SELECT * FROM account");

        List<Account> accountList = new ArrayList<>();

        // xử lý in kết quả:
        while(resultSet.next()){
            Account temp = new Account(resultSet.getInt(1), resultSet.getString(2), resultSet.getInt(3));
            accountList.add(temp);
        }
        jdbcUtils.disconnect();
        return accountList;
    }
}
