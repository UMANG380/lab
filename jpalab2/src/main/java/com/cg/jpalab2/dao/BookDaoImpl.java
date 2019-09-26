package com.cg.jpalab2.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cg.jpalab2.dto.Book;

public class BookDaoImpl implements BookDao {
	
	EntityManagerFactory entityFactory = Persistence.createEntityManagerFactory("jpalab2");

	public Book addBook(Book book) {
		EntityManager em = entityFactory.createEntityManager();
		EntityTransaction tran = em.getTransaction();
		tran.begin();
		if(book==null)
			em.persist(book);
		else
			em.merge(book);
		tran.commit();
		return book;
	}

	public Book findBook(int bookIsbn) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean removeBook(int bookIsbn) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Book> listOfBook() {
		EntityManager em = entityFactory.createEntityManager();
		Query query = em.createQuery("From Book");
		List<Book> bookList = query.getResultList();
		return bookList;
	}

	public List<Book> findBookBetweenPrice(double min, double max) {
		EntityManager em = entityFactory.createEntityManager();
		Query query = em.createQuery("From Book where bookPrice between :first AND :second");
		query.setParameter("first", min);
		query.setParameter("second", max);
		List<Book> bookList = query.getResultList();
		return bookList;
	}

	public List<Book> findBookWrittenByAuthor(String authorName) {
		EntityManager em = entityFactory.createEntityManager();
		Query query = em.createQuery("SELECT b from book b where b.authorName: first");
		query.setParameter("first", "Paulo");
		List<Book> bookList = query.getResultList();
		return bookList;
	}

}
