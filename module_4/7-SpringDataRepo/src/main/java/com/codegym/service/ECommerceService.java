package com.codegym.service;

import com.codegym.model.ECommerce;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

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
