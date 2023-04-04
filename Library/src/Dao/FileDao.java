package Dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.library.vo.Book;

public class FileDao implements Dao {

	
	
	public static void main(String[] args) {
		
		
		
		FileDao dao = new FileDao();
		
		dao.getBookList();
		
	}
	
	
	
	@Override
	public List<Book> getBookList() {
	
		System.out.println("책의 리스트를 조회");
		
		
		String str = " ";
		
		// 파일 읽어
		// 공백으로 자르기 스플릿
		// 책을 생성할 파라메터 만들기
		// 책생성
		// 리스트에 담기
		
		List<Book> list = new ArrayList<>();
		
		try(BufferedReader br 
				= new BufferedReader(new FileReader("bookList.txt"));) {
			
			
		
			while((str = br.readLine()) != null) {
				
			String[] strArray = str.split(" ");
			
			int no = Integer.parseInt(strArray[0]);
			String title = strArray[1];
			String author = strArray[2];
			boolean isRent = Boolean.parseBoolean(strArray[3]);
			
			list.add(new Book(no, title, author, isRent));
			
			}
			
			for(Book book : list) {
				
				System.out.println(book.toString());
				
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		return list;
		
		
		
	
	}




	@Override
	public int insertBook(List<Book> list) {
		System.out.println("=======");
		try(FileWriter fw = new FileWriter("bookList.txt")) {
			
			for(Book book : list) {
				
				fw.write(book.toString() + "\n");
			}
			
			
			fw.flush();
			
		} catch (Exception e) {
		
			e.printStackTrace();
			
		}
		
		return 0;
	}



	@Override
	public int deleteBook(List<Book> list) {
		System.out.println("도서 삭제");
		return 0;
	}



	@Override
	public int updatBook(List<Book> list) {
		System.out.println("도서정보 업데이트");
		return 0;
	}

}
