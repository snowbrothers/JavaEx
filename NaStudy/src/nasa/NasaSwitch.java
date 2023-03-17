package nasa;

public class NasaSwitch {

	public static void main(String[] args) {
		
		// swich 문을 이용한 임의의 주사위 숫자 출력
		// swich 문은 괄호 안의 변수 값과 동일한 값을 가지는 case 로 가서 실행문을 실행한다.
		
		// 변수 선언
		
		int num = (int)(Math.random() * 6 + 1); 
		
		switch (num) {
		
		case 1:
			System.out.println("1 번이 나왔습니다.");
			break;
			
		case 2:
			System.out.println("2 번이 나왔습니다.");
		
			break;
		case 3:
			System.out.println("3 번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4 번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5 번이 나왔습니다.");	
			break;
		case 6:
			System.out.println("6 번이 나왔습니다.");
			break;
		
		default:
			break;
		}
	}

}
