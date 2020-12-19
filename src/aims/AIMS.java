/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aims;

import db.ConnectSQL;
import model.User.Account;
import views.account.Login;


/**
 *
 * @author thanhhff
 */
public class AIMS {
    public static Account account = new Account();
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        
        Login login = new Login();
        login.setVisible(true);
      
    }
    
}
