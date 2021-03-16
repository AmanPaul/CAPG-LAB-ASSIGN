package com.cg.demo.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {
	@Id
	private int movieId;
	private String movieName;
	private String category;
	public Movie() {
		
	}
	public Movie(int movieId, String movieName, String category) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.category = category;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
}
