package com.at1.produto.Domain.Repository;

import com.at1.produto.Domain.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> { }
