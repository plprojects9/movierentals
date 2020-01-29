package com.movie.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movie.entities.RentedMoviesView;

public interface RentedMoviesViewRepo extends JpaRepository<RentedMoviesView, Integer> {
	

}
