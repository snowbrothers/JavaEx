package New;

public class Ex04_03 {

	public static void main(String[] args) {
	
		// 두개의 주사위를 던져서 나온 수 
		// 1 ~ 6 : 까지 6개의 수가 나올 수 있다.
		// 0.000....1 <= Math.random( ) < 1 
		// 0.000....1 <=             < 0.999....9
		// 0.000....6 <=             < 5.4......
		// 1.000....6 <=             < 6.4...... +1을 했을때
		// 0보다 크거나 같고 5보다 작은 값을 추출 0,1,2,3,4,5
		// 초기값 지정 (+) + 1
		
		System.out.println(" 주사위를 굴립니다 ");
		
		int sum = 0;
		
		while(true) {
			
			int dice = (int)(Math.random() * 6) + 1;
			int dice2 = (int)(Math.random() * 6) + 1;
			System.out.println(dice + "," + dice2);
			
			// += 피연산자가 1개 일 경우에 사용하는게 좋다.
			
			sum = dice +dice2;
	
			if(sum == 5) {
				
				System.out.println(sum);
				// printf("(%d,%d), dice, dice2;
		
				break;
			}
		}
		
		
		
		
		
	}

}
