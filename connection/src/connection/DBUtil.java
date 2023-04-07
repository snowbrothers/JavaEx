package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
 
	/**
	 * 
	 * DB 커넥션을 생성하여 반환합니다.
	 * @return
	 */
	
	public static  Connection getConnection() {
		
		// 데이터 베이스에 접근시 필요한 정보 : 접속정보
		// ip, port, sid, 계정정보, 비밀번호 
		 String url = "jdbc:oracle:thin:@localhost:1521:orcl";  // 주소
		 String id = "orauser"; // 아이디
		 String pw = "1234"; // 비밀번호

		 Connection conn = null; 
		 
		try {
		
			// 클래스 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 커넥션을 얻어와서 return 에서 반환
			conn = DriverManager.getConnection(url,id,pw);
			// 롤백하지 않고 커넥션이 종료되면 커밋됩니다.
			// 커넥션이 종료될때 커밋! 한다.
			
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
	
	/**
	 * 커넥션을 매개변수로 받아온다.
	 * @param conn
	 */
	public static void closeConnection(Connection conn) {
		
		try {
		
			if(conn != null && conn.isClosed()) conn.close();
		
		
		} catch (SQLException e) {
		
			// TODO Auto-generated catch block
			e.printStackTrace();
	
		} {
			
			
		}
		
	}
	
	
	
	public static void closeConnection(Connection conn, Statement stmt, ResultSet rs) {
		
		try {
		
			if(conn != null && !conn.isClosed()) conn.commit();
			
			if(stmt != null && !stmt.isClosed()) stmt.close();
			if(conn != null && !conn.isClosed()) conn.close();
			if(rs !=null && !rs.isClosed()) rs.close();
			
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
	
	
	
}
