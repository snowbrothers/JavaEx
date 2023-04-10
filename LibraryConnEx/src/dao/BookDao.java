package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao.conn.DBUtil;
import vo.BookVo;

public class BookDao {

	public static void main(String[] args) {
		
		BookDao bookDao = new BookDao();
		bookDao.getList();
	}
	
	
	public List<BookVo> getList() {

		List<BookVo> list = new ArrayList<>();

		String sql = "select * from book order by bookNo asc";

		try (Connection conn = DBUtil.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {

			while(rs.next()) {
				
				int no = rs.getInt("bookNo");
				String title = rs.getString("title");
				String author = rs.getString("author");
				String rentYN = rs.getString("rentYN");
				
				
				BookVo bookVo = new BookVo(no, title, author, rentYN);
				list.add(bookVo); 
				
			
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

		return list;
	}

	public int insert(BookVo bookVo) {

		
		return 0;
	}


	public int update(int no, String title) {

		return 0;
	}


	/**
	 * 사용자의 입력에맞게 DB에 책을 추가합니다.
	 * @param bookVo
	 * @return
	 */
	public int insertBook(BookVo bookVo) {

		String sql = "insert into book Values (?, ?, ?, ?)";
		
		try(Connection conn = DBUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
		
			pstmt.setInt(1, bookVo.getbookNo());
			pstmt.setString(2, bookVo.getTitle());
			pstmt.setString(3, bookVo.getAuthor());
			pstmt.setString(4, bookVo.getRentYN());
			
			int res = pstmt.executeUpdate();
			
			return res;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return 0;
	}


	public int deleteBook(int bookNo) {

		String sql = "delete book where bookNo = ?";
		
		// 커넥션
		try(Connection conn = DBUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
			
			pstmt.setInt(1, bookNo);
			
			int res = pstmt.executeUpdate();
			
			return res;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return 0;
	}


	public int updateBook(int bookNo, String rentYN) {

		String sql = "Update book set rentYN = ? where bookNo = ?";
		
		try(Connection conn = DBUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
			
		pstmt.setString(1, rentYN);	
		pstmt.setInt(2, bookNo);
			
		int res = pstmt.executeUpdate();
		
		return res;
			
			
		} catch (SQLException e) {
			System.err.println("업데이트 북 할때 오류 발생");
			e.printStackTrace();
		}
		
		
		
		
		
		return 0;
	}


	public boolean selStatus(int bookNo, String rentYN) {

		String sql ="select * from book where bookNo =? and rentYN =?";
		
		try(Connection conn =DBUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
			
			pstmt.setInt(1, bookNo);
			pstmt.setString(2, rentYN);
			
			int res = pstmt.executeUpdate();
			
			ResultSet rs = pstmt.executeQuery();
			
			
			return rs.next();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
	}

}
