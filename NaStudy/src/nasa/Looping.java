package nasa;

public class Looping {

	public static void main(String[] args) {

		// for문

		// 1 ~ 5 까지 수의 합 ; 만약 연산 수가 늘어난다면
		// 코드가 길어 질수 있다.

		int sum = 0;

		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5;

		System.out.println(sum);

		System.out.println("=======================");

		// 변수 이름 잘 확인할 것

		int sum1 = 0;
		for (int i = 1; i <= 100; i++) {
			sum1 += i;
			// System.out.println(i);

		} System.out.println(sum1);

		System.out.println("=======================");

		// for문을 사용해 3부터 20까지 합을 구하시오.

		int sum2 = 0;
		for (int a = 3; a <= 20; a++) {

			sum2 += a;

		}

		System.out.println(sum2);
	}
	
	

}
