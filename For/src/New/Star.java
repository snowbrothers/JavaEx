package New;

public class Star {

	public static void main(String[] args) {

		// 바깥총 for 문 실행 
		// 안쪽 for 문은 2번실행 후 바깥 쪽 for 문으로 돌아간다.
		// 
		
		for( int j = 0; j < 3; j++) {
			for (int i = 0; i < 2; i++) {
				System.out.println("*");
			}
			System.out.println("------");
			System.out.println();
			
			
		}
				
	}

}
