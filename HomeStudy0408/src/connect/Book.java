package connect;

import java.util.Date;

public class Book {

	// 필드 생성
	
	int no;
	String title;
	String author;
	String isRent;
	// Date >> java.util.Date 경로에서 임포트 해야한다.
//	Date regdate;
	//Date editDate;
	
	
	public Book(int no, String title, String author, String isRent) {

		this.no = no;
		this.title = title;
		this.author = author;
		this.isRent = isRent;
		//this.regdate = regdate;
		//this.editDate = editDate;
	}
	
	
	
	@Override
	public String toString() {

		
		return getNo() +" "+ getTitle() 
							+" "+ getAuthor() 
							+" "+ getIsRent() ;
//							+" "+ getRegdate() 
//							+" "+ getEditDate();
}

	
	
	// get, set // 


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



	public String getIsRent() {
		return isRent;
	}



	public void setIsRent(String isRent) {
		this.isRent = isRent;
	}



	
	
	
}
