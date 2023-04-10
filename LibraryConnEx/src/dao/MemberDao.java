package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dao.conn.DBUtil;
import vo.MemberVo;

public class MemberDao {

	public MemberVo login(String id, String pw) {

		// 사용자가 입력한 값과 테이블에 저장된 id, pw 값을 대조해서 값을 반환한다.
		String sql = "select * from Member where id = ? and pw = ?";
		System.out.println("id " + id);
		System.out.println("pw " + pw);

		try (Connection conn = DBUtil.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql);) {

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

		System.err.println("id, pw 사용자를 찾을 수 없습니다.");
		return null;
	}


	
	public int insertMember(MemberVo memberVo) {

		String sql = "insert into member values (?, ?, ?, ?)";

		try (Connection conn = DBUtil.getConnection(); 
				PreparedStatement pstmt = conn.prepareStatement(sql);) {

			pstmt.setString(1, memberVo.getId());
			pstmt.setString(2, memberVo.getPw());
			pstmt.setString(3, memberVo.getName());
			pstmt.setString(4, memberVo.getAdminYN());
			
			int res =pstmt.executeUpdate();
			
			return res;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return 0;
	}

	
	
	public int deleteMember(String id) {

		String sql = "delete member where id = ? ";
		
		try(Connection conn = DBUtil.getConnection();
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
