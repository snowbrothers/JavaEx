package New;

public class Ex04_02 {

	public static void main(String[] args) {
		
		// 1 ~ 100까지의 정수 중에서 3의 배수의 총합을 구하는 코드를 작성하라.

		int sum = 0;
		// i = 1
		System.out.println("=== 3의배수 ===");
		
		for (int i = 1; i < 101; i++) {

			// 3의 배수인지 판단 !!
			// != << (! = 부정연산자)
			// == 같으면 != 같지 않으면
			if (i % 3 != 0) {
				// 3의 배수가 아니면 증감식으로 이동
				// break: 반복문 탈출
				// continue : 증감식으로 이동해
				// continue이후 명령문장을 실행하지 않고 증감식으로 이동한다.
				continue;
			}
			 System.out.println(i);
			
			 sum += i;

		}// for 문 종료

		System.out.println("1 ~ 100 까지 3의 배수의 합: " + sum);

	}

}
