package com.capg.dao;

import java.util.List;

import com.capg.pojo.Author;

public interface AuthorDao {
	public String saveAuthor(Author aut);
	public String updateAuthor(Author aut);
	public String removeAuthor(int authorId);
}

