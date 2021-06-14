package com.codegym.demo.service;

import com.codegym.demo.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAllProduct();
    Product findProductById(int id);
    void saveProduct(Product blog);
    void deleteProductById(int id);
    void findAllEcommerce();
}
