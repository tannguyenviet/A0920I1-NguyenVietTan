package com.codegym.service;


import com.codegym.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BlogService {
    List<Blog> findAllBlog();
    Blog findBlogById(int id);
    void saveBlog(Blog blog);
    void deleteBlogById(int id);
    Page<Blog> findAllBLog(Pageable pageable);
    Page<Blog> findByAuthorContaining(String auther, Pageable pageable);
    Page<Blog> findBlogByEcommerceId(int id, Pageable pageable);

//    @Query(value = "SELECT * FROM Users u WHERE u.status = :status and u.name = :name",
//            nativeQuery = true)
//    User findUserByStatusAndNameNamedParamsNative(
//            @Param("status") Integer status, @Param("name") String name);
}
