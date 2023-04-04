package com.library.dao;

import java.util.List;

import com.library.vo.Book;

public class DbDao implements Dao {

	@Override
	public List<Book> getlist() {

		
		return null;
	}

	@Override
	public boolean fileSave(List<Book> list) {
		return false;
	}

}
