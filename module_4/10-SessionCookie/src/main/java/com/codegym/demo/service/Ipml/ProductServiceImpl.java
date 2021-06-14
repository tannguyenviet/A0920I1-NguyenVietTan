package com.codegym.demo.service.Ipml;

import com.codegym.demo.model.Product;
import com.codegym.demo.repository.ProductRepository;
import com.codegym.demo.service.ProductService;
import io.netty.util.internal.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Base64;
import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public List<Product> findAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product findProductById(int id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public void saveProduct(Product blog) {
        productRepository.save(blog);
    }

    @Override
    public void deleteProductById(int id) {
        productRepository.deleteById(id);
    }

    @Override
    public void findAllEcommerce() {

    }
    public void saveProductToDB(MultipartFile file,String name,String description,int price){
        String filename = StringUtils.cleanPath(file.getOriginalFilename());
        if(filename.contains("..")){
            System.out.println("not a valid file");
        }

        Product p = new Product();
        p.setDescription(description);
        try {
            p.setImage(Base64.getEncoder().encodeToString(file.getBytes()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        p.setName(name);
        p.setPrice(price);
        System.out.println("Image: " +p.getImage().length() );
        productRepository.save(p);
    }
}
