package com.library.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.library.common.ConnectionUtil;
import com.library.vo.Member;

public class MemberDao {

	/**
	 * 로그인 조회된 결과를 member 에 저장 후 toString 을 이용해 출력한다.
	 * 
	 * @param id
	 * @param pw
	 */
	public Member login(String id, String pw) {

		Member member = null;

		String sql = String.format("SELECT id, name, adminyn, status, grade FROM MEMBER WHERE ID = '%s' AND PW = '%s'",
				id, pw);
		System.out.println(sql);

		try (Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {

			if (rs.next()) {

				String name = rs.getString(2);
				String adminYN = rs.getString(3);
				String status = rs.getString(4);
				String grade = rs.getString(5);

				member = new Member(id, " ", name, adminYN, status, grade);

				System.out.println("로그인 성공");

				return member;
			}

		} catch (SQLException e) {
			System.err.println("로그인 실패 -");
			e.printStackTrace();
		}

		return member;

	}

	public int insertMember(Member member) {

		int res = 0;

		String sql = String.format("INSERT INTO MEMBER VALUES ('%s', '%s', '%s', '%s', '%s', '%s')", member.getId(),
				member.getPw(), member.getName(), member.getAdminYN(), member.getStatus(), member.getGrade());

		try (Connection conn = ConnectionUtil.getConnection(); Statement stmt = conn.createStatement();) {

			System.out.println(sql);

			res = stmt.executeUpdate(sql);

			return res;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return 0;

	}

	
	/**
	 * 아이디 중복체크
	 * 중복일 경우 false 리턴
	 * @param id
	 * @return
	 */
	public boolean idCheck(String id) {

		boolean check = false;

		String sql = String.format("SELECT * FROM MEMBER WHERE ID = '%s'", id);

		try (Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {

			
			return !rs.next();
				

		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		

		return check;
	}
	
	
	/**
	 * 
	 * 사용자 삭제
	 * @param id
	 * @return
	 */
	public int deleteMember(String id) {

		int res = 0;

		String sql = String.format("DELETE FROM MEMBER WHERE ID = '%s'", id);

		try (Connection conn = ConnectionUtil.getConnection(); Statement stmt = conn.createStatement();) {

			System.out.println(sql);

			res = stmt.executeUpdate(sql);

			return res;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return 0;
	}
}
