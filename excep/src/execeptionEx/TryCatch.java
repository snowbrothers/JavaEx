package execeptionEx;

import java.util.Scanner;

public class TryCatch {

	
	public static void main(String[] args) {
		
		/**
		 * 
		 * try - catch
		 * 
		 * try{
		 * 
		 * 			// 예외가 발생할 소지가 있는 코드
		 * } catch(Exception e){
		 *			// try 블럭에서 예외가 발생시 실행을 멈추고 catch블럭으로 이동하여 
		 *					예외처리 코드를 실행
		 * 
		 */
		
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
		try {
			
			System.out.println("숫자를 입력해주세요.");
			// 사용자가 문자를 입력했을 경우, 숫자로 변환 시 오류가 발생한다.
			int num = scan.nextInt();
			System.out.println(num + "입력되었습니다.");
			break;
		} catch (Exception e) {
			//e.printStackTrace();
		
			String str = scan.next();
			System.out.println(str + " 는 입력 가능한 숫자가 아닙니다.");
			// TODO: handle exception
			
		}

		

		}
		}
	}

