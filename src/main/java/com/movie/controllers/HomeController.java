package com.movie.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.entities.AllMoviesView;
import com.movie.entities.Movie;
import com.movie.entities.RentedMoviesView;
import com.movie.repo.AllMoviesViewRepo;
import com.movie.repo.MovieRepo;
import com.movie.repo.RentedMoviesViewRepo;


@RestController
public class HomeController {
		
	@Autowired
	private RentedMoviesViewRepo innerJoinViewRepo;
	@Autowired
	private AllMoviesViewRepo leftJoinViewRepo;
	@Autowired
	private MovieRepo movieRepo;
	
	
	//inner join
	@GetMapping("rented_movies")
	public List<RentedMoviesView> getRentedMoviesViewRecords() {
	
		List<RentedMoviesView> rentedMovies = innerJoinViewRepo.findAll();
		
		printToConsole(rentedMovies, "RentedMoviesView");
						
		return rentedMovies;
	}

	//left join
	@GetMapping("all_movies")
	public List<AllMoviesView> getAllMoviesViewRecords() {
	
		List<AllMoviesView> allMovies = leftJoinViewRepo.findAll();
		
		printToConsole(allMovies, "AllMoviesView");
								
		return allMovies;
	}	
	
	@PostMapping("add_movie")
	public String addMovie(Movie movie) {
		
		if(movie.getTitle() != null) {
			movieRepo.save(movie);
			
			return "Movie added successfully";
		}
		
		return "Please enter valid values for movie title & category"; 
	}
	
	@PutMapping("update_movie_cat")
	public String updateMovieCategory(Integer id, String category) {
		
		try {
			Movie movie = movieRepo.findById(id).get();
			
			movie.setCategory(category);
			movieRepo.save(movie);
			
			return "Movie's category has been updated successfully";
		} catch (Exception e) {
			return "Please enter valid values for movie id & category";
		}	
	}	
	
	private <T> void printToConsole(List<T> list, String listParamType) {
		
		System.out.println("\nPrinting the list using LAMBDA Expression: ");
		System.out.println("---------------------------------------");
		list.forEach(listItem -> System.out.println(listItem)); // lambda expression
		
		System.out.println("\nPrinting list of movies starting with a letter 'A' ");
		System.out.println("---------------------------------------");
		if(listParamType == "RentedMoviesView")
			list.stream().filter(s -> (((RentedMoviesView)s).getRentedmoviename()).
											startsWith("A")).forEach(System.out::println);
		else
			list.stream().filter(s -> (((AllMoviesView)s).getRentedmoviename()).
											startsWith("A")).forEach(System.out::println);
	}
}
