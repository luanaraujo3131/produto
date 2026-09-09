package com.at1.produto.Domain.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "Product-db")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "product-name", length = 100)
    private String name;
    @Column(name = "product-price", nullable = false)
    private BigDecimal price;
    @Column(name = "product-description", length = 255)
    private String description;
}
