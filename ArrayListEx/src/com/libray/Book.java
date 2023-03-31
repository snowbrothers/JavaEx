package com.libray;

public class Book {

	// 책의 정보 3개 필드 선언
	private String title; // 제목
	private String author; // 저자
	private boolean isRent = false; // 대여여부
	
	
	@Override // 메서드 오버라이드 
	public String toString() {

		String str = " ";
		if(isRent) {
			str = "&_& 대여중 입니다.";
		}
		
		return getTitle() + "/" + getAuthor() + "/ " + str;
	}
	
	// 생성자 필드 수정
	public Book(String title, String author) {

		this.title = title;
		this.author = author;
	}
	
	
	
	// get, set/
	
	//외부에서 접근 get,set
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



	public boolean isRent() {
		return isRent;
	}



	public void setRent(boolean isRent) {
		this.isRent = isRent;
	}
	
	
}
