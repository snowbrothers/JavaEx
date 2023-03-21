package New;

import java.util.Scanner;

public class Ex04_07 {

	public static void main(String[] args) {
		// 입력을 받기 위해서 Scanner 객체를 생성합니다.

		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int total = 0;
		int money = 0;

		
		// switch 의 break 와 while 의 break 를 구분하여 사용 할 것.
		// 라벨 (이름)을 붙여줍니다.
		// out:
		while (run) {

			System.out.println("================================");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("================================");
			System.out.println("선택>");


			// scan.next() //사용자의 입력을 문자열로 변환
			int input = scan.nextInt(); // 사용자의 입력을 숫자로 변환

			/*
			 * if(input == 1) { //예금
			 * 
			 * } else if(input == 2) { //출금 }
			 */

			// switch (변수){
			// case 변수의값 :
			// 문장을 실행
			// }
			// 1. case문 완성 시키기
			// 2. 반복해서 실행하기

			switch (input) {
			case 1:
				// 변수의 값이 1이면 실행
				// 코드 작성

				System.out.println("예금하실 금액을 입력해주세요.> ");
				money = scan.nextInt();
				
				// 잔고 값에 예금액을 더하고 변수저장
				total += money;

				System.out.println("예금액: " + money);
				System.out.println("잔고: " + total);

				// 반복문, switch 문을 빠져나갑니다.
				// break 문이 없으면 다음 case 를 계속해서 실행 합니다.
				break;

			case 2:

				System.out.println("출금하실 금액을 입력해주세요. > ");
				
				money = scan.nextInt();
				System.out.println(money);
				
				// 전체 돈보다 빼고자 하는 금액이 같거나 적은 경우
				if (total >= money) {
					
					System.out.println("잔고: " + total);
					
					total -= money;
				
				} else {
					
					System.out.println("잔고가 부족합니다.");
				}


				break;

			case 3:
				System.out.println("잔고 > " + total);

				break;

			case 4:
				
				//System.exit(0);
				
				run = !true;
				//out;
				
			}

			
		}

		System.out.println("===== 프로그램 종료 ======");
	}

}


