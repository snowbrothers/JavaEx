package board.jungang;

public class Board {
	
	// 게시글에 대한 내용을 담는 것
	// ==================== 필드를 정의 ========================
	// 제목
	String title;
	// 내용
	String content;
	// 작성자
	String writer;
	// 작성일
	String date;
	// 조회수
	int hitcount;
	
	// 생성자의 특징.
	// 반환 타입이 없다 / 클래스이름과 동일한 타입을 가진다.
	public Board(String title, String content ) {
		this(title, content , "로그인한 회원 아이디 ", "작성일", 0);
		
		/* this.title = title;
		this.content = content;
		this.writer = "로그인한 회원 아이디";
		this.date = "현재 컴퓨터 날짜";
		this.hitcount = 0; */
		
	}	
	
	public Board (String title, String content, 
						String writer, String date, int hitcount) {
		
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount; 
		
		
	}

	
	

}
