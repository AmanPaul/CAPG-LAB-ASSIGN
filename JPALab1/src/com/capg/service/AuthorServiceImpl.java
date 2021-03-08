package com.capg.service;

import com.capg.dao.AuthorDao;
import com.capg.dao.AuthorDaoImpl;
import com.capg.pojo.Author;

public class AuthorServiceImpl implements AuthorService{
	AuthorDao edao=new AuthorDaoImpl();
	@Override
	public String createAuthor(Author aut) {
		
		return edao.saveAuthor(aut);
	}
	
	@Override
	public String updateAuthor(Author aut) {
		return edao.updateAuthor(aut);
	}

	@Override
	public String removeAuthor(int authorId) {
		return edao.removeAuthor(authorId);
	}

}
