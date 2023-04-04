package com.library.vo;

public class Book {

	// VO : 데이터를 담는 그릇 ..
	// 책에 대한 정보를 가지고 있는 VO // 주로 필드와 set, get 메서드를 가지고 있음
	// 구체적으로 적어주는 것이 개발을 진행하는 과정에서 도움이 됨.
	
	private int number;  // 책 일련번호
	
	private String title;  // 책 제목
	
	private String author;   // 책 저자
	
	private boolean isRent;    // true : 대여중 / false : 대여가능
	// 대여자 추가
	// 대여일 추가

	@Override
	public String toString() {

		
		
		return getNumber() 
					+" "+ getTitle() 
					+" "+  getAuthor() 
					+" "+  isRent;
	}
	
	public Book(int number, String title, String author, boolean isRent) {

		this.number = number;
		this.title = title;
		this.author = author;
		this.isRent = isRent;
	}
	
	
	
	
	//책의 정보를 출력합니다
	public void info() {
		
		String str = " ";
		
		if(isRent) {
			
			str = "대여중 입니다.";
		}
		
		System.out.println(getNumber() 
							+ " / " + getTitle() 
							+ " / " + getAuthor() 
							+ " / " + str);
	}
	
	
	
	
	// get, set // 
	
	
	public int getNumber() {
		return number;
	}

	

	public void setNumber(int number) {
		this.number = number;
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

	public boolean isRent() {
		return isRent;
	}

	public void setRent(boolean isRent) {
		this.isRent = isRent;
	}
	
	
	
}
