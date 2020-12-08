package com.example.restbasedspringboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restbasedspringboot.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
