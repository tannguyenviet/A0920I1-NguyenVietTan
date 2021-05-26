package com.codegym.service.impl;


import com.codegym.model.Blog;
import com.codegym.repository.BlogRepository;
import com.codegym.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl  implements BlogService {
    @Autowired
    BlogRepository blogRepository;

    @Override
    public Page<Blog> findAllBLog(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }
    @Override
    public List<Blog> findAllBlog() {
        return blogRepository.findAll();
    }

    @Override
    public Blog findBlogById(int id) {
        return blogRepository.findById(id).orElse(null);
    }

    @Override
    public void saveBlog(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void deleteBlogById(int id) {
        blogRepository.deleteById(id);
    }

    @Override
    public Page<Blog> findByAuthorContaining(String auther, Pageable pageable) {
        return blogRepository.findByAuthorContaining(auther, pageable);
    }

    @Override
    public Page<Blog> findBlogByEcommerceId(int idEcommerce, Pageable pageable) {
        return blogRepository.findAllBlogByEmcommerceId(idEcommerce,pageable);
    }


}
