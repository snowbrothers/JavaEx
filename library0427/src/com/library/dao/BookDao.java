package com.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.library.common.ConnectionUtil;
import com.library.vo.Book;

public class BookDao {

	public List<Book> getList() {

		List<Book> list = new ArrayList<>();

		String sql = "SELECT * FROM BOOK order by no";

		try (Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {
			// stmt.executeQuery : resultSet (질의한 쿼리에 대한 결과집합)
			// stmt.executeUpdate : int (몇건이 처리 되었는지 !!)
			
			while (rs.next()) {

				int no = rs.getInt(1);
				String title = rs.getString(2);
				String author = rs.getString(3);
				String rentYN = rs.getString(4);

				Book book = new Book(no, title, author, rentYN);

				list.add(book);

			}

//			for (Book book : list) {
//				System.out.println(book.toString());
//			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	
//	/**
//	 * 책을 추가한다.
//	 * 
//	 * @param book
//	 * @return
//	 */
//	public int insertBook(Book book) {
//		// 반환타입이 int 인 이유 .. 
//		// 몇 건 처리했는지 알려주기 위해서
//		
//		int res = 0;
//		
//		String sql = "INSERT INTO BOOK VALUES (?, ?, ?, ?) ";
//		
//		
//		try (Connection conn = ConnectionUtil.getConnection(); 
//				PreparedStatement pstmt = conn.prepareStatement(sql);) {
//			
//			
//			pstmt.setInt(1, book.getNo());
//			pstmt.setString(2, book.getTitle());
//			pstmt.setString(3, book.getAuthor());
//			pstmt.setString(4, book.getRentYN());
//			
//			// 반환타입 int
//			int res = pstmt.executeUpdate();
//			return res;
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		return 0;
//	}
	
	
	
	public int insert(Book book) {
		// 반환타입이 int 인 이유 .. 
		// 몇 건 처리했는지 알려주기 위해서
		
		int res = 0;
		
		String sql = String.format("insert into book values (SEQ_BOOK_NO.NEXTVAL, '%s', '%s', '%s')"
												,book.getTitle(), book.getAuthor(), book.getRentYN()  );
		
		
		System.out.println(sql);
		
		
		
		try (Connection conn = ConnectionUtil.getConnection(); 
				Statement stmt = conn.createStatement();) {
			
			res = stmt.executeUpdate(sql);
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return 0;
	}
	
	
	
	
	public int delete(int no) {
		
		int res = 0;
		
		String sql = String.format("DELETE FROM BOOK WHERE NO = %d", no);
		
		
		System.out.println(sql);
		
			try(Connection conn = ConnectionUtil.getConnection();
					Statement stmt = conn.createStatement()) {
				
			
				res = stmt.executeUpdate(sql);
				
				return res;
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		return 0;
		
		
		
	}
	
	
	
	
	public int update(int no, String rentYN) {
		
		
		int res = 0;
		
		String sql = String.format("update book set rentYN = '%s' where no = %d", rentYN, no);
		
		System.out.println(sql);
		
		try(Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement()) {
			
		
			res = stmt.executeUpdate(sql);
			
			return res;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return res;
		
		
	}
	
	
	

}
