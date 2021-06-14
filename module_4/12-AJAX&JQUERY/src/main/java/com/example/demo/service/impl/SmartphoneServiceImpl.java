package com.example.demo.service.impl;

import com.example.demo.model.Smartphone;
import com.example.demo.repository.SmartphoneRepository;
import com.example.demo.service.SmartPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SmartphoneServiceImpl implements SmartPhoneService {
    @Autowired
    private SmartphoneRepository smartphoneRepository;

    @Override
    public Iterable<Smartphone> findAll() {
        return smartphoneRepository.findAll();
    }

    @Override
    public Smartphone findById(int id) {
        Smartphone smartphone = smartphoneRepository.findById(id).orElse(null);

        return smartphone;
    }

    @Override
    public Smartphone save(Smartphone phone) {
        return smartphoneRepository.save(phone);
    }

    @Override
    public Smartphone remove(int id) {
        Smartphone smartphone = findById(id);
        smartphoneRepository.deleteById(id);
        return smartphone;
    }
}
