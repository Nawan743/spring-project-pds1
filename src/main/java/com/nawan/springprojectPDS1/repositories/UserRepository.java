package com.nawan.springprojectPDS1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nawan.springprojectPDS1.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);
}
