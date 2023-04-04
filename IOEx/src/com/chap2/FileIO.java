package com.chap2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 파일 입출력
// 직접 파일로 떨구는 작업

public class FileIO {

	public static void main(String[] args) {
		
		
		FileIO io = new FileIO();
	//	io.fileIOCopy();
		
		
		io.fileCopy();
		
		//io.fileCopyRe();
		
		// 출력시 문자가 깨지는 이유 utf-8 에서는 한글자에 3바이트를 할당하기 때문에 깨짐.
		// read , write
		
	}
	
	
	/**
	 * 파일 복사하기 ! ! ! 
	 * 
	 * A_File.java 파일을 읽어서 
	 * A_File_copy.java 파일을 생성합니다.
	 * 
	 */
	// 작성하고 있는 자바 파일을 읽어서 새로운 파일로 만들고 싶다.
	
	public void fileIOCopy() {
		
		
		long startTime, endTime;
		
		startTime = System.currentTimeMillis();
		
			
		// 경로 지정 파일이 있는지 없는지 오류 발생여부 체크 가능.
		File file = new File("C:\\Users\\user\\git\\JavaEx\\IOEx\\src\\com\\chap1\\A_File.java");
		
		if(!file.exists()) { //존재하지 않는 경우 실행오류 발생.
			
			System.out.println("파일이 존재하지 않습니다.");
			return;
		}

		
		// 파일 읽어오는 클래스
		
		try(FileInputStream fis = new FileInputStream(file); 
				FileOutputStream fos = new FileOutputStream("A_File_copy.java")) {
				// A_File_copy.java 라는 파일을 내 프로젝트 기준으로 생성.
			
			int value =0;
			
			// 콘솔창에 출력 
			// .read 1바이트 씩 읽어온다
			// 파일이 종료가 되면 read 에 -1 값이 반환됨
			// -1 EndOfFile
			int i = 0;
			byte[] byteArr = new byte[100];
	
			while ((i = fis.read(byteArr)) != -1 ){
				
				//System.out.print((char)value);
				// 0 부터 반환 인덱스
				fos.write(byteArr, 0, i);	
				
			}
		
		
			
//			while ((value = fis.read()) != -1 ){
//			
//				//System.out.print((char)value);
//				fos.write(value);	
//				
//			}
//		
			fos.flush();


		} catch (FileNotFoundException e) {
		
			System.err.println(e.getMessage());
		
		} catch (IOException e1) {
		
		
			e1.printStackTrace();
		
		}
		
		endTime = System.currentTimeMillis();
		System.out.println("소요시간 : " + (endTime - startTime));
	}
	
	
	
	
	public void fileCopy() {
		
		// 파일 복사하기.
		
		
		long sTime, eTime;
		
		sTime = System.currentTimeMillis() ;

		File file = new File("C:\\Users\\user\\Downloads\\13_1_컬렉션프레임워크.pptx");
		
		if(!file.exists()) {
			
			System.out.println("파일이 존재하지 않습니다.");
			return;
		}
		
		
		try(FileOutputStream fos = new FileOutputStream("컬렉션프레임워크_copy.pptx");
				FileInputStream fis = new FileInputStream(file)) {
		
		int value =0;
			
		int i = 0;
		byte[] byteArr = new byte[600000];
		// i = 바이트 배열에 읽어온 갯수를 반환합니다.
		while((i = fis.read(byteArr)) != -1) {
			
			// 읽어온 갯수만큼 출력합니다
			// 마지막 출력시 배열의 개수를 다 채우지 못하면
			// 이전에 읽어들이 내용이 출력됩니다.
			
			
			fos.write(byteArr,0,1);
			
		}
		
		fos.flush();
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		} catch (IOException e1) {
		
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
	eTime = System.currentTimeMillis() ;
	System.out.println("소요시간 : " + (eTime - sTime));
	
	
	}
	
	
	// 파일 준비
	/**
	 * FileinputStream 으로 읽어와서 
	 * FileOutputStream 으로 저장하기
	 */
	
	public void fileCopyRe() {
		
		try (
				// 생성할 리소스 생성
				FileInputStream fis 
				= new FileInputStream("컬렉션프레임워크.pptx");
				FileOutputStream fos 
				= new FileOutputStream("컬렉션프레임워크_copy.pprx");
				
				// close 닫아줄 필요 없음
				
				) {
			
		int value = 0;	
		// read 가 반환하는 값 in	

		while((value = fis.read()) != -1) {
			// 파일 복사
			fos.write(value);
			
		}
			// * 중요 * flush
			fos.flush();
		
			
		} catch (Exception e) {

			
		
		}
		
		
		
		
	}
	
	
	
	
	
	
	
}
