package com.devvp.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devvp.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
