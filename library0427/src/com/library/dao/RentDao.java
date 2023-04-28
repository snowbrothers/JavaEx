package com.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.library.common.ConnectionUtil;
import com.library.vo.Book;




/**
 * DB 에 연결 데이터 입출력 처리
 * @author user
 *
 */
public class RentDao {

	
	public static void main(String[] args) {
		
		
		RentDao dao = new RentDao();
//		System.out.println(dao.getRentYN(1));
		//System.out.println(dao.insert("cat", 3));
		System.out.println(dao.update(3));
		
	}
	
	public String getRentYN(int no) {
		
		String rentYN = "N";
		String sql =  "SELECT 대여여부 FROM 대여 WHERE 도서번호 = ? AND 대여여부 ='Y'";
		
		
		try(Connection conn = ConnectionUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				){
			
			
			// 파라메터 세팅 : ? 순서대로 입력
			pstmt.setInt(1, no);
			
			// 쿼리 실행 
			ResultSet rs = pstmt.executeQuery();

			if(rs.next()) {
				
			rentYN = rs.getString(1);
				
			}
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return rentYN;
		
	}
	
	public int insert(String id, int no) {
		
		int res = 0;
		
		
		String sql = String.format("INSERT INTO 대여 VALUES (SQE_대여.NEXTVAL, '%s', %d, 'Y', SYSDATE, NULL, SYSDATE+7, NULL)"
																														, id, no);
		
		try(Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();
				) {
			
			res = stmt.executeUpdate(sql);
			
			
			return res;
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return res;
		
	}


	
	public int update(int no) {
		
		int res = 0;
		
		String sql = "UPDATE 대여 SET 반납일 = SYSDATE, 대여여부 = 'N' WHERE 도서번호 = ?";

				try(Connection conn = ConnectionUtil.getConnection();
						PreparedStatement pstmt =conn.prepareStatement(sql);) {
					
				
					
					pstmt.setInt(1, no);
					
				res = pstmt.executeUpdate();
				
				return res;
					
				
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		
		
		return res;
		
		
	}

}
