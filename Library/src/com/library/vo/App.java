package com.library.vo;

import java.util.Scanner;

public class App {

	
	Scanner scan = new Scanner(System.in);
		
	
//	public static int age;
//	public static String name;
//	
	public static void main(String[] args) {

		App app = new App();
		
		/* // 숫자 입력
		System.out.println("나이를 입력해주세요.");
		System.out.println("나이 : " + app.getInt());
		
		// 문자열 입력
		System.out.println("이름을 입력해주세요");
		System.out.println("나이 : " + app.getString());
		
		System.out.println(" =========== 나의 정보 ============ ");
		
		System.out.println("이름 : " + age);
		System.out.println("나이 : " + name); */
		
	}

	
	public int getInt() {
		
		int i=0;
		
		while(true) {
			
			try {
				
				String str = scan.next();
				
				//if(str)	
				
				if(str.equalsIgnoreCase("q")) {
					
					System.out.println("시스템을 종료합니다.");
					System.exit(0);

				}
				
				i = Integer.parseInt(str);
				
				break;
				
			} catch (Exception e) {
				
				System.err.println("오류가 발생했습니다.");
				System.err.println("숫자를 입력해주세요.");
				
			}
		}
		
		// age = i;
		
		return i;
	}
	
	
	public String getString() {
		
		String str =  " ";
		
		while(true) {
			
			try {
				
				str = scan.next();
				
				
				try {

					// 숫자로 변환 합니다.
					
					Integer.parseInt(str);
					// 숫자로 변환 되면 입력을 다시 받아 올수 있도록 한다.
					System.err.println("문자를 입력해주세요.");
					// 숫자로 변환 되면 입력을 다시 받아 올 수 있도록 합니다.
					continue;
				
				} catch (Exception e) {
					
				}
				
				//if(str)	
				
				if(str.equalsIgnoreCase("q")) {
					
					System.out.println("시스템을 종료합니다.");
					System.exit(0);

				}
				
				
				break;
				
			} catch (Exception e) {
				
				System.err.println("오류가 발생했습니다.");
				System.err.println("문자를 입력해주세요.");
				
			}
		}
		
		// name = str;
		
		return str;
	}
	
}
