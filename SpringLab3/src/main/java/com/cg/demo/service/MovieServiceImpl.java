package com.cg.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.demo.bean.Movie;
import com.cg.demo.dao.MovieDao;
@Service
public class MovieServiceImpl implements MovieService{
	@Autowired
	MovieDao mDao;
	@Override
	public List<Movie> printAllMovie() {
		// TODO Auto-generated method stub
		return mDao.findAll();
	}

	@Override
	public List<Movie> createMovie(Movie mv) {
		mDao.saveAndFlush(mv);
		return mDao.findAll();
	}

	@Override
	public List<Movie> removeMovie(int movieId) {
		mDao.deleteById(movieId);
		return mDao.findAll();
	}

	@Override
	public List<Movie> updateMovie(Movie mv) {
		mDao.saveAndFlush(mv);
		return mDao.findAll();
	}

	@Override
	public List<Movie> findMovieByCategory(String category) {
		return mDao.findByCategory(category);
	}

}
