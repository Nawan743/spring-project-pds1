package com.nawan.springprojectPDS1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nawan.springprojectPDS1.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
