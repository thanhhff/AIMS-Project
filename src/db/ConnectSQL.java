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
<<<<<<< HEAD
    private static final String PASSWORD = "";
=======
    private static final String PASSWORD = "root";
>>>>>>> 1d79c54eeffaa7d2a87bb330f7ef8a37b762f622
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
            e.printStackTrace();
            System.exit(0);
        }
        return null;
    }

    public static void sqlQueryUpdate(String sql_query) {
        try {
            conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            conn.createStatement().executeUpdate(sql_query);
        } catch (SQLException e) {
            e.printStackTrace();
            System.exit(0);
        }
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