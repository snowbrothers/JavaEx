package com.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.library.controller.MemberVo;
import com.library.dao.conn.DBUtil;

/**
 * 사용자의 정보를 입력
 * 
 * @author user
 *
 */
public class MemberDao {

	public MemberVo login(String id, String pw) {

		// .prepareStatement
		// 매개변수를 '?' 로 입력

		String sql = "select * from Member where id = ? and pw = ?";
		System.out.println("id " + id);
		System.out.println("pw " + pw);
		try (Connection conn = DBUtil.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql);) { // 쿼리문이
																												// 어디에
																												// 들어가는지가
																												// 조금 다름

			// .setString(물음표번호, 매개값)
			pstmt.setString(1, id);
			pstmt.setString(2, pw);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

				String name = rs.getString("name");
				String adminYN = rs.getString("adminYN");

				MemberVo membervo = new MemberVo(id, "", name, adminYN);

				return membervo;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// id, pw 사용자를 찾을 수 없습니다.
		return null;
	}

	public int insertMember(MemberVo memberVo) {

		String sql = "insert into member VALUES (?, ?, ?, ?)";

		try (Connection conn = DBUtil.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql);) {

			System.out.println(memberVo.getId());

			pstmt.setString(1, memberVo.getId());
			pstmt.setString(2, memberVo.getPw());
			pstmt.setString(3, memberVo.getName());
			pstmt.setString(4, memberVo.getAdminYN());

			int res = pstmt.executeUpdate();

			return res;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return 0;
	}

	/**
	 * 데이터 베이스에 등록된 사용자 정보를 삭제합니다.
	 * 
	 * PreparedStatement - Statement 클래스보다 기능이 향상된 클래스 - 코드의 안정성과 가독성이 높다 - 인자 값으로
	 * 전달이 가능 - 매개변수를 ? 로 설정(?에 '' 처리를 하지 않습니다.) setString(index, 값)
	 * 
	 * @param id
	 * @return
	 */
	public int deleteMember(String id) {

		String sql = "delete from member where id = ? ";

		try (Connection conn = DBUtil.getConnection();

				PreparedStatement pstmt = conn.prepareStatement(sql);) {

			pstmt.setString(1, id);

			int res = pstmt.executeUpdate();

			return res;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return 0;
	}

}
