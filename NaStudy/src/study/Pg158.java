package study;

public class Pg158 {

	public static void main(String[] args) {
		
		// Label:
		Outter: for(char upper='A'; upper <='Z'; upper++) {
			for(char lower='a'; lower <='z'; lower++) {
				System.out.println(upper +'-'+ lower);
			if(lower == 'g') {
				break Outter; // Label; 
			}
			} 
		}
		
		System.out.println("프로그램 종료");
	}

}
