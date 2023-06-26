package com.library.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.library.service.BookService;

// book 요청은 BookController에서 처리
@WebServlet("*.book")
public class BookController extends HttpServlet{

	BookService bs = new BookService();
	
	public BookController() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
		String uri = req.getRequestURI();
		// 여러개의 요청을 하나의 컨트롤러에서 처리가능
		// 단 컨트롤러 하나가 복잡해질 가능성이 있음.
		System.out.println("요청 uri : " + uri);
		if(uri.indexOf("list") > 0) {
		
			req.setAttribute("list", bs.getList()); 
			req.getRequestDispatcher("./list.jsp").forward(req, resp);
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
