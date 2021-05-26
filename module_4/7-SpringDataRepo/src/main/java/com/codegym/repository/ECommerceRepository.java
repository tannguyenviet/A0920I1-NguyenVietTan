package com.codegym.repository;

import com.codegym.model.Blog;
import com.codegym.model.ECommerce;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ECommerceRepository extends JpaRepository<ECommerce,Integer> {
    List<ECommerce> findAllByName(String name);
}
