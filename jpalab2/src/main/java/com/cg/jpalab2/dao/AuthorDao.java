package com.cg.jpalab2.dao;

import com.cg.jpalab2.dto.Author;

public interface AuthorDao {
	
	public Author addAuthor(Author author);
	public Author findAuthor(int authorId);
	public boolean removeAuthor(int authorId);

}
