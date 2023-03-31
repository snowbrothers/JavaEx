package execeptionEx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bmi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double height, weight;

	
		Out: while (true) {

			// Bmi 구하기

			// 숫자를 받아옵니다.

			// 사용자가 숫자를 입력 할 수 있도록 유도

			while (true) {
				try {
					// 숫자를 받아옵니다
					System.out.println("키를 입력해주세요(m))");
					height = scan.nextDouble();

					if (height > 3) {
						System.out.println("키는 3m를 넘을 수 없습니다");
						continue;
					}

					break;

				} catch (Exception e) {
					String str = scan.next();

					System.out.println(str + "입력 할 수 없습니다. \n 숫자를 입력해주세요.");
				}
			}

			// 숫자를 받아올때까지 반복

			while (true) {

				try {

					System.out.print("몸무게를 입력해주세요(kg)");
					weight = scan.nextDouble();

					// 사용자의 입력값 범위를 체크
					if (weight > 200 || weight < 20) {

						System.out.println("몸무게는 20보다 크고 200보다 작은 값을 입력 해야 합니다.");
						 continue;

					}

					break;

				} catch (InputMismatchException e) {
					String str = scan.next();
					System.out.println(str + "을 입력할 수 없습니다.\n 숫자를입력해주세요");
				}

			}

			System.out.println("키 : " + height);
			System.out.println("몸무게 : " + weight);

			double bmi = weight / (height * height);

			System.out.println("당신의 bmi 는 " + bmi + " 입니다.");

			if (bmi < 18.9) {
				System.out.println("저체중 입니다.");
			} else if (bmi < 22.9) {
				System.out.println("정상 입니다.");
			} else if (bmi < 23.9) {
				System.out.println("과체중 입니다.");
			} else {
				System.out.println("비만 입니다.");
			}

			try {

				System.out.println("종료 : q | 다시 입력 : y 를 입력해주세요.");
				String str = scan.next();
				if (str.equals("q")) {

					break Out;

				} else if (str.equals("y")) {
					
				}
				break;
			
			} catch (Exception e) {

				int i = scan.nextInt();
				System.out.println("숫자를 입력 할 수 없습니다. 문자를 입력해주세요.");

			}

//		while(true) {
//			
//			try {
//				
//				if();
//				
//			} catch (Exception e) {
//				
//				System.out.println("문자를 입력해주세요.");
//			}

		}

		System.out.println("BMI 프로그램 종료.");
	}

}
