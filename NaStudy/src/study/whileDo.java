package study;

public class whileDo {

	public static void main(String[] args) {

		int i = 1;
		
		while(i<0) { 
			System.out.println("0보다 작습니다.");
		}
		
		
		//do while => 코드블럭 우선 1회 실행 후 조건 판단.
		
		do { 
			System.out.println("최초 1회는 코드블럭 내 실행문을 반드시 실행한다.");
			System.out.println("실행 후 조건문이 참 일때까지 반복한다.");
			
			// 코드블럭 내에 있어야함.
			i++;
		
		} while (i < 4); {
			
			
			
			}
		
		System.out.println("=====================");
		
		int num = 0;
		do {
			System.out.println(num);
			num++;	
		} while(num<10);
		
		System.out.println(" ================== ");
		
		int a = 0;
		while (a < 10) {
			a++;
			if (a % 2 == 0) {
				continue; // 짝수인 경우 조건문으로 
		}
			System.out.println(a);
		
	
	
	}
	

	}
	
}


