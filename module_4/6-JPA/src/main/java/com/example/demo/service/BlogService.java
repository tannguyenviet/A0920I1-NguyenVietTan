package com.example.demo.service;


import com.example.demo.model.Blog;

import java.util.List;

public interface BlogService {
    List<Blog> findAllBlog();
    Blog findBlogById(int id);
    void saveBlog(Blog blog);
    void deleteBlogById(int id);
}
