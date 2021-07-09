package com.example.demo.service;

import com.example.demo.model.ServiceType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ServiceTypeService {
    Page<ServiceType> findAllServiceType(Pageable pageable);
    List<ServiceType> findAllListServiceType();
    ServiceType findServiceTypeById(String id);
    void saveServiceType(ServiceType serviceType);
    void deleteServiceTypeById(String id);
}
