package com.codegym.demo.controller;

import com.codegym.demo.model.Cart;
import com.codegym.demo.model.Product;
import com.codegym.demo.service.Ipml.ProductServiceImpl;
import com.sun.org.apache.xpath.internal.operations.Mult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Controller
@SessionAttributes("mycart")
public class ProductController {
    @Autowired
    private ProductServiceImpl productService;
    @ModelAttribute("mycart")
    public Cart setUpCart(){
        return new Cart();
    }
    private  static Cart cart = new Cart();
    @GetMapping(value = "/product")
    public String listProduct(Model model){
        model.addAttribute("products",productService.findAllProduct());
        return "/product/list";
    }
    @GetMapping(value = "/product/detail/{id}")
    public String viewProduct(Model model, @PathVariable int id){
        model.addAttribute("product",productService.findProductById(id));
        return "/product/detail";
    }
    @GetMapping(value = "/cart")
    public String viewCart(@ModelAttribute ("mycart") Cart cart, Model model){
        model.addAttribute("carts",cart);
        return "/cart/list";
    }
    @GetMapping(value="/product/order/{id}")
    public String orderProduct(Model model,@PathVariable int id){
        Product product =  productService.findProductById(id);
        System.out.println(product.getName());
        cart.addNewCart(product);
        return "redirect:/cart";
    }
    @GetMapping(value = "/product/create")
    public String viewCreateForm(Model model){
        model.addAttribute("product",new Product());
        return "/product/create";
    }
    @PostMapping(value = "/product/save")
    public String saveProduct(@RequestParam("file") MultipartFile file,
                              @RequestParam("name") String name,
                              @RequestParam("price")int price,
                              @RequestParam("desc") String desc
    ){
        productService.saveProductToDB(file,name,desc,price);
        return "redirect:/product";
    }

}
