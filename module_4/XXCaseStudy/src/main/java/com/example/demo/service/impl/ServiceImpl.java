package com.example.demo.service.impl;

import com.example.demo.model.Service;
import com.example.demo.repository.ServiceRepository;
import com.example.demo.service.ServiceS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
@org.springframework.stereotype.Service
public class ServiceImpl implements ServiceS {
    @Autowired
    ServiceRepository serviceRepository;

    @Override
    public Page<Service> findAllService(Pageable pageable) {
        return serviceRepository.findAll(pageable);
    }

    @Override
    public List<Service> findAllListService() {
        return serviceRepository.findAll();
    }

    @Override
    public Service findServiceById(String id) {
        return serviceRepository.findById(id).orElse(null);
    }

    @Override
    public void saveService(Service service) {
        serviceRepository.save(service);
    }

    @Override
    public void deleteServiceById(String id) {
        serviceRepository.deleteById(id);
    }
}
