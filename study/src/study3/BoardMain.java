package study3;

public class BoardMain {

	public static void main(String[] args) {
		
	Board board	= new Board("오늘의 날씨", "너무 덥다", "눈사람", "23-03-23", 0);
	
	Board[] boardArr = new Board[5];
    
	// 배열의 선언 .. 생각할것. 
	boardArr[0] = new Board("강백호", "화가난다", "2만번","23-03-21,", 20);
    boardArr[1] = new Board("서태웅", "가난다", "만번","23-03-21,", 20);
 	boardArr[2] = new Board("채치수", "난다", "2번","23-03-21,", 20);
	boardArr[3] = new Board("이한나", "다", "2만","23-03-21,", 20);			
	boardArr[4] = new Board("채소연", "화다", "2만","23-03-21,", 20);
	
	for(Board slam : boardArr) {
		System.out.println(" ==========================");
		System.out.println(slam.title);
		System.out.println(slam.content);
		System.out.println(slam.writer);
		System.out.println(slam.date);
		System.out.println(slam.hitcount);
		System.out.println(" ========================== ");
	}
	}

}
