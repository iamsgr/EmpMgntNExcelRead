package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBCon {
	private static Connection con = null;

	private DBCon() {}
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			if(con == null) {
				con = DriverManager.getConnection("jdbc:mysql://localhost/Employee?user=root&password=patil");
			}
		} catch (Exception e) {
			System.out.println("Error in connection" + e);
		}
		return con;
	}
}
