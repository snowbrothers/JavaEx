package study;

import java.util.Scanner;

public class Bank1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//boolean run = true;
		int money = 0;
		int total = 0;

		while(true) {
			
			System.out.println("=================================");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			
			int num = scan.nextInt();
			
			switch (num) {
			
			case 1:
				
				System.out.println("예금액을 입력해주세요.");
				
				money = scan.nextInt();
				
				System.out.println("예금액 > " + money);
				
				total += money;
				
				System.out.println("잔고: " + total + " 원");
				
				break;
				
			case 2:
				
				System.out.println("출금액을 입력해주세요.");
				
				money = scan.nextInt();
				
				if (money <= total) {
					
					total -= money;
					System.out.println("출금액: " + money);
					System.out.println("잔고: " + total);
					
				} else {
					System.out.println("잔액이 부족합니다.");
				}
				break;
				
			case 3:
				System.out.println("잔고: " + total + "원 입니다.");
				
				break;
				
			case 4:
				
				//run = !true;
				System.out.println("안녕히 가십시오.");
				System.exit(0);
				
				break;
				
			}
		}
		

	}

}
