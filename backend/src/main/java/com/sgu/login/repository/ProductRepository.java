package com.sgu.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgu.login.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {}