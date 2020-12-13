package com.nawan.springprojectPDS1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nawan.springprojectPDS1.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
