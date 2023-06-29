package com.lib.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lib.common.DBConPool;
import com.lib.vo.Book;

public class BookDao {

	public BookDao() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 목록조회
	 * @return
	 */
	public List<Book> getList(){
		
		// List << 컬렉션 프레임워크
		List<Book> list = new ArrayList<Book>();
		
		String sql = "SELECT * FROM BOOK";
		
		try(Connection conn = DBConPool.getConnection();
				PreparedStatement psmt =  conn.prepareStatement(sql);) {
			
			ResultSet rs = psmt.executeQuery();
				
						
			System.out.println("sql : " + sql );
			System.out.println("커넥션 성공  ! ! ! !");
			
			// 결과가 있으면 반복해서 받아온다.
			while(rs.next()) {
				
				String no = rs.getString("no");
				String title = rs.getString("title");
				String author = rs.getString("author");
				String rentyn = rs.getString("rentyn");
				String ofile = rs.getString("ofile");
				String sfile = rs.getString("sfile");
				
			
				Book book = new Book(no, title, author, rentyn, ofile, sfile);
				
				list.add(book);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	public static void main(String[] args) {
		
		BookDao dao = new BookDao();
		dao.getList();
		
	}
}
