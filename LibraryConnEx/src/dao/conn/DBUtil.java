package dao.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * DB와 커넥션, 커밋, 롤백, 자원 반환 의 메소드를 모아놓은 클래스
 * @author user
 *
 */
public class DBUtil {

	public static void main(String[] args) {

		System.out.println(DBUtil.getConnection());

	}

	/**
	 * DB 연결해 커넥션을 가져올때 사용하는 메소드 static >> 정적 멤버 선언을 통해 자유롭게 사용할 수 있도록 한다.
	 * 
	 * @return
	 */
	public static Connection getConnection() {

		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "orauser";
		String pw = "1234";

		Connection conn = null;

		try {
			// 오류가 생길 수 있으니 try/catch 문으로 처리해준다.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, id, pw);

			conn.setAutoCommit(false);

			System.out.println("커넥션 성공 ! !");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return conn;

	}

	// 커밋
	public static void commit(Connection conn) {

		try {
			if (conn == null && !conn.isClosed()) {
				conn.commit();
			}
		} catch (SQLException e) {
			System.err.println("커밋 오류 발생");
			e.printStackTrace();
		}

	}

	// rollback
	public static void rollBack(Connection conn) {

		try {
			if (conn == null && !conn.isClosed()) {
				conn.rollback();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// close
	public static void close(Connection conn, Statement stmt) {

		try {
			if (conn == null && !conn.isClosed()) {
				conn.close();
			}
			if (stmt == null && !stmt.isClosed()) {
				stmt.close();

			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	public static void close(Connection conn, Statement stmt, ResultSet rs) {
		
		try {
			
			if (conn == null && !conn.isClosed()) {
				conn.close();
			}
			if (stmt == null && !stmt.isClosed()) {
				stmt.close();

			}
			if (rs == null && !rs.isClosed()) {
				rs.close();
				
			}
			
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
