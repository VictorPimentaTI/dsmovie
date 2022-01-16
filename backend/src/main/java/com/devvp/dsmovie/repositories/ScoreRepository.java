package com.devvp.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devvp.dsmovie.entities.Score;
import com.devvp.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
