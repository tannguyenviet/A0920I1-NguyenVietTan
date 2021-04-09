package service;

import model.Product;

import java.util.Comparator;

public class SortByName implements Comparator<Product> {
    @Override
    public int compare(Product product, Product t1) {
        return (product.getName().compareTo(t1.getName()));
    }
}
