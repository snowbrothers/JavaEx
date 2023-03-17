package exid3;

import java.io.IOException;

public class Test1 {

	public static void main(String[] args) throws IOException {
		
		int keyCode;
		// 키보드에서 입력된 내용을 변수에 저장하기
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		
		
	}	

}
