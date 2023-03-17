package nasa;

public class Nasa {

	public static void main(String[] args) {

		int num = (int) (Math.random() * 10 + 1);

		System.out.println("1부터 10 까지의 임의의 정수를 출력합니다.");
		System.out.println("임의의 정수 : " + num);

		System.out.println("==============================");

		int zu = (int) (Math.random() * 6 + 1);

		System.out.println("임의의 주사위 숫자는 : " + zu);

		System.out.println("==============================");

		// 로또 번호 45개 중에서 7 자리를 임의의 정수로 구해보자.

		int rotto = (int)(Math.random() * 45 + 1);
		int rotto2 = (int)(Math.random() * 45 + 1);
		int rotto3 = (int)(Math.random() * 45 + 1);
		int rotto4 = (int)(Math.random() * 45 + 1);
		int rotto5 = (int)(Math.random() * 45 + 1);
		int rotto6 = (int)(Math.random() * 45 + 1);
		int rotto7 = (int)(Math.random() * 45 + 1);
		
		System.out.println("로또번호 7자리를 출력합니다.");
		
		System.out.println(" 첫번째 번호: " + rotto);
		System.out.println(" 두번째 번호: " + rotto2);
		System.out.println(" 세번째 번호 : " + rotto3);
		System.out.println(" 네번째 번호 : " + rotto4);
		System.out.println(" 다섯번 째 번호 : " + rotto5);
		System.out.println(" 여섯번째 번호 : " + rotto6);
		System.out.println(" 일곱번째 번호 : " + rotto7);

	}

}
		
		
	

