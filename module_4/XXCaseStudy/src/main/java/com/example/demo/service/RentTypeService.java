package com.example.demo.service;

import com.example.demo.model.RentType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface RentTypeService {
    Page<RentType> findAllRentType(Pageable pageable);
    List<RentType> findAllListRentType();
    RentType findRentTypeById(String id);
    void saveRentType(RentType rentType);
    void deleteRentTypeById(String id);
}
