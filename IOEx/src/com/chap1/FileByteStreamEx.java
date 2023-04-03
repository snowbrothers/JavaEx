package com.chap1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.format.FormatStyle;


public class FileByteStreamEx {

	public static void main(String[] args) throws IOException {
		
		FileByteStreamEx fbs = new FileByteStreamEx();
	
		FileByteStreamEx ex 
					= new FileByteStreamEx();
	
		ex.fileRead();
	
	}
	
	public void fileRead() {
		
		// 규칙을 이해하고 사용하면 됨.
		
		// 사용한 자원을 닫아주기 위해서 상단에 선언합니다.
		
		FileInputStream fis = null;
		
		
		
		//파일로부터 데이터를 읽어올 때 Read 메소드 사용
		// 실제 데이터 양 측정 불가
		// 읽을 데이터가 없으면 -1 리턴
		// 반복문 사용 read() => -1 까지
		
		try {
			
			fis = new FileInputStream("a_byte.dat");
		
			int value = 0;
			// 데이터를 읽어서 value 변수에 저장
			// -1 : 문장의 끝
			
			value = fis.read();
			System.out.println(value);
			
		
			
			
//			while((value =fis.read()) != -1) {
//				System.out.print((char)value);
//				
//				
//			}
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
			
		
		} finally {
			
			try {
				fis.close();
				
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			
		}
				
	}
	
	
	public void fileSave() throws IOException {
		
		FileOutputStream fos = null;
		
		try {
			// 프로젝트 내부에 파일 생성
			fos = new FileOutputStream("a_byte.dat");
			// 문자 출력 스트림
			fos.write(97); // a저장
			fos.write('b'); // b저장
			fos.write(10); // 저장
			//fos.write('한');
			
			byte[] byteArry = { 'a','b', 'c', 'd'};

			fos.write(byteArry);
			fos.write(10); // 저장
			//for.write(배열, 인덱스, 갯수)
			fos.write(byteArry, 1, 2);
			fos.flush();
			
			
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());

		} catch (IOException e) {
			
			System.out.println(e.getMessage());
			
		} finally {
			
			
			// 사용중인 자원이 있다면 종료시켜줍니다.

			if(fos != null) {
				try {

					// 스트림을 이용했으면 닫아 주어야 합니다.
					fos.close();
					
				} catch (IOException e) {
					
					System.out.println(e.getMessage());
				
				}
				
			}
			
		}
		
		
		
		
		
		
		
		
		
	}
	
}
