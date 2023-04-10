package com.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.library.dao.conn.DBUtil;
import com.library.vo.BookVo;

/**
 * 1. 데이터베이스와 통신해서 DB 입출력 을 한다.
 * @author user
 *
 */
public class BookDao {

	// 리스트 조회
	public List<BookVo> getList() {

		List<BookVo> list = new ArrayList<>();

		String sql = "select * from book order by bookNo asc";

		try (Connection conn = DBUtil.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {

			// 한줄 씩 읽어온다.
			while (rs.next()) {

				int bookNo = rs.getInt("bookNo");
				String title = rs.getString("title");
				String author = rs.getString("author");
				String rentYN = rs.getString("rentYN");

				BookVo bookVo = new BookVo(bookNo, title, author, rentYN);

				list.add(bookVo);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	/**
	 * 책 등록
	 * 
	 * @param bookVo
	 * @return
	 */
	public int insertBook(BookVo bookVo) {

		String sql = "insert into book VALUES (?, ?, ?, ?)";

		try (Connection conn = DBUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {

			pstmt.setInt(1, bookVo.getBookNo());
			pstmt.setString(2, bookVo.getTitle());
			pstmt.setString(3, bookVo.getAuthor());
			pstmt.setString(4, bookVo.getRentYN());
		
			int rs = pstmt.executeUpdate();
			
			return rs;
				
				
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return 0;
	}

	public int deleteBook(int bookNo) {

		
		String sql = "delete book where bookNo = ? ";
		
		try(Connection conn = DBUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
	
			pstmt.setInt(1, bookNo);
			
			int rs = pstmt.executeUpdate();
			
			return rs;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	public int updateBook(int bookNo, String rentYN) {
		
		
		
		String sql = "update book set rentYN = ? WHERE bookNo = ?";
		
		try(Connection conn = DBUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
			
			// 매개변수는 물음표(?)의 순서대로 와야한다.
			// 순서대로 인덱스 번호 부여
			pstmt.setString(1, rentYN);
			pstmt.setInt(2, bookNo);
			int res = pstmt.executeUpdate();
		
			return res;
			
		} catch (SQLException e) {
			System.out.println("업데이트 북 할때 오류 발생");
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		
		return 0;
	}

	
	/**
	 * 대여/반납이 가능한 상태라면 true
	 * 아니면 false
	 * @param no
	 * @param rentYN
	 * @return
	 */
	public boolean selStatus(int no, String rentYN) {
		
		String sql = "select * from book where bookNo = ? and rentYN= ?";
		try(Connection conn = DBUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
			
			pstmt.setInt(1, no);
			pstmt.setString(2, rentYN);
			
			int res = pstmt.executeUpdate();
			
			ResultSet rs = pstmt.executeQuery();
			
			// 조회된 결과가 있으면 true, 
			return rs.next();
			
				
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

}
