package dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import vo.Book;

public class FileDao implements Dao {

	// Dao 의 구현체

	// 파일로 부터 데이터를 읽어서 리스트로 반환한다.
	@Override
	public List<Book> getList() {

		

		// 리스트 선언
		List<Book> list = new ArrayList<>();

		
		// buffer << 보조스트림 은 단독으로 사용 불가 매개값으로 기반스트림을 매개값으로주어야함.
		// 리소스를 자동으로 close 해줍니다. / ex) fr.close();1
		try (FileReader fr = new FileReader("bookList.txt");
							BufferedReader br = new BufferedReader(fr)) {

			String str = " ";
			
			while ((str = br.readLine()) != null) {

		
			Book book = makeBook(str);
			
			if(book != null) {
				 
				list.add(book);

			} 
			

			}

		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
			// e.printStackTrace();
		} catch (IOException e1) {
			System.err.println(e1.getMessage());
			// e1.printStackTrace();
		}
		
		
		
		return list;
	}
	
	/**
	 * 
	 * 
	 * 문자열을 파싱하여 Book객체를 생성한다.
	 * @param str
	 * @return
	 */
	public Book makeBook(String str) {
		
		
		// Book 을 생성하기 위해 알맞은 타입으로 저장
		// 책을 생성
		// 오류가 발생할 경우  null 을 반환
		// 책을 반환
		
		
		try {
			
			// 공백을 기준으로 배열로 저정
			String[] strArray = str.split(" ");

			// 강제형변환 시 오류가 발생 할 수 있다.
			// 파일이 올바르지 않은 형태로 저장되어 있을 경우에 오류가 발생
			// 프로그럄에서 오류가 발생 했을때,
			// 프로그램이 비정상적으로 종료되는 것을 막기 위해서 예외처리
			
			// 문자열을 int 타입으로 변환
			int no = Integer.parseInt(strArray[0]);
			String title = strArray[1];
			String author = strArray[2];
			
			// 문자열을 boolean 타입으로 변환
			boolean isRnet = Boolean.parseBoolean(strArray[3]);

			Book book = new Book(no, title, author, isRnet);
			
			return book;
			
			// book 을 생성하기 위해 알맞은 타입으로 저장
			// 책을 생성
			// 오류가 발생 할 경우 null 을 반환
			// 책을 반환
			
		} catch (Exception e) {

			// 문자열 파싱중 오류가 발생 했을 경우 메세지 처리.
			System.err.println(str + " : 파싱중 오류가 발생 하였습니다.");

			return null;
		}
		

		
		
		
	}

	
	// 리스트틀 파일로 출력합니다.
	/**
	 * 리스트를 매개변수로 받아 파일로 출력합니다
	 * 정상 적으로 출력되었다면 true, 오류가 발생했다면 false 를 리턴합니다.
	 */
	@Override
	public boolean listToFile(List<Book> list) {

	 System.out.println("listToFile 실행 =====================");
		
		try(FileWriter fw = new FileWriter("bookList.txt");) {
			
			// 리스트에 담긴 책의 정보를 파일로 출력합니다.
			for(Book book : list ) {
				
				fw.write(book.toString() + "\n");
				
			}
			
			
			fw.flush();
			
			return true;
			
		} catch (IOException e) {
			
			System.err.println("리스트를 파일로 출력하는 도중 오류가 발생했습니다.");
			System.err.println(e.getMessage());
			
		}
		
		System.out.println("listToFile 종료 =====================");
		return false;
	}

}
