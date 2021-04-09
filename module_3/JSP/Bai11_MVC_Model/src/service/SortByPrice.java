package service;

import model.Product;

import java.util.Comparator;

public class SortByPrice implements Comparator<Product> {
    @Override
    public int compare(Product product, Product t1) {
        return product.getPrice()-t1.getPrice();
    }
}
