package vo;

public class LibMain {

	public static void main(String[] args) {
		
		Library lib = new Library();

		lib.info();
		
		lib.insertBook(5, "책5", "작가5", false);
		
		lib.deleteBook(4);
		
		lib.info();
		
		lib.rentBook(5);
		
		lib.info();
		
		lib.returnBook(5);
		
		lib.info();
		
	}
	
	
	
	
}
