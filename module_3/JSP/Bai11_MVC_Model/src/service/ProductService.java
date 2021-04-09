package service;

import model.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(String id);
    List<Product> getAllProduct();
    void createNewProduct(Product product);
    void deleteProduct(String id);
    void updateProduct(Product product);
    List<Product> searchProduct(String key);
    List<Product> sortOption(int id);
}
