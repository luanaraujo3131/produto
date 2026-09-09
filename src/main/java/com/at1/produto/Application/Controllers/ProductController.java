package com.at1.produto.Application.Controllers;

import com.at1.produto.Domain.Model.Product;
import com.at1.produto.Domain.Repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.hibernate.sql.Delete;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("api/products")
public class ProductController {
    private ProductRepository repository;

    @GetMapping
    public ResponseEntity<List<Product>> getAllProduct(){
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping
    public void create(@RequestBody Product product){
        repository.save(product);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id){
        repository.deleteById(id);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable UUID id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}
