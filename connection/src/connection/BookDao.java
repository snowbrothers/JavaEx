package connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookDao {
 
	public static void main(String[] args) {
	
		BookDao dao = new BookDao();
		
		//dao.insert(20, "반지의 제빵왕" , "김탁구", "n");
		
		//dao.delete();
		
		//dao.update(10);
		dao.getList();
	}
	
	
	// 데이터 삽입
	public void insert(int no, String title, String author, String isRent) {
		// 정적멤버 static 
	
		try {
		
			Connection conn = DBUtil.getConnection();
			Statement stmt = conn.createStatement();

			
			String sql = "insert into book VALUES ("+no+", '"+title+"' , '"+author+"', '"+isRent+"' , sysdate, null)";
			// 삽입,  수정, 삭제.
			int res = stmt.executeUpdate(sql);
			
			System.out.println(res + "건 처리되었습니다.");
			
			// 자원 반납
			DBUtil.closeConnection(conn, stmt, null);
			
		} catch (SQLException e) {
		
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	// 데이터 수정
	public void update(int no) {
		
		
		try {
			
			Connection conn = DBUtil.getConnection();
			Statement stmt = conn.createStatement();
		
			String sql = "update book SET title = '라플라스의 마녀' where no = 3";
			int res = stmt.executeUpdate(sql);
			
			System.out.println(res + "건 수정되었습니다.");
			
			// 1000 분의 1초 = > 5 초
			// 데이터 베이스에 연결 확인
			System.out.println("대기");
			Thread.sleep(5000);
			
			DBUtil.closeConnection(conn, stmt, null);
			System.out.println("자원반납");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
	
	
	// 데이터 삭제
	public void delete() {
		

		try {
			
			// 커넥션
			Connection conn = DBUtil.getConnection();
			// 쿼리실행
			Statement stmt = conn.createStatement();
		
			
			String sql = "DELETE from book where no = 11";
			int res = stmt.executeUpdate(sql);
			
			System.out.println(res + "건 삭제되었습니다.");
			
			
			DBUtil.closeConnection(conn, stmt, null);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	// 데이터 조회
	public List<Book> getList(){
		
		List<Book> list = new ArrayList<>();
		
		
		try {
		
			Connection conn = DBUtil.getConnection();
			Statement stmt = conn.createStatement();

			
			// 질의 결과를 결과집합으로 받아 옵니다.
			// 조회 시에는 결과 집합을 받아와야 합니다. 
			ResultSet res = 
						stmt.executeQuery("select * from book order by no asc");
			
			res.next();
		
			
			
			
			while(res.next() == true) {
				
				int no = res.getInt(1);
				String title = res.getString(2);
				String author = res.getString(3);
				String isRent = res.getString(4);
				Date regdate = res.getDate(5);
				Date editDate = res.getDate(6);
				
			
				Book book = new Book(no, title, author, isRent, regdate, editDate);
				
				
				list.add(book);
				
				
			}
		
			//Arrays.sort(list);
			
			for(Book book : list) {
				
				System.out.println(book.toString());
			}
			
			DBUtil.closeConnection(conn, stmt, res);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		return list;
		
	}
}
