package com.lib.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lib.common.DBConPool;
import com.lib.vo.Book;

public class BookDao {

	public BookDao() {
		// TODO Auto-generated constructor stub
	}
	
	public List<Book> getList(){
		
		// List << 컬렉션 프레임워크
		List<Book> list = new ArrayList<Book>();
		
		String sql = "SELECT * FROM BOOK";
		
		try(Connection conn = DBConPool.getConnection();
				PreparedStatement psmt =  conn.prepareStatement(sql);) {
			
			System.out.println("sql : " + sql );
			System.out.println("커넥션 성공  ! ! ! !");
			
			
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
