package com.san;

import java.util.Scanner;

public class LibraryScanner {

	public static void main(String[] args) {

		Library lib = new Library();

		// 사용자에게 번호를 입력받는다.
		// 1. 추가 / 2. 삭제 / 3. 대여 / 4. 책장정보 출력 /5. 종료

		// ++ 추가 ++ 인덱스번호를 초과한 번호를 입력했을때. 예외처리
		
		Scanner scan = new Scanner(System.in);


		while (true) {

			System.out.println("---------------------------------------------");
			System.out.println("1. 추가 | 2. 삭제 | 3. 대여 | 4. 모든책 출력 | 5. 종료");
			System.out.println("---------------------------------------------");
			int selectNumber = scan.nextInt();
			
			switch (selectNumber) {

			case 1:

				System.out.print("책 제목을 입력해주세요. ");
				String title = scan.next();

				System.out.print("저자를 입력해주세요. ");
				String author = scan.next();

				lib.addBook(title, author);


				break;

			case 2:

				lib.toString();
				System.out.println("삭제할 책의 인덱스 번호를 입력해주세요. (0 ~ ... )");

				int index = scan.nextInt();

				lib.removeBook(index);

				break;
				
			case 3:
				
				lib.toString();
				System.out.println("대여하실 책의 인덱스 번호를 입력해주세요. (0 ~ ... ) ");

				int index1 = scan.nextInt();
				
				lib.upDate(index1);
				
				break;
				
			case 4:
				
				System.out.println("저장되어 있는 모든 책정보를 출력합니다.");
				lib.toString();
				
				break;

			case 5:
				
				System.out.println("도서대출 프로그램을 종료합니다.");
				System.exit(0);

			default:
				break;
			}
		}

	}

}
