package nasa;

public class Rotto {

	public static void main(String[] args) {

		int a = 0;

		System.out.println("로또번호 7자리를 출력합니다.");

		while (a <= 7) {

			int rotto = (int) (Math.random() * 45 + 1);
			System.out.print(rotto + " ");

			a++;

			if (a == 7) {
				break;

			}

		}
	}
}
