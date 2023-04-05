package com.chap1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteStream {

	
	public static void main(String[] args) {
		
		FileByteStream fbs = new FileByteStream();
		fbs.fileSave();
		
		fbs.fileRead();
		
	}

	
	// 바이트 입력 스트림 : InputStream
	
	public void fileRead() {
		
		FileInputStream fis = null;
		
		
		
		try {
		
			fis = new FileInputStream("outputTest.dat");
		
			int value = 0;
			
			while((value = fis.read()) != -1) {
				
				// 
				System.out.print((char)value);
				
			}
			
			
			System.out.println(value);
			
		} catch (FileNotFoundException e) {
		
			// TODO Auto-generated catch block
			
			e.printStackTrace();
	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		} finally { 
			
			try {
			
				fis.close();
			
			} catch (IOException e) {
				
				System.out.println(e.getMessage());
			}
		}
		
		
		
	}


	// 바이트 출력 스트림 : OutputStream
	
	public void fileSave() {
		
		FileOutputStream fos = null;
		
		// 프로젝트 내부에 파일을 생성한다.
		// 입출력 시 오류가 발생 할 수 있기 때문에 try / catch 를 사용
		try {
			fos = new FileOutputStream("outputTest.dat");
		
			// 문자 출력 
			fos.write(65); 
			fos.write('v');
			fos.write(10); // 줄바꿈
			///fos.write('한');
			
			byte[] byteArry = { 'a', 'b', 'c', 'd'};
			
			fos.write(byteArry);
			fos.write(10); // 줄바꿈
			
			fos.write(byteArry, 1, 2);
			fos.write(10);
			fos.flush();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		// 문자 입출력 시 예외발생 가능 예외처리.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		} finally {
			
			if(fos != null) {

				try {

					fos.close();
				
			} catch (Exception e2) {
				

				System.out.println(e2.getMessage());
				
			}
			}
		}
		
		
	}
	
}
