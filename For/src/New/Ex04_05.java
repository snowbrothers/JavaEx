package New;

public class Ex04_05 {

	public static void main(String[] args) {
		
		System.out.println("반복 시작 ============ ");
		for(int i = 1; i < 10; i++) {
		
		// *을 출력
		// i <= j
		// =======
		// 1 <= 1
		// 2 <= 1	
		// ======
		// 1 <= 2
		// 2 <= 2
		// 3 <= 2 -> 조건 불일치 탈출
			
			for (int j = 1; j <= i; j++ ) {
				System.out.print("*");
			}
		
			System.out.println("");

		} 
		
	}

}
