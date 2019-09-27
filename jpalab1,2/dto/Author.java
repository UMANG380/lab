package com.cg.jpalab2.dto;

import java.util.List;
import javax.persistence.*;
import javax.persistence.ManyToMany;

public class Author {
	
	@Id
	private int authorId;
	@Column(name="author_name")
	private String authorName;
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="author_book", joinColumns=@JoinColumn(name="author_fk"), inverseJoinColumns=@JoinColumn(name="book_fk"))
	private List<Book> bookList;
	
	public Author(int authorId, String authorName) {
		super();
		this.authorId = authorId;
		this.authorName = authorName;
	}

	public Author() {
		super();
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", authorName=" + authorName
				+ ", bookList=" + bookList + "]";
	}

}
