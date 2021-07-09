package com.example.demo.service.impl;

import com.example.demo.model.ServiceType;
import com.example.demo.repository.ServiceTypeRepository;
import com.example.demo.service.ServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceTypeImpl implements ServiceTypeService {
    @Autowired
    ServiceTypeRepository serviceTypeRepository;

    @Override
    public Page<ServiceType> findAllServiceType(Pageable pageable) {
        return serviceTypeRepository.findAll(pageable);
    }

    @Override
    public List<ServiceType> findAllListServiceType() {
        return serviceTypeRepository.findAll();
    }

    @Override
    public ServiceType findServiceTypeById(String id) {
        return serviceTypeRepository.findById(id).orElse(null);
    }

    @Override
    public void saveServiceType(ServiceType serviceType) {
        serviceTypeRepository.save(serviceType);
    }

    @Override
    public void deleteServiceTypeById(String id) {
        serviceTypeRepository.deleteById(id);
    }
}
