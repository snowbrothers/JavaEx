package com.chap1;

import java.io.FileReader;
import java.io.FileWriter;

public class FileCharStream {

	
	public static void main(String[] args) {
		
		
		FileCharStream fcs = new FileCharStream();
		
		
		 //fcs.fileSave();
		fcs.fileRead();
	
	}
	
	
	// 읽어오는 메소드!
	public void fileRead() {
		
		try(FileReader fr = new FileReader("b_char.text")) {
			int value = 0;
//			System.out.println((char)fr.read());
//			System.out.println((char)fr.read());
//			System.out.println((char)fr.read());
//			System.out.println((char)fr.read());
//			System.out.println((char)fr.read());
////		
			while((value=fr.read()) != -1) {
			System.out.print((char)value);
		}
			
		} catch (Exception e) {
			
		
		}
		
	}
	
	//출력하는 메소드!
	public void fileSave() {
		
		// 리소스를 자동으로 close()
		// FileWriter를 이용해서 파일을 생성하고
		// 데이터를 문자단위로 저장 한다.
		
		try(FileWriter fw = new FileWriter("b_char.text")) {
			
			fw.write("너무 어려우우어요요\n");
			fw.write("혼자서 절대 못한다 이거는");
			fw.write('A');
			fw.write(' ');
			fw.write('\n');
			fw.write(new char[]{'a', 'b', 'c', 'd'});
			
			fw.flush();
			
		} catch (Exception e){
			
		} finally {
			
			System.out.println("시스템이 종료되었습니다.");
		}
		
	}
	
}
