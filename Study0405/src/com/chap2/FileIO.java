package com.chap2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIO {

	
	public static void main(String[] args) {
		
		
		FileIO io = new FileIO();
		
		io.fileIOCopy();
		
		
	}




	public void fileIOCopy() {
		
		
		File file = new File("D:\\Workspace3\\Study0405\\src\\com\\chap1\\A_File.java");
		
		if(!file.exists()) { 
			
			System.out.println("파일이 존재하지 않습니다.");
			return; 
		}
		try(FileInputStream fis = new FileInputStream(file);
				FileOutputStream fos = new FileOutputStream("A_File_copy.java")) {
			
			int value = 0;
			
			
			byte[] byteArry = new byte[100];
			
			while ((value = fis.read(byteArry)) != -1) {
				
				fos.write(byteArry,0,value);
			}
			
			
			fos.flush();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}


}
