package com.codegym.controller;

import com.codegym.service.BlogService;
import com.codegym.service.impl.BlogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {
    @Autowired
    private BlogService blogService;

    @GetMapping(value = "/blog")
    public String viewBlog(Model model){
        model.addAttribute("blogs",blogService.findAllBlog());
        return "/blog/list";
    }
}
