package com.movie.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movie.entities.Movie;

public interface MovieRepo extends JpaRepository<Movie, Integer> {

}
