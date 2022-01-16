package com.devvp.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devvp.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}
