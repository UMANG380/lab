package com.cg.jpalab2.service;

import com.cg.jpalab2.dao.AuthorDao;
import com.cg.jpalab2.dao.AuthorDaoImpl;
import com.cg.jpalab2.dto.Author;

public class AuthorServiceImpl implements AuthorService{
	
	AuthorDao authorDao = new AuthorDaoImpl();
	
	public Author addAuthor(Author author) {
		return authorDao.addAuthor(author);
	}

	public Author findAuthor(int authorId) {
		return authorDao.findAuthor(authorId);
	}

	public boolean removeAuthor(int authorId) {
		return authorDao.removeAuthor(authorId);
	}

}
