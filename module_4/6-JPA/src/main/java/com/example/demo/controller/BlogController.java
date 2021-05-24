package com.example.demo.controller;

import com.example.demo.model.Blog;
import com.example.demo.repository.BlogRepository;
import com.example.demo.service.impl.BlogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;

import java.awt.print.Pageable;

@Controller
public class BlogController {
    @Autowired
    private BlogServiceImpl blogService;
    @Autowired
    private BlogRepository blogRepository;
    @GetMapping(value = "/blog")
    public String viewBlog(Model model){
        model.addAttribute("blogs",blogService.findAllBlog());
        return "/blog/list";
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
}
