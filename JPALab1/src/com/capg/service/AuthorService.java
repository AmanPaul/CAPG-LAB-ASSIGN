package com.capg.service;



import com.capg.pojo.Author;

public interface AuthorService {
	public String createAuthor(Author aut);
	public String updateAuthor(Author aut);
	public String removeAuthor(int authorId);
}
