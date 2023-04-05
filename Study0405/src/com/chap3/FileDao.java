package com.chap3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Book 에 있는 정보를 파일로 입력하고 출력한다?
 *
 * @author user
 *
 */
public class FileDao {

	public static void main(String[] args) {

		FileDao file = new FileDao();

		file.fileSave();
		
		
		
		try(BufferedReader br = new BufferedReader(new FileReader("bookList.txt"));) {
			
			String str = " ";
			List<Book> list = new ArrayList<>();
		
			while ((str = br.readLine()) != null) {
				
				String [] strArray = str.split(" " );
			
			int no = Integer.parseInt(strArray[0]);
			String title = strArray[1];
			String author = strArray[2];
			boolean isRent = Boolean.parseBoolean(strArray[3]);
			
			list.add(new Book(no, title, author, isRent));
			
			
			
			}
			
			System.out.println("파일로 부터 읽어들인 책 정보를 출력합니다.");
			 
			for (Book book : list) {
				
				System.out.println(book.toString());
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
			
			
		

	}
	
	
	
	
	
	public void fileRead() {
		
		try(BufferedReader br 
				= new BufferedReader(new FileReader("bookList.txt"));) {
			
			String readLine = " ";
			List<Book> list = new ArrayList<>();
			
			while((readLine = br.readLine()) != null){
				
				String[] strArray = readLine.split(" ");
				
				int no = Integer.parseInt(strArray[0]);
				String title = strArray[1];
				String author = strArray[2];
				boolean isRent = Boolean.parseBoolean(strArray[3]);
			
			
				//리스트에 저장!
			
				list.add(new Book(no, title, author, isRent));
				
				
				
			}
			
			System.out.println("파일로 부터 읽어들인 책 정보를 출력합니다.");
			
			for (Book book : list) { 
				
				System.out.println(book.toString());
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

	// 파일 저장
	public void fileSave() {

		// Book 을 담고 잇는 List 선언
		List<Book> bookList = new ArrayList<>();

		// List 의 add 메소드를 통해 리스트를 생성한다.
		bookList.add(new Book(1, "책1", "작가1", false));
		bookList.add(new Book(2, "책2", "작가2", false));
		bookList.add(new Book(3, "책3", "작가3", false));
		bookList.add(new Book(4, "책4", "작가4", false));

		System.out.println("책 정보 출력 = = = = = = = = =");

		// 콘솔창에 출력됩니다.
		/*
		 * for(Book book : bookList) {
		 * 
		 * System.out.println(book.toString());
		 * 
		 * }
		 */

		try (BufferedWriter bw = new BufferedWriter(new FileWriter("bookList.txt"));) {

			for (Book book : bookList) {

				bw.write(book.toString());
				bw.newLine();
			}

			bw.flush();
			System.out.println("파일 출력 완료!");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		

		
	}

}
