package com.codegym.CustomerService;

import com.codegym.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class ProductServiceImpl implements ProductService {
    static Map<Integer,Product> products = new HashMap<>();
    static {
        products.put(1,(new Product("1","Iphone X","Iphone")));
        products.put(2,(new Product("2","Iphone 8","Iphone")));
        products.put(3,(new Product("3","Iphone 7","Iphone")));
        products.put(4,(new Product("4","Iphone 6","Iphone")));
    }
    @Override
    public List<Product> findALl() {
        return new ArrayList<>(products.values());
    }

    @Override
    public Product findProductById(int id) {
        return products.get(id);
    }

    @Override
    public void saveProduct(Product product) {
       products.put(Integer.parseInt(product.getId()),product);
    }

    @Override
    public void deleteProduct(int id) {
        products.remove(id);
    }

    @Override
    public void updateProduct(Product product) {
        products.replace(Integer.parseInt(product.getId()),product);
    }
}
