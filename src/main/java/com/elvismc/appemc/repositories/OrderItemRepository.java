package com.elvismc.appemc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elvismc.appemc.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
}
