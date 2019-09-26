package com.cg.jpalab2.dao;

import javax.persistence.*;

import com.cg.jpalab2.dto.Author;

public class AuthorDaoImpl implements AuthorDao{
	
	EntityManagerFactory entityFactory = Persistence.createEntityManagerFactory("jpalab2");

	public Author addAuthor(Author author) {
		EntityManager em = entityFactory.createEntityManager();
		EntityTransaction tran = em.getTransaction();
		tran.begin();
		if(author==null)
			em.persist(author);
		else
			em.merge(author);
		tran.commit();
		return author;
	}

	public Author findAuthor(int authorId) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean removeAuthor(int authorId) {
		// TODO Auto-generated method stub
		return false;
	}


}
