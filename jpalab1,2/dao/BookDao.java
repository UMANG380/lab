package com.cg.jpalab2.dao;

import java.util.List;

import com.cg.jpalab2.dto.Book;

public interface BookDao {
	
	public Book addBook(Book book);
	public Book findBook(int bookIsbn);
	public boolean removeBook(int bookIsbn);
	public List<Book> listOfBook();
	public List<Book> findBookBetweenPrice(double min, double max);
	public List<Book> findBookWrittenByAuthor(String authorName);

}
