package controller.User;

import db.ConnectSQL;
import model.User.Account;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountController {
    public boolean CheckLogin(Account acc) {
        boolean check = false;
        String sql;
        sql = "SELECT* FROM Users WHERE email = '" + acc.getUsername() + "' AND PASSWORD = '" + acc.getPassword() + "'";
        try {
            ResultSet rs = ConnectSQL.sqlQuery(sql);

            while (rs.next()) {
                check = true;
            }
        } catch (SQLException ex) {
        }
        return check;
    }
}
