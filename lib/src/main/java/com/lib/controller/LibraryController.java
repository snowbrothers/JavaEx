package com.lib.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lib.dao.BookDao;
import com.lib.vo.Book;

@WebServlet("*.lib")
public class LibraryController extends HttpServlet {

	public LibraryController() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 리스트 불러오기
		BookDao dao = new BookDao();
		
		String uri = req.getRequestURI();
		
		System.out.println("요청 uri : " + uri);
		
		if(uri.indexOf("list") > 0) {
			
			
			List<Book> list = dao.getList();
			
			// 리퀘스트 영역에 list 정보 저장
			req.setAttribute("list", list);
			
			// request 영역을 공유하기 위해 forward 방식 사용
			req.getRequestDispatcher("./library/list.jsp").forward(req, resp);
			
		}
		
		
		
		
		
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


	}

}
