package study;

import java.util.Scanner;

public class Bmi {

	public static void main(String[] args) {

		// Bmi 를 출력해보자
		// 사용자에게 입력 받아야 한다 Scanner 를 이용해야함.
		// 삼항연산자를 사용해서 ?
		
		while(true) {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("======= BMI 를 계산합니다 =======");
			//키를 입력하세요
			
			System.out.println("키를 입력해주세요 (m) <숫자로 입력해주세요>");
			
			double height = scan.nextDouble();
			
			System.out.println("몸무게를 입력해주세요 (kg) <숫자로 입력해주세요>");
			
			double weight = scan.nextDouble();
			
			double bmi = weight / (height * height);
			
			System.out.printf("당신의 bmi는 %.2f 입니다. ", bmi);
			
			// 삼항연산자 사용 
			
			String result = (bmi < 18.5) ? "저체중 입니다." : (bmi < 22.9) ? "정상 입니다." : (bmi < 22.9) ? "과체중 입니다." : "뚱땡이" ;
			
			System.out.println("\n"+ result);
			
			// q를 누르면 종료 
			System.out.println("종료: q , 계속 :any butoon");
			
			String str = scan.next();
			
			if(str.equals("q")) {
				
				System.out.println(" == 프로그램을 종료하겠습니다. ==");
			} else {
				
			}
			
		} // while 중괄호
		
		
		
		
		
									
	}

}
