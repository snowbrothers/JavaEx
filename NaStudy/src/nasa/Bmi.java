package nasa;

import java.util.Scanner;

public class Bmi {

	public static void main(String[] args) {
		
		// Bmi 를 만드는 프로그램을 출력해보자.
		// 키를 입력
		// 몸무게를 입력
		// Bmi 변수 저장
		// Bmi 출력
		// 과체중 알아보기
		// Strig 타입을 이용해 종료하기
		
	
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("======= BMI 계산을 시작합니다 =======");
			
			System.out.println(" \"키\" 를 입력해주세요. (m) <숫자로 입력하세요>");
			
			double height = scan.nextDouble();
			
			System.out.println(" \"몸무게\" 를 입력해주세요 (kg) <숫자로 입력하세요>");
			
			double weight = scan.nextDouble();
			
			double bmi = weight / (height * height);
			
			System.out.printf("당신의 BMI 는 %.2f 입니다.", bmi);
			
			System.out.println("\n당신의 비만 정도는...\n");
			
			if(bmi <= 18.5) {
				System.out.print("저체중 입니다.");
				
			} else if (bmi <= 22.9) {
				System.out.println("정상체중 입니다");
			} else if (bmi <= 24.9) {
				System.out.println("과체중 입니다."); 
			} else {
				System.out.println("비만 입니다.");
			}

			System.out.println("\n종료: q / 계속 : Any Button");
			
			
			String str = scan.next();
			if("q".equals(str)) {
				break;
			
			}
			
			System.out.println("======================");
		}
		
		
		
		
		
	}

}
