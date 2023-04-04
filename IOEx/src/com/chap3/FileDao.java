package com.chap3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileDao {

	public static void main(String[] args) {
		
		FileDao file = new FileDao();
		
		
		try(BufferedReader br 
					= new BufferedReader(new FileReader("bookList.txt"));) {

			String str =" ";
			List<Book> list = new ArrayList<>();
			
			
		while((str = br.readLine()) != null) {
			
			
//			String str = "1 책1 작가1 false";
			// 매개변수 구분자로 끊어서 배열로 반환해주는 메소드 ! / 
	
			
			// 구분자로 끊어서 배열에 저장
			String[] strArray = str.split(" ");
			
			int no = Integer.parseInt(strArray[0]);
			String title = strArray[1];
			String author = strArray[2];
			boolean isRent = Boolean.parseBoolean(strArray[3]);
			
			list.add(new Book(no, title, author, isRent));
		
			
			//System.out.println("책 정보 출력");
			//System.out.println(book.toString());
		//	System.out.println(str);
			
		}
		
		System.out.println("파일로 부터 읽어들인 책 정보를 출력합니다.");
		
		for(Book book : list) {
			
			System.out.println(book.toString());
		}

		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		} catch (IOException e1) {
			System.err.println(e1.getMessage());
		}
		
		
		
		
		
		// split 테스트
//		int i=0;
//		for(String s : strArray) {
//			
//			System.out.println("방번호 : " + i+ " / " + s);
//			i++;
//		}
//		
		//file.fileRead();
		
		
		
	}
	
	public void fileRead() {
		
		try(BufferedReader bf 
				= new BufferedReader(new FileReader("bookList.txt"));) {
			List<Book> bookList = new ArrayList<>();
		
			String str = " ";
		
		while((str = bf.readLine()) != null) {
			
			// 구분자로 끊어서 
			String[] strArray = str.split(" ");
			
			int no = Integer.parseInt(strArray[0]);
			String title = strArray[1];
			String author = strArray[2];
			Boolean isrent =Boolean.parseBoolean(strArray[3]);
			
			
			bookList.add(new Book(no,title, author, isrent));
			
		
		}
		System.out.println("생성된 리스트를 출력 합니다.");
		for(Book book : bookList) {
			
			System.out.println(book.toString());
		}
		
		
		} catch (FileNotFoundException e) {

			
			e.printStackTrace();
		
		} catch (IOException e1) {
		
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		String str = "1 타이틀1 작가1 false";
		// 구분자로 끊어서 배열로 반환
		// {1, 타이틀1, 작가1, false}
		String[] strArry = str.split(" ");
		// new Book(1, "타이틀1", "작가1", false);
		
		new Book(Integer.parseInt(strArry[0])
				, strArry[1]
				, strArry[2]
				, Boolean.parseBoolean(strArry[3]));

		
	}
	

	/**
	 * 파일을 읽어서 책 리스트를 생성한다.
	 * 
	 */
//	public void fileRead() { 
//		
//		try(BufferedReader br = new BufferedReader(new FileReader("bookList.txt"))) {
//
//			String str = " ";
//			while((str = br.readLine()) != null) {
//				
//				System.out.println(str);
//				
//				
//			}
//			
//		} catch (FileNotFoundException e) {
//
//			e.printStackTrace();
//		
//		} catch (IOException e1) {
//
//			e1.printStackTrace();
//		}
//		
//		
//	}
	
	/**
	 * 리스트에 담겨 있던 책의 정보를 출력
	 * 
	 */
	public void fileSave() {
		
			// 담는 타입 
				// ArrayList >> 리스트의 구현체
				List<Book> bookList = new ArrayList<>();
				
				
				
				
				bookList.add(new Book(1, "책1", "작가1", false));
				bookList.add(new Book(2, "책2", "작가2", false));
				bookList.add(new Book(3, "책3", "작가3", false));
				
				System.out.println("책 정보 출력 -------- ");
				
				
			/*	for(Book book : bookList) {
					
					System.out.println(book.toString()); */
				
				
				try(BufferedWriter bw 
						= new BufferedWriter(new FileWriter("bookList.txt"));) {

				
				for(Book book : bookList) {
					// 콘솔출력
					//System.out.println(book.toString());
				
					bw.write(book.toString());
					bw.newLine();
					
				}	
				
				bw.flush();
				System.out.println("파일 출력 완료!");
				
			} catch (IOException e) {
			

				e.printStackTrace();
			}
				}
	

}
	
	

