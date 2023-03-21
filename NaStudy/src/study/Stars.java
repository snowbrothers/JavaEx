package study;

public class Stars {

	public static void main(String[] args) {

		// 이중 중첩for문을 사용해 별을 찍어보자
		
		
		for(int i=1; i<5; i++) {
			for (int s=1; s<=i; s++)
				System.out.print("*");
				System.out.println("");
		}
	}

}
