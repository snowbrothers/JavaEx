package vo2;

// 데이터를 담는 그릇
public class BookVo {

	private int bookNo;
	private String title;
	private String author;
	private String rentYN;
	
	
	public BookVo(int bookNo, String title, String author, String rentYN) {
	
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.rentYN = rentYN;
	}

	
	// 책의 정보를 반환 할 수 있는 toString 정의
	@Override
	public String toString() {

		String str = "";
		if(getRentYN().equals("Y")) {
			
			str = "대여중";
		} 
		
		
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
