package New;

public class ForEEx {
	
	public static void main(String[] args) {
		
		//Math.random ->> 
		// 0 < num < 1 사이의 임의의 수 구하기
		// Math.random() * 범위 +시작점
		
		while(true) {
			int num = (int)(Math.random()*6 + 1);
			System.out.println(num);
		}
		
	}

}
