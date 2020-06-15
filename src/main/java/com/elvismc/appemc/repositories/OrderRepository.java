package com.elvismc.appemc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elvismc.appemc.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
}
