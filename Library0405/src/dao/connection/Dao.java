package dao.connection;

import java.util.List;

import vo.Book;

public interface Dao {

	// 파일로 부터 데이터틀 읽어서 리스트를 반환한다.
	
	//매개변수는 없음
	// 책에대한 정보를 담고 있음
	List<Book> getList();
	
	// 리스트를 읽고 파일로 출력합니다.
	boolean listToFile(List<Book> list);

	int update(int no);

	
	
	
	
}
