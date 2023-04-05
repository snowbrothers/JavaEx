package com.library.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import vo.Book;

public class FileDao implements Dao
{

	
	  
	 
	/**
	 * 파일로 부터 객체를 생성해 리스트에 담습니다.
	 * 
	 */
	@Override
	public List<Book> getList() {

		System.out.println("FileDao.getList() 실행");
		
		List<Book> list = new ArrayList<>();
		
		/**
		 * 파일을 읽어서 리스트를 반환한다.
		 * 
		 * 반납할 자원이 있는 경우에 try() 안에서 생성 할 경우 자동으로 close 가 된다.
		 * 
		 */
		
		
		try (FileReader fr = new FileReader("bookList.txt");
				BufferedReader br = new BufferedReader(fr);){
			
			
			String str = " ";
			
			while((str = br.readLine()) != null){
				
				Book book  = makeBook(str);
				
				if(book != null) {
					
					list.add(book);
					
					
				}
			}
			
			
		} catch (FileNotFoundException e) {

			System.err.println(e.getMessage());
			e.printStackTrace();
		
		} catch (IOException e1) {

			System.err.println(e1.getMessage());
			e1.printStackTrace();
		}
		
		
		
		return list;
	}

	/**
	 * 
	 * 문자열을 받아서 책을 생성하고 반환한다.
	 * @param str
	 * @return
	 */
	
	
	public Book makeBook(String str) {
		
		Book book = null;
	
		
		try {
			
			String[] strArray = str.split(" ");
			int no = Integer.parseInt(strArray[0]);
			String title = strArray[1];
			String author = strArray[2];
			boolean isRent = Boolean.parseBoolean(strArray[3]);
			
			book = new Book(no, title, author, isRent);
		
		
		} catch (Exception e) {

			System.out.println("리스트 생성 중 오류가 발생하였습니다.");
			System.out.println("====================== readLine(_) : " + str);
		}
	
		
		return book;
	}
	
	
	
	
	@Override
	public boolean fileSave(List<Book> list) {
		// 리스트를 파일로 저장합니다.
		try(FileWriter fw = new FileWriter("bookList.txt");) {
			
			for(Book book : list) {
				
				
				fw.write(book.toString() + "\n");
			}
			
			fw.flush();
			
			System.out.println("파일 출력");
			
		} catch (IOException e) {

			
			e.printStackTrace();
		}
		
		
		
		
		return false;
	}

	
	
	
	
}
