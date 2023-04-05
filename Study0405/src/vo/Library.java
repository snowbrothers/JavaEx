package vo;

import java.util.List;

import com.library.dao.Dao;
import com.library.dao.FileDao;

public class Library {

	
	private List<Book> list;
	
	
	
	private Dao dao = new FileDao();
	
	
	
	public Library() {
		
		list = dao.getList();
		
	}

	public boolean insert(int no, String title, String author, boolean isRent) {
		
		
		Book book = new Book(no, title, author, isRent);
		
		list.add(book);
		
		boolean res = dao.fileSave(list);
		
		if(res) {
			
			// 파일에 성공적으로 저장되면 리스트 추가!
			return true;
		} else {
			
			list.remove(book);
			return false;
		}
		
	
			
			
		
		
	
	
	}
	
	
	@Override
	public String toString() {
		String listStr = " ";
		
		for(Book book : list) {
			
			listStr += book.toString() + "\n";
		}
		
		return listStr;
	}

}
