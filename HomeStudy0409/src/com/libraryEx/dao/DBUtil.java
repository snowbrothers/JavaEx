package com.libraryEx.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {

	static String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	static String id = "orauser";
	static String pw = "1234";

	// 커넥션 할 수 있는 메소드 정의해서 코드 절약
	public static Connection getConnection() {

		Connection conn = null;

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection(url, id, pw);
			conn.setAutoCommit(false);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return conn;

	}

	public static void commit(Connection conn) {

		try {
			conn.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void rollback(Connection conn) {

		try {
			conn.rollback();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void closeConnection(Connection conn) {

		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void closeConnection(Connection conn, Statement stmt) {

		// 자원 반환
		try {
			if (stmt != null && !stmt.isClosed())
				stmt.close();
			if (conn != null && !conn.isClosed())
				conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void closeConnection(Connection conn, Statement stmt, ResultSet rs) {
		
		try {
		
			if(rs != null && !rs.isClosed()) rs.close();
			if(stmt !=null && !stmt.isClosed()) stmt.close();		
			if(conn !=null && !conn.isClosed()) conn.close();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
