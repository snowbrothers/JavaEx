package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDao;
import vo.Criteria;
import vo.Member;
import vo.PageDto;

@WebServlet("/member/MemberList")
public class MemberController extends HttpServlet{

	MemberDao dao = new MemberDao();
	
	public MemberController() {
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
			// 검색
			String searchField = req.getParameter("searchField");
			String searchWord = req.getParameter("searchWord"); 
			String pageNo = req.getParameter("pageNo");
			
			Criteria cri = new Criteria(searchField, searchWord, pageNo);
		
			cri.setSearchField(searchField);
			cri.setSearchWord(searchWord);
		
			
			// 총건수
			int totalCount = dao.getTotalCnt(cri);
			req.setAttribute("totalCnt", totalCount);
			
			List<Member> list = dao.getList(cri);
			
			// 페이징
			PageDto pageDto = new PageDto(totalCount, cri);
			
			
			req.setAttribute("pageDto", pageDto);
			req.setAttribute("memberList", list);
			
			// 연결 확인
			req.getRequestDispatcher("./memberList.jsp").forward(req, resp);
			
	
	}

}
