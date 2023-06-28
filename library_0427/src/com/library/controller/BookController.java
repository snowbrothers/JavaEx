package com.library.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.library.dao.BookDao;
import com.library.service.BookService;
import com.library.vo.Book;
import com.library.vo.Criteria;
import com.oreilly.servlet.MultipartRequest;

import common.FileUtil;
import common.JSFunction;

// book 요청은 BookController에서 처리
@WebServlet("*.book")
public class BookController extends HttpServlet {

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

		if (uri.indexOf("list") > 0) {

			Criteria criteria = new Criteria(req.getParameter("searchField"), req.getParameter("searchWord"),
					req.getParameter("pageNo"));

			req.setAttribute("map", bs.getList(criteria));

			req.getRequestDispatcher("./list.jsp").forward(req, resp);

			// 요청한 경로에 포함된 문자 .확인
		} else if (uri.indexOf("delete") > 0) {

			int res = bs.delete(req.getParameter("delNo"));

			if (res > 0) {
				req.setAttribute("message", res + "건 삭제 되었습니다.");

			} else {
				req.setAttribute("message", "삭제 실패 ...");
			}

//			req.getRequestDispatcher("./list.book").forward(req, resp);
			resp.sendRedirect("./list.book");

		} else if (uri.indexOf("view") > 0) {

			String no =req.getParameter("no");
			
			Book book = bs.selectOne(no);
			req.setAttribute("dto", book);
			System.out.println(book);

			if (book != null) {

				req.getRequestDispatcher("./View.jsp")
							.forward(req, resp);

			} else {
				
				JSFunction.alertBack(resp, "도서가 존재하지 않습니다.");
			}

		} else {

			JSFunction.alertBack(resp, "url을 확인해주세요");
		}

		// } else if(uri.indexOf("Process") >0 ) {
//			
//			String title = req.getParameter("title");
//			String author = req.getParameter("author");
//			
//			int res = bs.insert(title, author,ofile, );
//			
//			System.out.println("등록 결과 출력 ===================");
//			System.out.println(res);
//			
//			if(res > 0) {
//				req.setAttribute("message", res + "건 등록되었습니다.");
//			}else {
//				req.setAttribute("message", "등록 실패 ! ");
//			}
//			
//			resp.sendRedirect("./list.book");
//			
//		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String uri = req.getRequestURI();
		System.out.println("요청 uri : " + uri);

		if (uri.indexOf("write") > 0) {
			// 도서등록
			String saveDirectory = "C:\\Users\\user\\git\\JavaEx\\library_0427\\webapp\\images\\bookimg";
			MultipartRequest mr = FileUtil.uploadFile(req, saveDirectory, 1024 * 1000);

			String ofile = mr.getFilesystemName("bookImg");
			System.out.println(ofile);

			String title = mr.getParameter("title");
			String author = mr.getParameter("author");
			String no = mr.getParameter("no");
			String rentYN = "N";
			System.out.println("title : " + title);
			System.out.println("author : " + author);

			if (ofile != null && !"".equals(ofile)) {

				String sfile = FileUtil.fileNameChange(saveDirectory, ofile);

				int res = bs.insert(no, title, author, rentYN, ofile, sfile);

				if (res > 0) {
					JSFunction.alertLocation(resp, ".list.book", "등록성공");
				} else {
					JSFunction.alertBack(resp, "등록중 예외 사항 발생");
				}
				
			}		
			
			
		}else if (uri.indexOf("rent") > 0) {
			// 로그인 아이디 확인
			
			HttpSession session = req.getSession();
			if (session.getAttribute("userId") == null) {
				JSFunction.alertBack(resp, "로그인 후 이용 가능한 메뉴 입니다.");
				return;
			}
			

			
			// 대여하기 - 책번호, 로그인 아이디
			Book book = new Book();
			book.setNo(req.getParameter("no"));
			book.setId(session.getAttribute("userId").toString());
			
			
			int res = bs.rentBook(book);

			if(res > 0) {
				JSFunction.alertLocation(resp, "./view.book?no="+book.getNo(), "대여되었습니다.");
			}else {
				JSFunction.alertBack(resp, "대여중 오류발생");
			}
		
		}else if(uri.indexOf("return") > 0) {
			// 반납하기
			
			Book book = new Book();
			 book.setRentno(req.getParameter("rentno"));
			 book.setNo(req.getParameter("no"));
			 
			 System.out.println("rentno : " +req.getParameter("rentno"));
			 System.out.println("no : " +req.getParameter("no"));
			 
			 int res = bs.returnBook(book);
			 
			 if(res > 0) {
				 JSFunction.alertLocation(resp, "./view.book?no="+book.getNo(), "반납되었습니다.");
			 }else {
				 JSFunction.alertBack(resp, "반납중에 오류 발생");
			 }
			 
			
		}

	}

}
