package com.elvismc.appemc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elvismc.appemc.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
}
