package nasa;

public class ForLoofing {

	public static void main(String[] args) {

		// for 문을 사용해 1부터 10까지 출력하기
		
		// for(초기화식; 조건식; 증감식) {}
		for(int b = 1; b <= 10; b++) {
		
			System.out.print(b + " ");
		
			
		}
		
		System.out.println(" ");
		
		
		// for 문을 사용해 2부터 6 까지 출력하기
		
		for(int c = 2; c <= 6; c++) {
			
			
			System.out.print(c + " ");
			
			
		}
		
		System.out.println("=========== for문 ==========");
		
		// for문을 통해 1부터 50 까지 수의 합을 구해보자.
		
		
		int a = 0;
		
		for(int i = 1; i <= 100; i++) {
			
			
			a +=i;
			
		}
		
		System.out.println("1부터 100 까지 수의 합은 :" +  a + " 입니다." );
		
		
	}

}
