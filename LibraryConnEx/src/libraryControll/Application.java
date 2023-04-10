package libraryControll;

import service.BookService;

public class Application {

	public static void main(String[] args) {
		
		BookService bookService = new BookService();
		//bookService.getList();
		  
		LibraryController lib = new LibraryController();
		lib.start();
		

			
	}
}
