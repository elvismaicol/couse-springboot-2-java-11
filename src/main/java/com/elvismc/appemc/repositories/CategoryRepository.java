package com.elvismc.appemc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elvismc.appemc.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
}
