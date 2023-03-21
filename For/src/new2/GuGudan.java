package new2;

public class GuGudan {

	public static void main(String[] args) {
		
		// for 문을 이용한 구구단 작성
		
		//변수 선언 및 값 저장
		int dan =3;
		
		System.out.println("===== 3단 =====");
		// for(초기화식; 조건식; 증감식;){}
		for (int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
			
		}
		
		System.out.println("== 구구단을 외우자 ==");
		int ddan = 2;
		
		for(ddan= 2; ddan<10; ddan++) {
			for(int i=1; i <=9; i++) {
				
				System.out.printf("%d * %d = %d", ddan, i, ddan*i);
				System.out.println("");
			}
			
			System.out.println("===================");
		}
		
	}

}
