package practice4;

public class NonStaticSample {

	public void printLottoNumbers() {
		
		
		// 1 ~ 45 까지 임의의 정수 6개 출력
		// 배열을 선언한다.
		// 
		int[] randomArr = new int[6];
		// 반복문 안에서 임의의 정수를 생성한다.
		
		while(true) {
		
			int num = (int)(Math.random()*45 + 1);

			// 배열에 임의의 숫자를 넣는다.
			for(int i=0; i<randomArr.length; i++){{
				randomArr[i] = num;
				
			}

			
		
		}
				
		
		
			
			
				
				
			
			
			if(randomArr[5] != 0) {
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	public void outputChar(int num, char c) {
		
		
	}
	
	public char alphabette() {
		
		
		return 0;
	}
	
	
	public String  mySubstring(String str, int index1, int index2){
		
		return null;
	}
}
