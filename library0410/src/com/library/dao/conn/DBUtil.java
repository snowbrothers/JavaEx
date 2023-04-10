package com.library.dao.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.library.dao.BookDao;

public class DBUtil {

	public static void main(String[] args) {

		System.out.println(DBUtil.getConnection());

	}

	public static Connection getConnection() {

		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "orauser";
		String pw = "1234";

		// 생성 후 반환
		Connection conn = null;

		try {

			// 클래스 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, id, pw);

			// (트랜잭션 처리) setAutoCommit : 일괄적으로 커밋하거나 롤백 할 수 있도록 도와주는 메서드

			conn.setAutoCommit(false);

			System.out.println("==== 커넥션 성공 ====");

		} catch (ClassNotFoundException e) {
			System.err.println("라이브러리를 확인 해주세요.");
			System.err.println(e.getMessage());
			e.printStackTrace();

		} catch (SQLException e) {

			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		return conn;
	}

	public static void commit(Connection conn) {

		try {

			if (conn == null && !conn.isClosed()) {
				conn.commit();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void rollBack(Connection conn) {

		try {

			// conn 이 null 이 아니고/ 닫혀 있다면 롤백.
			if (conn == null && !conn.isClosed()) {
				conn.rollback();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void close(Connection conn, Statement stmt) {

		try {

			if (stmt == null && !stmt.isClosed()) {
				stmt.close();
			}

			if (conn == null && !conn.isClosed()) {
				conn.close();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void close(Connection conn, Statement stmt, ResultSet rs) {

		try {

			if (stmt == null && !stmt.isClosed()) {
				stmt.close();
			}

			if (conn == null && !conn.isClosed()) {
				conn.close();
			}

			if (rs == null && !rs.isClosed()) {

				rs.close();
			}

		} catch (SQLException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}

	}
}
