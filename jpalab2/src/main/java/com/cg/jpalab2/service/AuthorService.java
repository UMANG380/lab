package com.cg.jpalab2.service;

import com.cg.jpalab2.dto.Author;

public interface AuthorService {
	

	public Author addAuthor(Author author);
	public Author findAuthor(int authorId);
	public boolean removeAuthor(int authorId);
	

}
