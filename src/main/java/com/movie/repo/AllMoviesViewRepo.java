package com.movie.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movie.entities.AllMoviesView;

public interface AllMoviesViewRepo extends JpaRepository<AllMoviesView, Integer> {
	

}
