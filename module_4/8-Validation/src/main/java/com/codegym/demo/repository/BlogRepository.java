package com.codegym.demo.repository;

import com.codegym.demo.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository  extends JpaRepository<Blog,Integer> {
    Page<Blog> findAll(Pageable pageable);
    Page<Blog> findByAuthorContaining(String auther, Pageable pageable);
    Page<Blog> findBlogsByECommerce(int ecommerce,Pageable pageable);
    @Query(
            value = "SELECT  * FROM blog join ecommerce where blog.e_commerce_id = ecommerce.id and ecommerce.id = :id",
            nativeQuery = true)
    Page<Blog> findAllBlogByEmcommerceId( @Param("id") int id,Pageable pageable);

}
