package com.library.vo;

public class BookVo {

	int bookNo; // 일련번호
	String title; // 제목
	String author; // 작가
	String rentYN; // 대여여부 String

	// 생성자
	public BookVo(int bookNo, String title, String author, String rentYN) {

		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.rentYN = rentYN;
	}

	
	@Override
	public String toString() {

		// 삼항연산식 조건식? 값or연산식1 : 값or연산식1
		// true 1 / false 2;
		String str = getRentYN().equals("Y")? "대여중":"";
		
		
		return getBookNo() 
				+" "+ getTitle() 
				+" "+ getAuthor() 
				+" "+ str;
		
		
	}
	
	
	// get, set //
	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
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
