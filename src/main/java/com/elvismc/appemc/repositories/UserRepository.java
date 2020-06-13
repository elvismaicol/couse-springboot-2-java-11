package com.elvismc.appemc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elvismc.appemc.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
}
