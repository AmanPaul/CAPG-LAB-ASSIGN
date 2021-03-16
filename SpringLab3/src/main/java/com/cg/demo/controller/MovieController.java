package com.cg.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.demo.bean.Movie;
import com.cg.demo.service.MovieService;

@RestController
@RequestMapping("/movie")
public class MovieController {
	@Autowired
	MovieService jpaService;
	@GetMapping
	public List<Movie>printAllMovie(){
		return jpaService.printAllMovie();
	}
	@PostMapping
	public List<Movie>saveMovie(@RequestBody Movie mv){
		return jpaService.createMovie(mv);
	}
	@DeleteMapping("/{movieId}")
	public List<Movie>deleteMovie(@PathVariable int movieId){
		return jpaService.removeMovie(movieId);
	}
	@PutMapping
	public List<Movie>updateMovie(@RequestBody Movie mv){
		return jpaService.updateMovie(mv);
	}
	@GetMapping("category/{category}")
		public List<Movie> findMovieByCategory(@PathVariable String category){
		return jpaService.findMovieByCategory(category);
		
	}
}
