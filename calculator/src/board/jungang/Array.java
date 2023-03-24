package board.jungang;

public class Array {

	public static void main(String[] args) {
		
		// 배열의 방을 만들어준다.
		// 타입을 명시해야 한다.
		// 배열은 같은 타입을 여러개 저장하는 자료구조.
		// 컴퓨터가 데이터를 효율적으로 다룰수 있도록 하는 데이터 보관 방법이다.
		
		// int[] intArr = {1, 2, 3, 4, 5}
		// 기본값으로 초기화 int = 0
		//  0 0 0 0 0 
		
		int [] intArr = new int[5];
		intArr[0] = 5;
		intArr[1] = 4;
		intArr[2] = 3;
		intArr[3] = 2;
		intArr[4] = 1;

		
		
		//타입 [] 변수이름 = new 타입[방의갯수];
		// null null null null null
		Board[] boardArr = new Board[5];

		// board객체를 생성하여 boardArr 배열 0번째 index 에 넣어줍니다.
		// new 를 사해서 생성자의 정보를 담는다.?
		boardArr[0] = new Board("게시글1" , "홍길동");
		boardArr[1] = new Board("게시글2" , "임꺽정");
		boardArr[2] = new Board("게시글3" , "변강쇠");
		boardArr[3] = new Board("게시글4" , "나무꾼");
		boardArr[4] = new Board("게시글5" , "노루사냥꾼");
		
		for(Board board : boardArr) {
			
			System.out.println(" ====================== ");			
			System.out.println(board.title);
			System.out.println(board.content);
			System.out.println(board.writer);
			System.out.println(board.date);
			System.out.println(board.hitcount);
			System.out.println(" ====================== ");			
			
		}
		
		
		
	}

}
