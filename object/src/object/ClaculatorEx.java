package object;

import java.util.Scanner;

public class ClaculatorEx {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean gogo = true;
		
		System.out.println("============================================");
		System.out.println("1.덧셈 | 2.뺄셈 | 3.곱셈 | 4.나눗셈 | 5.나머지 구하기 ");
		System.out.println("=============================================");
		
		
		
		int i = scan.nextInt();
		
		switch (i) {
		case 1:
			System.out.println("===== 덧셈 연산을 실행합니다. =====");
			System.out.println("더하고자 하는 두 수를 입력해주세요.");
			
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			Claculator c = new Claculator();
			int result = c.claculator(a, b);
			
			System.out.println(a + "+" + b + "=" + result + "입니다.");
			
			break;
			
		case 2:
			System.out.println("===== 뺄셈 연산을 실행합니다 ======");
			System.out.println("빼고자 하는 두 수를 입력해주세요.");
			
			int a1 = scan.nextInt();
			int b1 = scan.nextInt();
			
			Claculator c1 = new Claculator();
			int result1 = c1.minus(a1, b1);
			
			System.out.println(a1 + "-" + b1 + "= " + result1 + "입니다.");
			
			break;
			
		case 3:
			System.out.println("===== 곱셉 연산을 실행합니다 ======");
			System.out.println("곱하고자 하는 두 수를 입력해주세요.");
			
			int a2 = scan.nextInt();
			int b2 = scan.nextInt();
			
			Claculator c2 = new Claculator();
			int result2 = c2.multipul(a2, b2);
			
			System.out.println(a2 + "*" + b2 + " = " + result2 + "입니다.");
			
			break;
			
		case 4:
			System.out.println("====== 나눗셈 연산을 실행합니다 ======");
			System.out.println("나누고자 하는 두 수를 입력해주세요.");
			
			int a3 = scan.nextInt();
			int b3 = scan.nextInt();
			
			Claculator c3 = new Claculator();
			int result3 = c3.division(a3, b3);
			
			System.out.println(a3 + "/" + b3 + " = " + result3 + "입니다.");
			
			break;
			
		case 5:
			System.out.println("====== 나머지를 구합니다 =======");
			System.out.println("나누고자 하는 두 수를 입력해주세요.");
			
			int a4 = scan.nextInt();
			int b5 = scan.nextInt();
			
			Claculator c4 = new Claculator();
			int result4 = c4.percent(a4, b5);
			
			System.out.println(a4 +"를" + b5 +"로 나눈 나머지는  " + result4 + "입니다.");
			
		default:
			break;
		}
		
		scan.close();
		
		
		
	}

}
