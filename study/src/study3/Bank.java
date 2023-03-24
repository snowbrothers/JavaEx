package study3;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {

		//boolean run = true; // 반복문 사용을 위해서
		 
		int balance = 0; // 잔액에 사용자가 입력한 값을 더하거나 빼주어야 하기 때문에 변수생성
		Scanner scan = new Scanner(System.in);

		while (true) {

			System.out.println(" ===================================");
			System.out.println("  1. 예금| 2. 출금 | 3. 잔고  | 4.종료 ");
			System.out.println(" ===================================");

			int num = scan.nextInt();

			switch (num) {
			
			case 1:
				System.out.println("예금하실 금액을 입력해주세요.");
				int money = scan.nextInt();
				System.out.println(money + "원 입금하겠습니다.");

				balance += money;

				System.out.println("현재 잔액: " + balance);
				System.out.println("");

				break;

			case 2:
				System.out.println("출금하실 금액을 입력해주세요.");
				money = scan.nextInt();
				System.out.println(money + "원 출금 하겠습니다.");

				if (money >= balance) {
					System.out.println("잔액이 부족합니다.");
					System.out.println("현재 잔액: " + balance);

				} else {
					
					System.out.println(money + "원 출금하겠습니다.");
					balance -= money;
					System.out.println("현재 잔액: " + balance);
					System.out.println("");
				}

				break;

			case 3:
				System.out.println(" 현재 잔액을 표시합니다. 잠시만 기다려주세요.");
				System.out.println(" 현재 잔액: " + balance);

				break;
			case 4:
				System.out.println(" Bank 입/출금 종료 하겠습니다. ");
				System.out.println(" 안녕히 가세요. ");

				System.exit(0);

				// run = false;
			}
			scan.close();
		}


	}

}
