package com.codegym.demo.model;

import org.springframework.context.annotation.Bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Cart {
    private static Map<Product,Integer> cart = new HashMap<>();

    public Map<Product, Integer> getCart() {
        return cart;
    }

    public void setCart(Map<Product, Integer> cart) {
        this.cart = cart;
    }

    public void addNewCart(Product product){
        System.out.println(cart.containsKey(product));
        if(cart.containsKey(product)){
            cart.replace(product,cart.get(product)+1);
        }
        else{
            cart.put(product,1);
        }
//        List<Product> listProduct = new ArrayList(cart.keySet());
//        for(Product pro : listProduct){
//            if(pro.getId()==product.getId()){
//                cart.replace(product,cart.get(product)+1);
//                return ;
//            }
//        }
//        cart.put(product,1);
    }
    public void removeCart(Product product){
        if(cart.containsKey(product)){
            cart.remove(product);
        }
        else{

        }
    }

}
