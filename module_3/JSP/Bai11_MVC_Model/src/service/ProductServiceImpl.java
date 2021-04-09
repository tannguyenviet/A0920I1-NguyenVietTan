package service;

import model.Product;
import service.ProductService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    static HashMap<String,Product> productHashMap;

    public ProductServiceImpl() {
        if (productHashMap!=null){
            return;
        }
        productHashMap = new HashMap<>();
        productHashMap.put("1",new Product("1","Pencil",3000,"Black","CenterMark"));
        productHashMap.put("2",new Product("2","Book",14000,"Black","Apple"));
        productHashMap.put("3",new Product("3","Perfume",190000,"White","AjNamoto"));
        productHashMap.put("4",new Product("4","Potato",35000,"Green","CenterMark"));
    }

    @Override
    public Product getProductById(String id) {
       return  productHashMap.get(id);
    }

    @Override
    public List<Product> getAllProduct() {
        return  new ArrayList<>(productHashMap.values());
    }

    @Override
    public void createNewProduct(Product product) {
        productHashMap.putIfAbsent(product.getId(), product);
    }

    @Override
    public void deleteProduct(String id) {
        if(productHashMap.get(id)!=null){
            productHashMap.remove(id);
        }
    }

    @Override
    public void updateProduct(Product product) {
        if(productHashMap.get(product.getId())!=null){
            productHashMap.put(product.getId(),product);
        }
    }

    @Override
    public List<Product> searchProduct(String key) {
        List<Product> productList = getAllProduct();
        List<Product> searchListProduct = new ArrayList<>();
        for(Product product:productList){
            if (product.getName().toLowerCase().contains(key.toLowerCase())){
                searchListProduct.add(product);
            }
        }
        return searchListProduct;
    }

    @Override
    public List<Product> sortOption(int id) {
        if(id==1){
            List<Product> listProduct = getAllProduct();
            listProduct.sort(new SortByName());
            return listProduct;
        }
        else{
            List<Product> listProduct = getAllProduct();
            listProduct.sort(new SortByPrice());
            return listProduct;
        }

    }
}
