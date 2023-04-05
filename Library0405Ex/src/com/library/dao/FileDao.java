package com.library.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.library.vo.Book;

public class FileDao implements Dao {

	/**
	 *	파일로부터 데이터를 읽는다 . read//  
	 * 	리스트에 담고 반환한다.
	 */
	@Override
	public List<Book> getList() {

		List<Book> list = new ArrayList<>();
		
		// 입력스트림 
		// 버퍼 리더의 매개변수로 문자기반스트림, 파일리더를 넣어준다.
		// 입출력 시 오류가 발생 할 수 있기 때문에 try/catch 로 묶어야함.
		
		try(BufferedReader br = 
					new BufferedReader(new FileReader("bookList.txt"));) {
			
			// 파일로부터 읽어올 것, 버퍼리더가 제공하는 readLine 사용
			// 코드를 한줄씩 읽어온다.
			// null 값이 될때까지 읽어오기때문에 while 문을 사용해서 반복하도록 만든다.
			
			
			String str = " ";
			
			
			// 미리선언한 str 에 읽어온 데이터를 담는다.
			
			// 스트링 배열을 선언하고 스플릿을 통해 구분자 설정 후 파일을 읽어온다.
			while((str = br.readLine()) != null) {
				
				Book book = makeBook(str);
				
				if(book != null) {
					
					list.add(book);
				}
				
			
				
				}
			
			System.out.println("리스트에 파일의 데이터를 성공적으로 저장했습니다!");
			
			
			
		} catch (FileNotFoundException e) {
			System.err.println("오류가 발생했습니다. FileDao/getList");
			System.out.println(e.getMessage());
		
		} catch (IOException e1) {
			System.err.println("오류가 발생했습니다. FileDao/getList");
			System.out.println(e1.getMessage());
		}
		
		
		return list;
	}
	
	
	/**
	 * 문자열을 파싱하여 Book객체를 생성
	 * 코드를 간결하게 하기위해 메서드에 작성한다.
	 * @param str
	 * @return
	 */
	public Book makeBook(String str) {
		
		// Book 을 생성하기 위해 알맞은 타입으로 저장
		// 책을 생성
		// 오류 발생 시 null 반환
		
		
		try {
			
			String[] strArry = str.split(" ");
			
			// 책의 정보를 담고 있는 
			// bookList 의 데이터를 구분자로 끊어 배열에 저장 할 것이기 때문에
			// 변수의 이름을 책의 정보에 맞게 설정하고 책을 생성 후 리스트에 추가한다.
			
			int no = Integer.parseInt(strArry[0]);
			String title = strArry[1];
			String author = strArry[2];
			boolean isRent = Boolean.parseBoolean(strArry[3]);
			
			Book book = new Book(no, title, author, isRent);
			
			return book;
		
		} catch (Exception e) {
			
			System.out.println(str + "파싱중 오류가 발생 하였습니다.");
			
			return null;
		}
	}

	@Override
	public boolean listToFile(List<Book> list) {
		
		System.out.println("listToFile 실행 ===================================");
		
		try(BufferedWriter bw 
					= new BufferedWriter(new FileWriter("bookList.txt"));) {
			
			for(Book book : list) {
				
				bw.write(book.toString() + "\n");
		
			}
			
			bw.flush();
			
			return true;
			
			
		} catch (IOException e) {
			
			System.err.println("리스트를 파일로 출력하는 도중 오류가 발생했습니다.");
			System.err.println(e.getMessage());
			
			e.printStackTrace();
		}
		
		
		
		
		System.out.println("listToFile 종료 ==============================");
		return false;
	}

}
