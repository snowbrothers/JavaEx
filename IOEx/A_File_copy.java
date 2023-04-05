package com.chap1;

import java.io.File;
import java.io.IOException;

// 파일을 만드는 방법

public class A_File {

	public static void main(String[] args) {
		
		// 객체 생성
		A_File a = new A_File();
		
		// 메소드 실행 : 레퍼런스 변수에 주소접근연산자 (.)도트 연산자를 통해서 실행
		//a.method1();
		a.method1();
	}
	
	
	public void method2() {

		//File file = new File("d:/test.txt");
		File file = new File("d:/test/test.tex");
		
		//디렉토리 생성
		File dir = new File("d:/test");
		
		try {
			// 디렉토리 생성 코드 
			dir.mkdir();
			
			// 경로내의 디렉토리가 여러개 생성되어야 할 경우 .
			// dir.mkdirs 
			
			// 파일 생성
			file.createNewFile();
			
			// IOException : 문자 입출력시 자주 발생하는 예외.
		} catch (IOException e) {
			System.err.println(e.getMessage());
		
		}
		
	}
	public void method1() {

		// 경로를 지정하지 않으면 현재 프로젝트폴더에 파일을 생성합니다.
		// 메모리 상에만 존재
		
		File file = new File("test.txt");
		                                           
		System.out.println("파일명 : " + file.getName());       
		System.out.println("절대 경로 : " + file.getAbsolutePath());
		System.out.println("상대 경로 : " + file.getPath());       
		System.out.println("파일 용량 : " + file.length() ); // true      
		System.out.println("파일 존재 여부 : " + file.exists() );       
		
		
		// 실제 파일 생성                          
		// 파일 생성 후 꼭 새로고침 할 것.
		
		try {
			
			file.createNewFile();
		
		} catch (IOException e) {
		
			System.out.println(e.getMessage());
			
			e.printStackTrace();
			
		}
	
		System.out.println(file.exists() );
	}
	
	
	
}
