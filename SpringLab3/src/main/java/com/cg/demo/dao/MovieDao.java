package com.cg.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.demo.bean.Movie;

@Repository
public interface MovieDao extends JpaRepository<Movie,Integer> {
	public List<Movie> findByCategory(String category);
}
