package com.cg.jpalab2.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cg.jpalab2.dto.Author;
import com.cg.jpalab2.dto.Book;
import com.cg.jpalab2.service.AuthorService;
import com.cg.jpalab2.service.AuthorServiceImpl;
import com.cg.jpalab2.service.BookService;
import com.cg.jpalab2.service.BookServiceImpl;

public class MyApplication {
	
	public static void main(String[] args) {
	
	AuthorService authorService = new AuthorServiceImpl();
	Scanner sc = new Scanner(System.in);
	
	
	
	Author author1 = new Author(1, "Paulo");
	Author author2 = new Author(2, "RR Martin");
	
	Book book1 = new Book(4, "The Alchemist", 1000);
	Book book2 = new Book(5, "ASOIAF", 2000);
	Book book3 = new Book(6, "JAVA", 2000);
	
	List<Book> bookList = new ArrayList<Book>();
	bookList.add(book1);
	bookList.add(book2);
	bookList.add(book3);

	author1.setBookList(bookList);
	
	
	
	BookService bookService = new BookServiceImpl();
	
	List<Book> listOfBook = bookService.listOfBook();
	
	for(Book b:listOfBook) {
		System.out.println(b.getBookIsbn()+" "+b.getBookPrice()+" "+b.getBookTitle());
	}
	

	listOfBook = bookService.findBookBetweenPrice(500d,1500.0d);
	
	for(Book b:listOfBook) {
		System.out.println(b.getBookIsbn()+" "+b.getBookPrice()+" "+b.getBookTitle());
	}
	
	listOfBook = bookService.findBookWrittenByAuthor("Paulo");
	
	for(Book b:listOfBook) {
		System.out.println(b.getBookIsbn()+" "+b.getBookPrice()+" "+b.getBookTitle());
	}

}
}