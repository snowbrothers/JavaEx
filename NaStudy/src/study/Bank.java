package study;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		
		// while 문과 scanner 를 이용해서 예금, 출금 조회, 종료 기능을 가진 코드 작성
		
		// 공통으로 사용되는 변수 저장
		
		
		
		Scanner scan = new Scanner(System.in); // 사용자의 입력을 받아야 하기 때문에 scanner 사용
		boolean run = true;
		int total = 0; // 합해줄 거니까 변수 하나 선언 /초기화
		int money = 0;
		
		while (run) {
			
			
			
			System.out.println("\n----------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			
			int num = scan.nextInt();
			
			switch (num) {
			case 1:
				System.out.println("");
				System.out.printf("예금액을 입력하세요.");
				
				money += scan.nextInt();
				
				System.out.printf("예금액 > %d ", money);
				System.out.printf("\n잔고: %d", total +=money );
				
				
				break;
				
			case 2:
				System.out.println("출금액을 입력하세요.");
				
				money = scan.nextInt();
				
				
				
				if(total < money) {
					System.out.println("잔액이 부족합니다.");
					System.out.println("잔고: " + total + "원 입니다.");
				} else {
					
					// 변수에 저장 해야함 . 
					// total - money ->> 계산식일뿐,
					total -= money;
					System.out.printf("출금액 > %d\n", money);
					System.out.println("잔고: " + (total));
					
				}
				
				break;
				
			case 3: 
				System.out.println("잔고: " + total + "원 입니다");
				
				break;
				
			default:
				
				System.out.println("안녕히 가십시오.");
				System.exit(0);
				
				break;
			}
	
		} // while 중괄호
		
		
	scan.close();
		
		
		
		
	}

}
