package New;

public class ForEx {

	public static void main(String[] args) {

		// 중첩(이중)반복문을 이용하여 구구단 출력

		// dan : 2 ~ 9
		// for(초기화식; 조건식; 증감식) {}
		// dna == 6

		// lable
		Outter: for (int dan = 2; dan < 10; dan++) {

			// 만약 6단이면 구구단을 출력하지마시오
			System.out.println(dan + "단");

			for (int i = 9; i > 0; i--) {

				if (dan == 2) {
					// lable의 위치까지 반복을 탈출합니다.
					break Outter;
				}

				// for (int i = 1; i<10; i++) {} 범위내에서 원하는 값을 반복해서 출력가능
				System.out.printf("%d * %d = %d\n", dan, i, dan * i);

			}

			// for 종료

			System.out.println();

			//
			// 6단 을 출력한 후 반복문을 탈출
//			if(dan==6) {
//				break;

		} // for 문 종료

		System.out.println("=========== 짝수의 합 구하기 ==========");

		// continue
		// 1~10까지의 수 중에서 짝수의 경우의 합을 구해봅시다
		int sum = 0;
		for (int i = 1; i < 11; i++) {

			// 홀수이면 증감식으로 넘어갑니다.
			// % : 나머지연산자
			// 2로 나눈 나머지가 1이면 홀수
			// 2로 나는 나머지가 0이면 짝수

			if (i % 2 == 1) { // 홀수 라면
				continue; // 증감식으로 이동하시오.
			}

			System.out.println("i=" + i);
			sum += i; // sum = sum +1
		}

		System.out.println("1부터 10까지 짝수의 합: " + sum);

	}// main 코드블럭

}


