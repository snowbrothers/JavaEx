package com.chap1;

import java.io.File;
import java.io.IOException;

public class A_File {

	// 파일 만들기
	
	public static void main(String[] args) {
		
		
		A_File a = new A_File();
		
		a.method1();
		
		// 디렉토리 생성 후 파일 생성
		//a.method2(); 
		
		
	}

public void method1() {
	
	// 프로젝트 폴더에 파일 생성
	
	File file = new File("test2.txt");

	System.out.println("파일명 : " + file.getName());
	System.out.println("절대 경로 : " + file.getAbsolutePath());
	System.out.println("상대 경로 : " + file.getPath());
	System.out.println("파일 용량 : " + file.length());
	System.out.println("파일 존재 여부 : " + file.exists());

	
	try {
		file.createNewFile();
	
	} catch (IOException e) {
	
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println(file.exists());
}
	
	
public void method2() {
	
	 
		File file = new File("d:/test2/text2.txt");
		
		File dir = new File("d:/test2");
		
		// 디렉토리 생성 메소드
		
		
		try {
			

			dir.mkdir();
			
			file.createNewFile();
		
		} catch (IOException e) {
			
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}

}
