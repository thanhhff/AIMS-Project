/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aims;

import db.ConnectSQL;
import views.MediaList.mediaList;
import views.account.AccountPanel;
import views.account.Login;


/**
 *
 * @author thanhhff
 */
public class AIMS {

    /**
     * @param args the command line arguments
     */

    public static Login frmLogin;
    public static mediaList MediaList;
    public static AccountPanel acc;
    public static void main(String[] args) {
        // TODO code application logic here
        
//         Test connect SQL 
//        ConnectSQL cn = new ConnectSQL();
            acc = new AccountPanel();
            acc.setVisible(true);
       //     frmLogin = new Login();
           // frmLogin.setVisible(true);
           
      
    }
    
}
