package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


 

public class JDBCEx {

	// 데이터 베이스에 접근시 필요한 정보
	// ip, port, sid, 계정정보, 비밀번호 
	
	static  String url = "jdbc:oracle:thin:@localhost:1521:orcl";  // 주소
	static String id = "orauser"; // 아이디
	static String pw = "1234"; // 비밀번호

	
	// 약속이니까 기억할 것.
	public static void main(String[] args) {
		
		
		JDBCEx jdbc = new JDBCEx();
		
		
		
		System.out.println("==============================");
		
		//jdbc.insert();
		
		//jdbc.delete();
		jdbc.getList();

		jdbc.update();
		
		
		
		//Connection conn;
		
		try(Connection conn = DriverManager.getConnection(url, id, pw);
				Statement stmt = conn.createStatement();) {
			// 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 커넥션 얻어오기
			//conn = DriverManager.getConnection(url, id, pw);
			System.out.println("커넥션 얻기 성공" + conn );
			
			//Statement stmt = conn.createStatement(); // 쿼리를 실행하기 위해서 필요한 객체
			
			// 데이터 조회 할때 사용
			// executeQuery ( 쿼리 문장 입력 )
			// ResultSet : 결과 집합
			ResultSet rs = stmt.executeQuery("select * from book");
			rs.next();
		
			System.out.println("조회결과 : " + rs.getString(1)); 

			// 자원 반납
			rs.close();
			//stmt.close();
			//conn.close();

			
			// 데이터 생성, 수정, 삭제
			//stmt.executeUpdate("");
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			
			System.out.println(e.getMessage());
			// TODO: handle exception
		
		} catch (SQLException e) {
			// TODO Auto-genesrated catch block
			e.printStackTrace();
		}
		
	}


	// FileDao
	public void insert() {
		// 책의 리스트를 반환 할 수 있는 코드 작성 가능
		
		// 클래스 로딩
		
		Connection conn2;
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 커넥션 얻어오기
			conn2 = DriverManager.getConnection(url, id, pw);
			System.out.println("커넥션 성공");
			// 쿼리 실행 
			Statement stmt2 = conn2.createStatement();
			
			
			ResultSet res2 = stmt2.executeQuery("insert into book VALUES (11, '난중일기' , '이순신', 'n' , sysdate, null)");
			
			System.out.println(res2 + "건 처리되었습니다.");
			
			
			// 결과집합에서 다음줄을 돌려받아야한다.
			
			System.out.println("size : " + res2.getFetchSize());
			
			
			
			
//			while(res2.next()) {
//				
//				
//				System.out.println("조회결과 : " + res2.getInt(1) +" "+ res2.getString(2) 
//				+" "+ res2.getString(3) +" "+ res2.getString(4) 
//				+" "+ res2.getDate(5) +" "+ res2.getDate(6) );
//			}
//			
			
				
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	public void delete() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
			// 커넥션을 얻어오기 위해 필요한 정보
			Connection conn = DriverManager.getConnection(url,id,pw);
			conn.setAutoCommit(false);

			// 쿼리 실행 준비
			Statement stmt =  conn.createStatement();
		
			// 몇건이 처리 되었는지 반환
			int res = stmt.executeUpdate("delete from book");
			System.out.println(res + "건 처리 되었습니다.");
			
			//conn.rollback();
			System.out.println("롤백 되었습니다.");
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
public void update() {
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
			// 커넥션을 얻어오기 위해 필요한 정보
			Connection conn = DriverManager.getConnection(url,id,pw);
			conn.setAutoCommit(false);

			// 쿼리 실행 준비
			Statement stmt =  conn.createStatement();
		
			// 몇건이 처리 되었는지 반환
			int res = stmt.executeUpdate("update book SET title = '라플라스의 마녀' where no = 3");
			
			System.out.println(res + "건 처리 되었습니다.");
			
			//conn.rollback();
			System.out.println("롤백 되었습니다.");
			
			
			
		} catch (ClassNotFoundException e) {

			System.out.println("jdbc 라이브러리를 확인해주세요.");
			e.printStackTrace();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	// FileDao
	public void getList() {
		// 책의 리스트를 반환 할 수 있는 코드 작성 가능
		
		// 클래스 로딩
		
		Connection conn2;
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 커넥션 얻어오기
			conn2 = DriverManager.getConnection(url, id, pw);
			System.out.println("커넥션 성공");
			// 쿼리 실행 
			Statement stmt2 = conn2.createStatement();
			
			
			ResultSet res2 = stmt2.executeQuery("select * from book");
			
			// 결과집합에서 다음줄을 돌려받아야한다.
			
			System.out.println("size : " + res2.getFetchSize());
			
			
			List<Book> list = new ArrayList<>();
			
			while(res2.next()) {
			
				
				int no = res2.getInt(1);
				String title = res2.getString(2);
				String author = res2.getString(3);			
				String isRent = res2.getString(4);
				Date regdate = res2.getDate(5);
				Date editDate = res2.getDate(6);
				System.out.println();
				
				Book book = new Book(no, title, author, isRent, regdate, editDate);
			
				list.add(book);
			}
			
			System.out.println(list);
			for(Book book : list ) {
				
				
				
				System.out.println(book.toString());
			}

			
//			while(res2.next()) {
//				
//				
//				System.out.println("조회결과 : " + res2.getInt(1) +" "+ res2.getString(2) 
//				+" "+ res2.getString(3) +" "+ res2.getString(4) 
//				+" "+ res2.getDate(5) +" "+ res2.getDate(6) );
//			}
//			
			
				
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	


}
