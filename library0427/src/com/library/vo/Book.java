package com.library.vo;

public class Book {

	
	
	private int no;
	private String title;
	private String author;
	private String rentYN = "N";
	
	
	public Book() {
		
	}
	
	//
	public Book(String title, String author) {
		
		this.title = title;
		this.author = author;
		// 신규도서 이므로 N
		this.rentYN = "N";
		
	}
	
	public Book(int no, String title, String author, String rentYN) {
		
		this.no = no;
		this.title = title;
		this.author = author;
		this.rentYN = rentYN;
	}
	
	
	// 메서드 재정의
	@Override
	public String toString() {
		
		String rentYNstr =" ";
		
		// 도서가 rentYN = Y(대여중) 인 경우 대여중 으로 표시
		if("Y".equals(getRentYN())) {
			
			rentYNstr = "대여중";
			
			
		}else {
			rentYNstr = " ";
		}
		
		return getNo() 
				+ " " + getTitle() 
				+ " " + getAuthor() 
				+ " " + rentYNstr;
	}

	
	
	
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getRentYN() {
		return rentYN;
	}

	public void setRentYN(String rentYN) {
		this.rentYN = rentYN;
	}
	
	
}
