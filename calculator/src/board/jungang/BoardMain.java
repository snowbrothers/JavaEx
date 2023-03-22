package board.jungang;

import java.util.Iterator;

public class BoardMain {

	public static void main(String[] args) {
		// 게시글을 생성한다
		
		// 배열 생성
		
		
		Board board1 = new Board("게시글1", "너무 어려워요 ", "강백호", "23-03-22", 0) ;
		Board board2 = new Board("게시글2", "너무 어려워요 ", "강백호", "23-03-22", 0) ;
		Board board3 = new Board("게시글3", "너무 어려워요 ", "강백호", "23-03-22", 0) ;
		Board board4 = new Board("게시글4", "너무 어려워요 ", "강백호", "23-03-22", 0) ;
		Board board5 = new Board("게시글5", "너무 어려워요 ", "강백호", "23-03-22", 0) ;
		Board board6 = new Board("게시글6", "너무 어려워요 ", "강백호", "23-03-22", 0) ;
		Board board7 = new Board("게시글7", "너무 어려워요 ", "강백호", "23-03-22", 0) ;
		Board board8 = new Board("게시글8", "너무 어려워요 ", "강백호", "23-03-22", 0) ;
		Board board9 = new Board("게시글9", "너무 어려워요 ", "강백호", "23-03-22", 0) ;
		Board board10 = new Board("게시글10", "너무 어려워요 ", "강백호", "23-03-22", 0) ;
		
		// 배열에 담아 줍니다.
		Board[] boardList = new Board[5];
		boardList[0] = board1;
		boardList[1] = board2;
		boardList[2] = board3;
		boardList[3] = board4;
		boardList[4] = board5;
	
		// 게시글 리스트 생성
		BoardList list = new BoardList(boardList);
		for(int i=0; i <boardList.length; i++) {
			System.out.println(list.boardList[i]);
			
		}
		
	}

}
