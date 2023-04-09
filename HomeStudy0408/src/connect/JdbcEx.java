package connect;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcEx {

	
	// 데이터베이스 DB 에 접근 할때 필요한 정보들
	// id, port, sid, 계정정보, 비밀번호
	static String url ="jdbc:oracle:thin:@localhost:1521:orcl"; 
	static String id = "orauser"; // 아이디
	static String pw = "1234"; // 비밀번호
	
	
	
	public static void main(String[] args) {
		
		
		
		JdbcEx jdb = new JdbcEx();
		
		
		//jdb.getList();
		//jdb.insert();
		
		//jdb.delete();
		jdb.getUpdate();
		
	}
	
	
	public void insert() {
		
		
		
		
		Connection conn;
		
		try {
		
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
			conn = DriverManager.getConnection(url, id, pw);
			
			Statement stmt = conn.createStatement();
			
			ResultSet res = stmt.executeQuery("insert into book (no, title, author) values (10, '혼공자', '신용섭')");
			
			System.out.println("삽입 되었습니다.");			
		
			
			
		} catch (ClassNotFoundException e) {
		
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void delete() {
		
		Connection conn;
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, id, pw);
			Statement stmt = conn.createStatement();
			int res = stmt.executeUpdate("delete book where no = 7");
			
			System.out.println(res + "건 삭제 되었습니다.");
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	public void getUpdate() {
		
		
		Connection conn;
		
		
		try {
			
			conn = DriverManager.getConnection(url, id, pw);
			Statement stmt = conn.createStatement();
			int res = stmt.executeUpdate("update book set title = '조선왕조실록' where title = '난중일기'");
			
			System.out.println(res + "건 수정되었습니다.");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	
	
	// 리스트 반환 할 수 잇는 코드 작성
	public void getList() {
		
		// 클래스 로딩
		
		Connection conn;
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
	
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("커넥션 성공");
			
			Statement  stmt = conn.createStatement();
			
			ResultSet res = stmt.executeQuery("select * from book order by no desc");
			
			
			List<Book> list = new ArrayList<>();
			
			
			
			while(res.next()) {
				
				
				
				int no = res.getInt(1);
				String title = res.getString(2);
				String author = res.getString(3);
				String isRent = res.getString(4);
				
				
				
				
				Book book = new Book(no, title, author, isRent);
				
				list.add(book);
				
			}
			
			System.out.println("=========================");
			System.out.println(list);
			
			for(Book book : list) {
				
				
				System.out.println(book.toString());
			}

			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
		
			e.printStackTrace();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
}
