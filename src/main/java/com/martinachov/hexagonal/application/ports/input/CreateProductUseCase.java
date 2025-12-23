package com.martinachov.hexagonal.application.ports.input;

import com.martinachov.hexagonal.domain.model.Product;

//all method Repo
public interface CreateProductUseCase {
   
    Product createProduct(Product product);
    
}
