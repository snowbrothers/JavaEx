package vo;

public class BookEx {

	private int number;
	private	String title;
	private	String author;
	private	boolean isRent = false;

	// 생성자
	
	public BookEx(int number, String title, String author, boolean isRent) {

		this.number = number;
		this.title = title;
		this.author = author;
		this.isRent = isRent;
	}
	
	
	public String info() {
		
		
		
		return getNumber() 
					+ " / " + getTitle() 
					+ " / " + getAuthor() 
					+ " / " + isRent;
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

	public boolean getIsRent() {
		return isRent;
	}

	public void setIsRent(boolean isRent) {
		this.isRent = isRent;
	}
	
	
	
	
	
	
}
