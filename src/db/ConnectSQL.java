
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ConnectSQL {
	private static Connection conn = null;
	private static final String DB_URL = "jdbc:mysql://localhost:3306/itss?autoReconnect=true&useSSL=false";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	private static Statement st = null;
        
        
        public ConnectSQL() {
        try {
            conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            System.out.println("Kết nối SQL thành công !");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi ConnectSQL: kết nối tới SQL thất bại !");
        }
    }
        
	public static ResultSet sqlQuery(String sql_query) {  
		try {
                    conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
                    st = conn.createStatement();  
                    return st.executeQuery(sql_query);
		} catch (SQLException e) {
                    System.out.println("Error sqlQuery");
                    System.exit(0);
		}
		return null;
	}
        
        public static int sqlUpdate(String sql_query) {  
		try {
                    conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
                    st = conn.createStatement();  
                    return st.executeUpdate(sql_query);
		} catch (SQLException e) {
                    System.out.println("Error Update");
		}
		return 0;
	}
     
}


