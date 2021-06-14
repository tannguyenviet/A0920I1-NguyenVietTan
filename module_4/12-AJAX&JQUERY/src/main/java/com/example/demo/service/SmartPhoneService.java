package com.example.demo.service;

import com.example.demo.model.Smartphone;

public interface SmartPhoneService {
    Iterable<Smartphone> findAll();
    Smartphone findById(int id);
    Smartphone save(Smartphone phone);
    Smartphone remove(int id);
}
