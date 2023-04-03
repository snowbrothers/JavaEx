package vo;

public class LibMain {

	public static void main(String[] args) {
		
		
		LibraryEx lib = new LibraryEx();
		
		
		// 책추가
		lib.insertBook(1, "책1 ", "작가1", false);
		lib.insertBook(2, "책2 ", "작가2", false);
		lib.insertBook(3, "책3 ", "작가3", false);
		lib.insertBook(4, "책4 ", "작가4", false);
		
		// 책 출력 메소드 작성.
		
		
		lib.info();
		
		
		// 책삭제

		lib.removeBook(2);
		
		
		lib.info();
	}
}
