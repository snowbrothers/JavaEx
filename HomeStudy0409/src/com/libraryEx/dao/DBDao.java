package com.libraryEx.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.libraryEx.vo.Book;

public class DBDao {

	public List<Book> getList() {

		// 리스트 생성
		List<Book> list = new ArrayList<>();

		try (Connection conn = DBUtil.getConnection(); Statement stmt = conn.createStatement();) {

			ResultSet rs = stmt.executeQuery("select no, title, author, isrent from book");

			while (rs.next()) {

				int no = rs.getInt(1);
				String title = rs.getString(2);
				String author = rs.getString(3);
				String isRent = rs.getString(4);

				Book book = new Book(no, title, author, isRent);
				list.add(book);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	public int insert(Book book) {

		int res = 0;
		try (Connection conn = DBUtil.getConnection(); Statement stmt = conn.createStatement();) {

			String sql = String.format("insert into book (no, title, author, isRent) values (%d, '%s','%s','%s')",
					book.getNo(), book.getTitle(), book.getAuthor(), book.getRentYN());
			System.out.println(sql);
			res = stmt.executeUpdate(sql);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			res = -1; // ?
		}

		return res;
	}

	public int delete(int no) {
		int res = 0;
		String sql = String.format("delete from book where no = ?");

		try (Connection conn = DBUtil.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql);) {

			// ?를 값으로 치환한다
			pstmt.setInt(1, no);

			res = pstmt.executeUpdate();

		} catch (SQLException e) {
			System.err.println(e.getMessage());// TODO Auto-generated catch block
			res = -1;
		}

		return res;

	}

	public int update(int no, String rentYN) {

		int res = 0;
		String sql = "update book set isRent=? where no = ?";

		try (Connection conn = DBUtil.getConnection(); 
				PreparedStatement pstmt = conn.prepareStatement(sql);) {

			pstmt.setString(1, rentYN);
			pstmt.setInt(2, no);
			
			res = pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			res = -1;
		}

		return res;
	}

	
	
	/**
	 * 대여/반납 가능한 책인지 조회.
	 * 
	 * @param no
	 * @param rentYN
	 * @return
	 */
	public boolean selStatus(int no, String rentYN) {
		
		boolean res = false;
		String sql = "select * from book where no = ? and isRent = ?";
		
		try (Connection conn = DBUtil.getConnection(); 
				PreparedStatement pstmt = conn.prepareStatement(sql);) {

			pstmt.setInt(1, no);
			pstmt.setString(2, rentYN);
			
			ResultSet rs = pstmt.executeQuery();
			
			// 삼항 연산자
			res = rs.next() ? true : false;
	
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
			
		return res;
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
