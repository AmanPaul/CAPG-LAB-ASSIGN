package com.cg.demo.service;

import java.util.List;

import com.cg.demo.bean.Movie;

public interface MovieService {
	public List<Movie> printAllMovie();
	public List<Movie> createMovie(Movie mv);
	public List<Movie> removeMovie(int movieId);
	public List<Movie> updateMovie(Movie mv) ;
	public List<Movie> findMovieByCategory(String category);

}
