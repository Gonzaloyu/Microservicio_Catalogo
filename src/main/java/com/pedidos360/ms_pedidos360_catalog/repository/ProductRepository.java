package com.pedidos360.ms_pedidos360_catalog.repository;

import com.pedidos360.ms_pedidos360_catalog.modelo.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}