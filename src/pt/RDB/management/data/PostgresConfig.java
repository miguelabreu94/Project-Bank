package pt.RDB.management.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresConfig {

	static String url = "jdbc:postgresql://localhost:5432/postgres";
	static String dbUsername = "postgres";
	static String dbPassword = "12345";
	
	public static Connection obterConnection() {
		try {
			return DriverManager.getConnection(url, dbUsername,dbPassword);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}
}
