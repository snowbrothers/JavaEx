package com.library.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.library.vo.Book;

public class FileDao implements Dao{

	/**
	 * 
	 * 파일로부터 객체를 생성해 리스트에 담습니다.
	 * 
	 * 
	 */
	
	@Override
	public List<Book> getlist() {
		
		System.out.println("FileDao.getList() 시wkr");
		
		List<Book> list = new ArrayList<>();
		
		/**
		 * 파일을 읽어서 리스트를 반환한다
		 * 
		 */
		// 반납할 자원이 있는 경우 try () 안에서 생성할 경우 자동으로 close 해줍니다.
		// 
		try(FileReader fr = new FileReader("bookList.txt");
				BufferedReader br = new BufferedReader(fr); ) {

				
			String str = " ";
			
			// 파일로 부터 한줄을 읽어들여 null 이 될 때 까지 반복
			// null = 파일의 끝
			
			while((str = br.readLine()) != null) {

				Book book = makeBook(str);

				// 리스트 파싱 중 오류가 발생한 건은 제외
				if(book != null) {
					
					list.add(book);
					
				}
				
			
				
				
			}
			
			
			
			
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
			
		} catch (IOException e1) {
			System.err.println(e1.getMessage());
		}
		
		
		
		
		
		return list;
	}

	
	/**
	 * 
	 * 문자열을 받아서 책을 생성하여 반환 합니다.
	 * @param str
	 * @return
	 */
	// 접근제한자 타입 이름 (매개변수)
	public Book makeBook(String str) {
		
		Book book = null;
		
		try {
		
			String[] strArray = str.split(" ");
			
			
			int no = Integer.parseInt(strArray[0]);
			String title = strArray[1];
			String author = strArray[2];
			boolean isRent = Boolean.parseBoolean(strArray[3]);
			
			
		book =  new Book(no, title, author, isRent);
			
		
		
		} catch (Exception e) {
			// 데이터 파싱 중 오류가 발생 하더라도 프로그램이 종료되지 않도록
			// try구문을 활용하여 오류를 처리한다.
			
			System.err.println("리스트 생성중 오류가 발생 하였습니다.");
			System.err.println("============== readLine() : " +  str );
		
		
		}
		
		// 책이 정상적으로 생성된 경우 Book를 반환
		// 생성 중 오류가 발생 시 null을 반환한다.
		return book;
	}


	@Override
	public boolean fileSave(List<Book> list) {
		// 리스트틀 파일로 저장합니다.
		try(FileWriter fw = new FileWriter("bookList.txt");) {
			
			for(Book book : list) {
				
				// 책의 정보를 공백으로 연결하여 반환
				// 파일로 저장할 때 개행을 해줘야함
				fw.write(book.toString()+ "\n");
			}
			
			fw.flush();
			
			System.out.println("파일 출력성고오옹!");
			return true;
			
		} catch (IOException e) {
		
			
			e.printStackTrace();
		}
		
		
		return false;
	}
}
