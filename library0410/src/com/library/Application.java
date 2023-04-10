package com.library;

import com.library.controller.LibraryController;

public class Application {

	
	public static void main(String[] args) {
		
		// LibraryController 를 실행한다.
		
		LibraryController controller = new LibraryController();
		
		controller.start();
		
		
	}
}
