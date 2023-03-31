package ccom.lib;

public class LibMain {

	public static void main(String[] args) {

		
		// 출력하기 위해 Libray 객체를 생성한다
		
		Libray lib = new Libray();
		
		// 우선 도서관 에 책을 저장한다
		
		lib.addBook("명란젓코난", "김수자");  // 인덱스 0 
		lib.addBook("양치기소녀, 하이디", "지킬박사"); // 인덱스 1
		lib.addBook("반지의 왕재수", "똘킨"); // 인덱스 2 
		lib.addBook("장대비", "황순헌"); // 인덱스 3 
		lib.addBook("난장이가 쏘아올린 바이올린", "파가니니"); // 인덱스 4 
		
		System.out.println("============================");
		System.out.println("저장된 책 정보를 출력합니다.");
		System.out.println("============================");
		
		lib.toString();
		
		// 책 삭제
		
		lib.removeBook(4);
		System.out.println("============================");
		System.out.println("저장된 책 정보를 출력합니다.");
		System.out.println("============================");
		
		
		lib.toString();
		
		
		
	}

}
