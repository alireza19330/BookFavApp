package com.developairs.demo.service;

import java.util.List;

import com.developairs.demo.model.Book;

public interface BookService {
	public void saveBook(Book book);

	public List<Book> findAllBooks();
	
	public Book getByID(Long id);
}
