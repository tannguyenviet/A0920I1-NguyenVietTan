package com.codegym.demo.service.impl;

import com.codegym.demo.model.ECommerce;
import com.codegym.demo.repository.ECommerceRepository;
import com.codegym.demo.service.ECommerceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ECommerceServiceImpl implements ECommerceService{
    @Autowired
    private ECommerceRepository eCommerceRepository;
    @Override
    public List<ECommerce> findAllECommerce() {
        return eCommerceRepository.findAll();
    }

    @Override
    public ECommerce findECommerceById(int id) {
        return eCommerceRepository.findById(id).orElse(null);
    }

    @Override
    public void saveECommerce(ECommerce blog) {
         eCommerceRepository.save(blog);
    }

    @Override
    public void deleteECommerceById(int id) {
        eCommerceRepository.deleteById(id);
    }

    @Override
    public void findAllEcommerce() {

    }
}
