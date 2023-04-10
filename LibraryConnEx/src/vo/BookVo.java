package vo;

public class BookVo {

	private int bookNo; // 일련번호
	private String title; // 제목
	private String author; // 작가
	private String rentYN;
	
	
	@Override
	public String toString() {

		String str = "";
		
		str = getRentYN().equals("Y")? "대여중":" ";
		
		
		return getbookNo() 
				+" "+ getTitle() 
				+" "+getAuthor() 
				+" "+str;
	}
	
	
	
	public String info() {
		
		
		return "";
	}
	
	
	
	
	public BookVo(int no, String title, String author, String rentYN) {

		this.bookNo = no;
		this.title = title;
		this.author = author;
		this.rentYN = rentYN;
	}

	
	
	// get, set //
	
	public int getbookNo() {
		return bookNo;
	}

	public void setbookNo(int no) {
		this.bookNo = no;
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
