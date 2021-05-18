package com.codegym.CustomerService;

import com.codegym.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findALl();
    Product findProductById(int id);
    void saveProduct(Product product);
    void deleteProduct(int id);
    void updateProduct(Product product);

}
