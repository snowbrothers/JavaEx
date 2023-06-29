package com.lib.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lib.common.DBConPool;
import com.lib.vo.Member;

public class MemberDao {

	public MemberDao() {
		// TODO Auto-generated constructor stub
	}

	public Member login(String id, String pw) {
		Member member = null;
		
		String sql = "SELECT * FROM MEMBER WHERE ID = ? AND PW = ?";
		
		try(Connection conn = DBConPool.getConnection();
				PreparedStatement psmt = conn.prepareStatement(sql);) {
			
			// 매개변수로 받은 값을 쿼리에 설정
			psmt.setString(1, id);
			psmt.setString(2, pw);
			
			ResultSet rs = psmt.executeQuery();
			
			if(rs.next()) {
				String id2 = rs.getString("id");
				String name = rs.getString("name");
				String adminYN = rs.getString("adminyn");
				String status = rs.getString("status");
				String grade = rs.getString("grade");
				
				member = new Member(id2, "", name, adminYN, status, grade);
			}
			
			
		} catch (SQLException e) {
			System.out.println("MemberDao -- 로그인 중 오류 발생");
			e.printStackTrace();
		}
		
		return member;
	}

}
