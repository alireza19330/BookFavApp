package com.developairs.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.developairs.demo.model.Book;

@Repository("BookRepository")
public interface BookRepository extends JpaRepository<Book, Integer>{
	
	public Book findById(Long id);
}
