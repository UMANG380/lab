package com.cg.jpalab2.service;

import java.util.List;

import com.cg.jpalab2.dao.BookDao;
import com.cg.jpalab2.dao.BookDaoImpl;
import com.cg.jpalab2.dto.Book;

public class BookServiceImpl implements BookService {
	
	BookDao bookDao = new BookDaoImpl();

	
	public Book addBook(Book book) {
		return bookDao.addBook(book);
	}

	
	public Book findBook(int bookIsbn) {
		return bookDao.findBook(bookIsbn);
	}

	
	public boolean removeBook(int bookIsbn) {
		return bookDao.removeBook(bookIsbn);
	}

	
	public List<Book> listOfBook() {
		return bookDao.listOfBook();
	}

	
	public List<Book> findBookBetweenPrice(double min, double max) {
		return bookDao.findBookBetweenPrice(min, max);
	}

	
	public List<Book> findBookWrittenByAuthor(String authorName) {
		return bookDao.findBookWrittenByAuthor(authorName);
	}

	

}
