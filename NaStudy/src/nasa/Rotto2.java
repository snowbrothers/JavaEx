package nasa;

public class Rotto2 {

	public static void main(String[] args) {
		
		//로또번호 출력
		
		
		/* System.out.println("===== 로또 번호를 출력합니다. =====");
		
		int gr = (int)(Math.random() * 45 + 1);
		
		for(int a = 1; a <= 7; a++) {
			
			
			System.out.print(gr + " ");*/
			
		
		// while 문을 사용한 로또번호 출력 
			int a = 0;
			
			while (a <= 7) {
				
				int gr = (int)(Math.random() * 45 + 1);
				
				System.out.print(gr + " ");
				
				a++;
				
				if (a == 7) {
					break;
				}
				
			
		}
	}

}
