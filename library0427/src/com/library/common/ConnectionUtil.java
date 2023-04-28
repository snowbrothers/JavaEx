package com.library.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 * 
 * DB Connection 을 생성하여 반환 합니다.
 * @author lhg
 *
 */
public class ConnectionUtil {

	
	public static void main(String[] args) {
		
		
		// 접속정보 (ip, port, sid, 계정id, 비밀번호)
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "library";
		String pw = "1234";
		
		
		Connection conn = null;
		
		try {
		
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
					// 데이터 베이스에 접근하기 위한 정보를 매개변수로 준다.
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println(conn);
			System.out.println("프로그램 종료");
			
			// 한줄로 작성 하면 조건의 영향을 받도록 작성 가능
			if(!conn.isClosed()) conn.close();
			
		} catch (ClassNotFoundException e) {
			System.err.println("라이브러리를 확인해주세요.");
			System.err.println(e.getMessage());
			
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	/**
	 * 
	 * DB Connection 을 반환 합니다.
	 * @return
	 */
	public static Connection getConnection() {
		
		Connection conn = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "library";
		String pw = "1234";
		
		try {
			
			// 클래스의 이름으로 클래스 로딩, 확인작업
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,id,pw);
			
			// 트랜잭션 처리를 위해 자동커밋을 false 로 설정한다.
			// -> 커넥션이 종료 되는 시점에 커밋
			conn.setAutoCommit(false);
			
//			System.out.println("- 커넥션 성공 -");
			
			//if(!conn.isClosed()) conn.close();
		
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
				System.err.println(e.getMessage());
			} catch (SQLException e) {
				
				System.err.println(e.getMessage());
				e.printStackTrace();
			}
			
			
			return conn;
		}
	


	public void rollback(Connection conn) {
		
		try {
			conn.rollback();
		
		} catch (SQLException e) {

			System.err.println("rollback 실패");
			e.printStackTrace();
		}
	}
	
	
	public static void close(Connection conn) {

			try {
			
				if(conn != null && !conn.isClosed()) conn.close();
			
			} catch (SQLException e) {
				System.out.println("conn.close() 실패");
				e.printStackTrace();
			}
	}

	
	
	public static void close(Connection conn, Statement stmt) {

		try {
			
			if(stmt != null && !stmt.isClosed()) stmt.close();
			if(conn != null && !conn.isClosed()) conn.close();
			
		} catch (SQLException e) {
			System.out.println("stmt.close() 실패");
			e.printStackTrace();
		}
}
	
	
	
	
	public static void close(Connection conn, Statement stmt, ResultSet rs) {

		try {
			
			if(rs != null && !rs.isClosed()) rs.close();
			if(stmt != null && !stmt.isClosed()) stmt.close();
			if(conn != null && !conn.isClosed()) conn.close();
			
		} catch (SQLException e) {
			System.out.println("rs.close() 실패");
			e.printStackTrace();
		}
}

	
	
	
	
}

