package com.developairs.demo;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.developairs.demo.model.Book;
import com.developairs.demo.model.Role;
import com.developairs.demo.service.BookService;
import com.developairs.demo.service.RoleService;
import com.developairs.demo.service.UserService;

@Component
public class DemoAppSandbox {


	@Autowired
	private BookService bookService;

	@Autowired
	private UserService userService;

    private static Logger logger = LoggerFactory.getLogger(DemoAppSandbox.class);
    
	@PostConstruct
	public void init(){
		addRole();
		addBooks();
		retriveBooks();
	}

	@Autowired
	private RoleService roleService;

	private void addRole() {
		Role adminRole = new Role();
		adminRole.setRole("ADMIN");
		roleService.saveRole(adminRole);
	}

	private void retriveBooks() {
		logger.debug("The number of books in db:"+bookService.findAllBooks().size());
	}

	private void addBooks() {

		int numOfBooks = 100;
		logger.debug("Adding" + numOfBooks + " Books started...");
		try{
			for (int i = 0; i < numOfBooks; i++) {
				Book book = new Book();
				book.setAuthor("author"+i);
				book.setName("title"+i);
				book.setIsbn((123456780+i));
				bookService.saveBook(book);
			}
		}catch(Exception e){
			logger.error("Unable to insert books: "+e.getMessage());
			return;
		}
		logger.debug(numOfBooks + " books added.");
		//System.out.println(numOfBooks + "Books added.");
	}

}
