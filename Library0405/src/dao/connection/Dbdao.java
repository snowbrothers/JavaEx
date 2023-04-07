package dao.connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import vo.Book;

public class Dbdao implements Dao  {


	// Dao 의 구현체
	
	@Override
	public List<Book> getList() {

		List<Book> list = new ArrayList<>();
		
		
		
		try {

			Connection conn = DBUtil.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs =  stmt.executeQuery("select * from book order by no asc");
			
			while (rs.next()) {
				
				int no = rs.getInt("no");
				String title = rs.getString("title");
				String author = rs.getString("author");
				
				String isRentStr = rs.getString("isRent");
				// (조건) ? true반환: false반환값
				boolean isRent = ("y".equals(isRentStr))?true:false;
							
				Book book = new Book(no, title, title, isRent);
				
				list.add(book);
				
				
			}
			
			for(Book book : list) {
				
				System.out.println(book.toString());	
			
			}
			
			
			DBUtil.closeConnection(conn, stmt, rs);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return list;
	}
	
	
	@Override
	public boolean listToFile(List<Book> list) {
	
		
		return false;
	}
	
	@Override
	public int update(int no) {
		
		int rs = 0;
		
		try {
		
			Connection conn = DBUtil.getConnection();
			Statement stmt = conn.createStatement();
	
			rs = stmt.executeUpdate("update book SET title = '라플라스의 마녀' where no = 3");
			
			System.out.println(rs + "건 수정되었습니다.");
			
			DBUtil.closeConnection(conn, stmt, null);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return rs;
	}

}
