package com.capg.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.capg.config.JPAConfig;
import com.capg.pojo.Author;


public class AuthorDaoImpl implements AuthorDao{
	EntityManager eManager=JPAConfig.getEntityManager();
	@Override
	public String saveAuthor(Author aut) {
		EntityTransaction tx=eManager.getTransaction();
		tx.begin();
		eManager.persist(aut);
		tx.commit();
		return "Author Created.... Your ID is "+aut.getAuthorId();
	}

	@Override
	public String updateAuthor(Author aut) {
		Author e=eManager.find(Author.class, aut.getAuthorId());
		if(e!=null) {
			EntityTransaction tx=eManager.getTransaction();
			tx.begin();
			e.setFirstName(aut.getFirstName());
			eManager.merge(e);
			tx.commit();
		return "Author name updated...";
		
		}
		else
			return "Invalid Author ID";
	}

	@Override
	public String removeAuthor(int authorId) {
		Author e=eManager.find(Author.class, authorId);
		if(e!=null) {
			EntityTransaction tx=eManager.getTransaction();
			tx.begin();
			eManager.remove(e);
			tx.commit();
		return "Removed Author";
		
		}
		else
			return "Invalid Author ID";
	}

}
