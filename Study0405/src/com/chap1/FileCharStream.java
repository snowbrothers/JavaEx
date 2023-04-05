package com.chap1;

import java.io.FileWriter;
import java.io.IOException;

public class FileCharStream {

	public static void main(String[] args) {

		
		
		FileCharStream fcs = new FileCharStream();
		
		fcs.filesave();
		
		
		
	}

	
	
	public void filesave() {
		
		
		try(FileWriter fw = new FileWriter("b_char.text");) {
		
			fw.write("문자기반스트림 \n");
			fw.write("테스트중입니다.\n");
			fw.write("A \n");
			fw.write(' ');
			fw.write('\n');
			fw.write(new char[] {'a','b', 'c', 'd'});
			
			fw.flush();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		} finally {
			
			System.out.println("시스템이 종료되었습니다.");
		}
		
		
	}
	
}
