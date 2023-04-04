package vo;

public class LibMain {

	
	public static void main(String[] args) {
		
		
		Library lib = new Library();
		
		System.out.print("[1]");
		lib.toString();
		
		lib.insertBook(5, "책5", "작가5", false);
		
		System.out.print("[2]");
		lib.toString();
		
		lib.deleteBook(5);
		
		System.out.print("[3]");
		lib.toString();
		
		lib.rentBook(4);
		
		System.out.print("[4]");
		lib.toString();
		
		lib.returnBook(4);
		
		System.out.print("[5]");
		lib.toString();
		
		
		
	}
}
