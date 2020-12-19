package controller.User;

import db.ConnectSQL;
import model.User.Account;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UserController {

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

    public int CreateAccount(Account acc) {
        String sql = "INSERT INTO Users (email, password, `is_admin?`) VALUES ('" + acc.getUsername() + "', '" + acc.getPassword() + "', '" + acc.getLv() + "')";
        int insert = ConnectSQL.sqlUpdate(sql);

        return insert;
    }
    
    public int isAdmin(Account acc){
        int level = 0;
        String sql = "SELECT `is_admin?` FROM Users WHERE email = '" + acc.getUsername() + "'";
        
        try {
            ResultSet rs = ConnectSQL.sqlQuery(sql);
            
            while (rs.next()) {
               level = rs.getInt(1);
               System.out.println(level);
            }
        } catch (SQLException ex) {
        }
        
        return level;
    }
    
    public Account getAccount(int user_id){
        Account acc = null;
        
        String sql = "Select * from Users where user_id = '" + user_id + "'";
        
        try {
            ResultSet rs = ConnectSQL.sqlQuery(sql);
            while (rs.next())
            {
                acc = new Account(rs.getInt(1), rs.getInt(4), rs.getString(2));
            }
        }catch (SQLException ex) {
        
        }
        
        return acc;
    }
    
    public ArrayList<Account> getListAccount(){
        ArrayList<Account> arrAccount = new ArrayList<>();
    
        String sql = "SELECT * FROM `Users`";
        
        try {
            ResultSet rs = ConnectSQL.sqlQuery(sql);

            while (rs.next()) {
                Account acc = new Account(rs.getInt(1), rs.getInt(4), rs.getString(2));
                arrAccount.add(acc);
                
            }
        } catch (SQLException ex) {
        }
       
        return arrAccount;
    }
    
    public boolean deleteAccount(ArrayList<Integer> ListAccount){
        boolean check = true;
        
        String sql;
        for (int user_id : ListAccount) {
            sql = "Delete From Users Where user_id = '" + user_id + "'";
            int returnValue = ConnectSQL.sqlUpdate(sql);
            if (returnValue == 0)
                return false;
        }
        return check;
    }
    
//    public static void main (String[] args)
//    {
//        
//        
//    }

}
