package com.library.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.library.dao.BookDao;
import com.library.service.BookService;
import com.library.vo.Criteria;

// book 요청은 BookController에서 처리
@WebServlet("*.book")
public class BookController extends HttpServlet{

	BookService bs = new BookService();
	
	public BookController() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		BookDao dao = new BookDao();
		
		String uri = req.getRequestURI();
		// 여러개의 요청을 하나의 컨트롤러에서 처리가능
		// 단 컨트롤러 하나가 복잡해질 가능성이 있음.
		System.out.println("요청 uri : " + uri);
		
		if(uri.indexOf("list") > 0) {
		
			Criteria criteria = new Criteria(
								req.getParameter("searchField")
								,req.getParameter("searchWord")
								,req.getParameter("pageNo"));
			
			req.setAttribute("map", bs.getList(criteria));
			
			req.getRequestDispatcher("./list.jsp").forward(req, resp);
		
			// 요청한 경로에 포함된 문자 .확인
		}else if(uri.indexOf("delete") > 0) {
		
			int res = bs.delete(req.getParameter("delNo"));
			
			if(res > 0) {
				req.setAttribute("message", res + "건 삭제 되었습니다.");
				
			}else {
				req.setAttribute("message", "삭제 실패 ...");
			}
			
			
//			req.getRequestDispatcher("./list.book").forward(req, resp);
			resp.sendRedirect("./list.book");
		
		}else if(uri.indexOf("Process") >0 ) {
			
			String title = req.getParameter("title");
			String author = req.getParameter("author");
			
			int res = bs.insert(title, author);
			
			System.out.println("등록 결과 출력 ===================");
			System.out.println(res);
			
			if(res > 0) {
				req.setAttribute("message", res + "건 등록되었습니다.");
			}else {
				req.setAttribute("message", "등록 실패 ! ");
			}
			
			resp.sendRedirect("./list.book");
			
		}
		
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
