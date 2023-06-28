package com.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import com.library.common.ConnectionUtil;
import com.library.common.DBConnPool;
import com.library.vo.Book;
import com.library.vo.Criteria;

public class BookDao {
	/**
	 * 도서목록 조회
	 * 
	 * @param criteria
	 * @return
	 */
	public List<Book> getList(Criteria criteria) {
		List<Book> list = new ArrayList<Book>();

		// String sql = "select * from book order by no";
		String sql = 
				"select * from ("
				+ "select rownum rn, t.*  from ("
				+ "select no, title" 
				+ "    , nvl((select 대여여부 " 
				+ "			 from 대여 "
				+ "			where 도서번호 = no " 
				+ "			  and 대여여부='Y'),'N') rentyn " 
				+ "    , author "
				+ "from book " + "order by no"
						+ ")t )where rn between 1 and 10;";

		// try ( 리소스생성 ) => try문이 종료되면서 리소스를 자동으로 반납
		try (Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();
				// stmt.executeQuery : resultSet (질의한 쿼리에 대한 결과집합)
				// stmt.executeUpdate : int (몇건이 처리되었는지!!!)
				ResultSet rs = stmt.executeQuery(sql)) {
			while (rs.next()) {
				String no = rs.getString(1);
				String title = rs.getString(2);
				String rentYN = rs.getString(3);
				String author = rs.getString(4);

				Book book = new Book(no, title, rentYN, author);
				list.add(book);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	/**
	 * 검색폼 추가
	 * 
	 * @param criteria
	 * @return
	 */
	public List<Book> newGetList(Criteria criteria) {

		List<Book> list = new ArrayList<Book>();

		// String sql = "select * from book order by no";
		String sql =
				"select * from ("
				+ "select rownum rn, t.*  from ("
				+"select no, title" + "    "
				+ "		, nvl((select 대여여부 " 
				+ "			 from 대여 "
				+ "			where 도서번호 = no " + "			  and 대여여부='Y'),'N') rentyn " 
				+ "    , author "
				+ "from book ";

		if (criteria.getSearchWord() != null && !"".equals(criteria.getSearchWord())) {
			sql += "WHERE " + criteria.getSearchField() + " like '%" + criteria.getSearchWord() + "%'";

		}
		sql += " order by no desc)t )where rn between "+criteria.getStartNo()+" and "+criteria.getEndNo()+"";

		// try ( 리소스생성 ) => try문이 종료되면서 리소스를 자동으로 반납
		try (Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();
				// stmt.executeQuery : resultSet (질의한 쿼리에 대한 결과집합)
				// stmt.executeUpdate : int (몇건이 처리되었는지!!!)
				ResultSet rs = stmt.executeQuery(sql)) {
			while (rs.next()) {
				
				String no = rs.getString("no");
				String title = rs.getString("title");
				String rentYN = rs.getString("rentyn");
				String author = rs.getString("author");

				Book book = new Book(no, title, rentYN, author);
				list.add(book);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}
	
	public Book selectOne(String no) {
		
		Book book=null;
		
		//String sql = "select * from book order by no";
		String sql = 
					" select "
				  + "		 b.no, b.title, d.대여여부, b.author, d.아이디"
				  + " 		, to_char(대여일,'yy/mm/dd') 대여일, to_char(반납가능일,'yy/mm/dd') 반납가능일" 
				  + " 		, 반납일, sfile, ofile, d.대여번호"
				  + " from book b, 대여 d "
				  + "where b.rentno = d.대여번호(+) and b.no="+no;
		
		System.out.println(sql);
		
		// try ( 리소스생성 ) => try문이 종료되면서 리소스를 자동으로 반납
		try (Connection conn = DBConnPool.getConnection();
				Statement stmt = conn.createStatement();
				// stmt.executeQuery : resultSet (질의한 쿼리에 대한 결과집합)
				// stmt.executeUpdate : int (몇건이 처리되었는지!!!)
				ResultSet rs = stmt.executeQuery(sql)){
			if(rs.next()) {
				String bookNo = rs.getString(1);
				String title = rs.getString(2);
				String rentYN = rs.getString(3);
				String author = rs.getString(4);
				
				book = new Book(bookNo, title, rentYN, author);
				
				
				book.setId(rs.getString(5));
				book.setStartDate(rs.getString(6));
				book.setEndDate(rs.getString(7));
				book.setReturnDate(rs.getString(8));
				book.setSfile(rs.getString(9));
				book.setOfile(rs.getString(10));
				book.setRentno(rs.getString(11));
				
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return book;
	}

	/**
	 * 도서 등록
	 * 
	 * @param book
	 * @return
	 */
	public int insert(Book book) {
		int res = 0;

		String sql = String.format("insert into book values (SEQ_BOOK_NO.NEXTVAL, '%s','%s','%s','%s','%s','')"
				,book.getTitle(), book.getAuthor(),book.getRentyn(),  book.getOfile(), book.getSfile());

		// 실행될 쿼리를 출력해봅니다
		// System.out.println(sql);

		try (Connection conn = ConnectionUtil.getConnection(); Statement stmt = conn.createStatement();) {
			res = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return res;
	}

	/**
	 * 도서 삭제
	 * 
	 * @return
	 */
	public int delete(String noStr) {
		int res = 0;

		String sql = String.format("delete from book where no in (%s)", noStr);

		// 실행될 쿼리를 출력해봅니다
		// System.out.println(sql);

		try (Connection conn = ConnectionUtil.getConnection(); Statement stmt = conn.createStatement();) {
			res = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println("BookDao : 삭제중 오류발생");
			e.printStackTrace();
			
		}

		return res;
	}

	/**
	 * 도서 업데이트
	 * 
	 * @return
	 */
	public int update(int no, String rentYN) {
		int res = 0;

		String sql = String.format("update book set rentYN = '%s' where no = %d", rentYN, no);

		// 실행될 쿼리를 출력해봅니다
		// System.out.println(sql);

		try (Connection conn = ConnectionUtil.getConnection(); Statement stmt = conn.createStatement();) {
			res = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return res;
	}

	public String getRentYN(int bookNo) {
		String rentYN = "";
		String sql = String.format("SELECT RENTYN FROM BOOK WHERE NO = %s", bookNo);

		try (Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {
			// 조회된 행이 있는지 확인
			if (rs.next()) {
				// DB에서 조회된 값을 변수에 저장
				rentYN = rs.getString(1);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return rentYN;
	}

	/**
	 * 게시물의 총 건수 반환
	 * 
	 * @param criteria
	 * @return
	 */
	public int getTotalCnt(Criteria criteria) {

		int res = 0;

		String sql = "SELECT COUNT(*) FROM BOOK ";

		if (criteria.getSearchWord() != null && !"".equals(criteria.getSearchWord())) {

			sql += "where " + criteria.getSearchField() + " like '%" + criteria.getSearchWord() + "%'";

		}

		try (Connection conn = DBConnPool.getConnection();
				PreparedStatement psmt = conn.prepareStatement(sql);
				ResultSet rs = psmt.executeQuery();) {

			if (rs.next()) {

				res = rs.getInt(1);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return res;
	}

	public int rentBook(Book book) {
		int res =0;
		
		String sql_1 = "SELECT 'R'||lpad(SQE_대여.NEXTVAL,5,0) FROM DUAL"; // 시퀀스 조회
		String sql_2 = "update book set rentno = ?, rentyn = 'Y' where no = ? and (rentno='' or rentno is null)"; // 업데이트
		String sql_3 = "insert into 대여 values (?, ?, ?, 'Y'" 
											+ ", SYSDATE, NULL, SYSDATE+14, NULL)"; // insert 쿼리
		// 1. 대여번호 조회(R00001)
		
		
		
		try(Connection conn = DBConnPool.getConnection();) {
			conn.setAutoCommit(false);

			PreparedStatement psmt = conn.prepareStatement(sql_1);
			ResultSet rs = psmt.executeQuery();
			
			if(!rs.next()) {
				
				return res;
			}
			
			String rentno = rs.getString(1);
			psmt.close();
			
			System.out.println("겟넘버 : "+book.getNo());
			System.out.println("렌트넘버 :"+ rentno);
			
			psmt=conn.prepareStatement(sql_2);
			psmt.setString(1, rentno);
			psmt.setString(2, book.getNo());
			
			res = psmt.executeUpdate();
			
			
			System.out.println("sql_2 : " + sql_2);
			System.out.println("res : " + res);
			
			
			if(res > 0) {
				psmt.close();
				psmt = conn.prepareStatement(sql_3);
				psmt.setString(1, rentno);
				psmt.setString(2, book.getId());
				psmt.setString(3, book.getNo());
				
				res = psmt.executeUpdate();
				
				System.out.println("sql_3 : " + sql_3);
				System.out.println("res : " + res);
			
				if(res > 0) {
					conn.commit();
				}else {
					conn.rollback();
				}
				
			}else {
				conn.rollback();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 2. Book테이블 업데이트(rentyn=Y, rentno=대여번호)
		// 	조건 : 도서번호, rentno null또는 빈 문자열 
		// 3. 대여 테이블 인서트
		return res;
	}

	// 도서 반납
	public int returnBook(Book book) {
		int res = 0;
		
		String sql_1 = "UPDATE BOOK SET RENTYN = 'N', RENTNO ='' WHERE RENTNO = ?";
		String sql_2 = "UPDATE 대여 SET 반납일 = SYSDATE, 대여여부 ='N' WHERE 대여번호 = ?";
		
		try(Connection conn = DBConnPool.getConnection();){
			conn.setAutoCommit(false);	
			
			PreparedStatement psmt = conn.prepareStatement(sql_1); 
			psmt.setString(1, book.getRentno());
			res = psmt.executeUpdate();
			
			System.out.println("실행결과 2 : " + res);
			System.out.println("sql_1 : " + sql_1 );
			
			
			if(res > 0) {
				psmt = conn.prepareStatement(sql_2);
				psmt.setString(1, book.getRentno());
				res = psmt.executeUpdate();
				
				System.out.println("실행결과 2: " + res);
				System.out.println("sql_2 : " + sql_2);
				
				
				if(res > 0) {
					conn.commit();
				}else {
					conn.rollback();
				}
				
			}else {
				System.out.println("이상해서 롤백");
				conn.rollback();
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return res;
	}

	
}

