package com.example.demo.service;

import com.example.demo.model.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ServiceS {
    Page<Service> findAllService(Pageable pageable);
    List<Service> findAllListService();
    Service findServiceById(String id);
    void saveService(Service service);
    void deleteServiceById(String id);
}
