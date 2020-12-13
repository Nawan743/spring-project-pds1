package com.nawan.springprojectPDS1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nawan.springprojectPDS1.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}