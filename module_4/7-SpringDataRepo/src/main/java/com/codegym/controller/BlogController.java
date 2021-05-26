package com.codegym.controller;

import com.codegym.model.Blog;
import com.codegym.repository.BlogRepository;
import com.codegym.repository.ECommerceRepository;
import com.codegym.service.ECommerceService;
import com.codegym.service.impl.BlogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class BlogController {
    @Autowired
    private BlogServiceImpl blogService;
    @Autowired
    private ECommerceService eCommerceService;


    @GetMapping(value = "/blog")
    public String viewBlog(Model model, Optional<String> key_search, Optional<Integer> ecomId, @PageableDefault(value = 5) Pageable pageable){
        model.addAttribute("ecommerces",eCommerceService.findAllECommerce());
        if(!key_search.isPresent()){
            if(ecomId.isPresent()){
                Page<Blog> blogs = blogService.findBlogByEcommerceId(ecomId.get(),pageable);
                model.addAttribute("blogs",blogs);
                model.addAttribute("ecomId",ecomId.get());
                System.out.println("Nhay vao Ecom" +ecomId);
                return "/blog/list";
            }

            System.out.println("Nhay vao trang ");
            model.addAttribute("blogs",blogService.findAllBLog(pageable));

            return "/blog/list";

        }else {
            System.out.println("Nhay vao key search");
            model.addAttribute("key_search", key_search.get());
            model.addAttribute("blogs",blogService.findByAuthorContaining(key_search.get(),pageable));
            return "/blog/list";
        }


    }

    @GetMapping(value="/blog/create")
    public String viewCreate(Model model){
        model.addAttribute("blog",new Blog());
        return "/blog/create";
    }
    @PostMapping(value = "/blog/save")
    public  String saveBlog(Blog blog){
        blogService.saveBlog(blog);
        return "redirect:/blog";
    }
    @GetMapping(value = "/blog/edit/{id}")
    public String viewEdit(@PathVariable int id,Model model){
        model.addAttribute("blog",blogService.findBlogById(id));
        return "/blog/edit";

    }
    @PostMapping(value = "/blog/edit")
    public String saveEdit(Blog blog){
        blogService.saveBlog(blog);
        return "redirect:/blog";
    }
    @GetMapping(value = "/blog/delete/{id}")
    public String saveDelete(@PathVariable int id){
        blogService.deleteBlogById(id);
        return "redirect:/blog";
    }
    @GetMapping(value = "/blog/detail/{id}")
    public String showDetailBlog(Model model,@PathVariable int id){
        model.addAttribute("blog",blogService.findBlogById(id));
        return "/blog/detail";
    }
//    @GetMapping (value = "/blog/eco")
//    public String listBlogFromEcom(Model model, @PageableDefault(value = 5) Pageable pageable){
//
//        model.addAttribute("ecommerces",eCommerceService.findAllECommerce());
//        return "/blog/list";
//    }
}
