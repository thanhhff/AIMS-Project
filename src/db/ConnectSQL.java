
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectSQL {
	private Connection conn = null;
	private static final String DB_URL = "jdbc:mysql://localhost:3306/itss?autoReconnect=true&useSSL=false";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	private Statement st = null;
	public ConnectSQL() {
		try {
			this.conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
			this.st = conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public ResultSet sqlQuery(String sql_query) {
		ResultSet rs = null;
		try {
			rs = this.st.executeQuery(sql_query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
}
