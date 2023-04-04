package vo;

import java.util.Scanner;

import dao.Dao;

public class LibScan {

	Scanner scan = new Scanner(System.in);
	
	private Dao dao;
	
	public static void main(String[] args) {
		
		
		
	}
	
	
	
	
	// getInt , getString // 
	
	
	public String getString() {
	
		String str = " "; 
		
		while(true) {
			
			
			try {
				
				
				str = scan.next();
				
				break;
			
			} catch (Exception e) {
				
				
				System.err.println("입력도중 오류가 발생했습니다.");
				System.err.println("문자를 입력해주세요.");
			
			}
		}
		
		return str;
	}
	
	public int getInt() {
		
		
		int i = 0;

	
		while(true) {
		
		
		try {
			
			
			String str = scan.next();
			
			i = Integer.parseInt(str);
			
			break;
		} catch (Exception e) {
			
			
			System.err.println("입력도중 오류가 발생했습니다.");
			System.err.println("숫자를 입력해주세요.");
		
		}
	}
		
			
		
		
		return i;
	}
}
