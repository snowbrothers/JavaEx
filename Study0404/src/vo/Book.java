package vo;

public class Book {

	private int number;
	private String title;
	private String author;
	private boolean isRent;
	
	
	public Book(int number, String title, String author, boolean isRent) {

		this.number = number;
		this.title = title;
		this.author = author;
		this.isRent = isRent;
	}
	
	
	
	
	@Override
	public String toString() {

		
		// 리턴하려고 선언
		String str = " "; 
		
		if(isRent) {
			
			str = " / 대여중";
		}
		
		
		return getNumber() +" /  "+ getTitle() +" / "+ getAuthor() + str; 
				
	}




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
