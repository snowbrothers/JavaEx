package ccom.lib;

public class Book {

	
	// 책의 정보를 저장하는 3개의 필드를 작성 속성
	private String title; // 제목
	private String author; // 저자
	private boolean isrent = false; // 대여 여부. 
	
	// 필드의 값을 변경 할 수 있는 매개변수 생성자를 생성할 것

	// 생성자
	public Book(String title, String author) {
		
		this.title = title;
		this.author = author;
		
	}

	
	
	
	
	// 책의 정보를 외부에서 가져 갈 수 있도록  get, set 메서드를 만들어줄 것.
	
	
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

	public boolean isIsrent() {
		return isrent;
	}

	public void setIsrent(boolean isrent) {
		this.isrent = isrent;
	}
	
	
	
	
	
}
