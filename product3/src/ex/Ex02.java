
package ex;

public class Ex02 {

	public static void main(String[] args) {
		// 배열의 값을 정렬하고 싶어요!
		// 방을 바꾸기 위해 새로운 변수를 선언하고 이용합니다.
		int lotteNum;
		int[] numbers = {5,3,4,2,1};
	
		
		/* for(int num : numbers) {
			
			if (num == lotteNum) {
				
			}
		} */
		
		
	String str = "안녕하세요!!";
		
		System.out.println("char : " + str.charAt(0));
		System.out.println((int)str.charAt(0));
		System.out.println(" =========================== ");
		
		// 문자열 끊기 
		System.out.println(str.length());
		
		// 인덱스 0에서 부터 2글자 
		System.out.println(str.substring(0,2));
		
		// 시작인덱스, 끝 인덱스
		// (시작인덱스는 포함, 끝 인덱스는 포함되지 않는다.)
		System.out.println(str.substring(2,5));
		
	}

}


