package com.library.controller;

public class MemberVo {
	
	String id;
	String pw; // 비밀번호는 get 메소드 삭제 > 가져오지는 않는다.
	String name;
	String adminYN; // 권한
	
	 
	@Override
	public String toString() {

		
		
		return getId()
				+" "+getName() 
				+" "+getId();
	}

	// 생성자
	public MemberVo(String id, String pw, String name, String adminYN) {
		
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.adminYN = adminYN;
	}

	
	public MemberVo() {
		// TODO Auto-generated constructor stub
	}

	// get, set // 
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdminYN() {
		return adminYN;
	}

	public void setAdminYN(String adminYN) {
		this.adminYN = adminYN;
	}



}


