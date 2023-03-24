package ex;

public class Ex03 {
	public static void main(String[] args) {
	
		int[] numbers = new int[6];
		int i=0;
		while(true) {
			int num = (int)(Math.random()*45+1);
			if(numbers[i] != num) {
				numbers[i] = num;
				i++;
			}
			if(numbers[5]!=0) {
				break;
			}
		}
		
		for(int num : numbers) {
			System.out.println(num);
		}
		
		System.out.println("======================");
		String str = "안녕하세요";
		
		// 시작인덱스, 끝인덱스
		// 시작인덱스포함, 끝인덱스 불포함
		str.substring(3);
		
		 
		char c = 65;
		// 문자코드에 대응하는 숫자를 입력후 출력
		System.out.println(c);
		
		// 0번째 인덱스의 char값 반환
		str.charAt(0);
		
		
		
		
		
	}
}
