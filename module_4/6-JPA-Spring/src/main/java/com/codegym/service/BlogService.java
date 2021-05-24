package com.codegym.service;

import com.codegym.model.Blog;

import java.util.List;

public interface BlogService {
    List<Blog> findAllBlog();
    Blog findBlogById(int id);
    void saveBlog(Blog blog);
    void deleteBlogById(int id);
}
