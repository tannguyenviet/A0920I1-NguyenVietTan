package com.codegym.demo.service;

import com.codegym.demo.model.ECommerce;

import java.util.List;

public interface ECommerceService {
    List<ECommerce> findAllECommerce();
    ECommerce findECommerceById(int id);
    void saveECommerce(ECommerce blog);
    void deleteECommerceById(int id);
    void findAllEcommerce();

//    Page<ECommerce> findAllBLog(Pageable pageable);
//    Page<ECommerce> findByAuthorContaining(String auther, Pageable pageable);
}
