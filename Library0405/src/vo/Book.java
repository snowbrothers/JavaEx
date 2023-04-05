package vo;

public class Book implements Comparable<Book>{

	
	// 책에 대한 정보를 가지고 있음
	
	private int number;  // 일련번호
	private String title;  // 제목
	private String author;   // 작가
	private boolean isRent;    // 대여여부
	
	
	public Book() {
		
		
	}
	
	
	public Book(int number, String title, String author, boolean isRent) {

		this.number = number;
		this.title = title;
		this.author = author;
		this.isRent = isRent;
	}

	
	
	@Override
	public String toString() {

		String str = " ";
		
		if(isRent) {
			
			str = "대여중";
		}
		
		
		return getNumber() 
				+" "+ getTitle() 
				+" "+ getAuthor() 
				+" "+ isRent;
	}

	
	public String info() {

		String str = "대여가능";
		
		if(isRent) {
			
			str = "대여중";
		}
		
		
		return getNumber() 
				+" "+ getTitle() 
				+" "+ getAuthor() 
				+" "+ str;
	}

	
	// get, set
	
	

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


	// 정렬! 방 바꾸기.
	@Override
	public int compareTo(Book o) {

		if(this.number>o.getNumber()) {
		
			
			
			return 1;
			
		} else {
			
			return -1;
		}
			
			
	}


	
	


	

	
	
	
}
