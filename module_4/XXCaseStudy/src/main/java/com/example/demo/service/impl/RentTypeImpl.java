package com.example.demo.service.impl;

import com.example.demo.model.RentType;
import com.example.demo.repository.RentTypeRepository;
import com.example.demo.service.RentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RentTypeImpl implements RentTypeService {
    @Autowired
    RentTypeRepository rentTypeRepository;

    @Override
    public Page<RentType> findAllRentType(Pageable pageable) {
        return rentTypeRepository.findAll(pageable);
    }

    @Override
    public List<RentType> findAllListRentType() {
        return rentTypeRepository.findAll();
    }

    @Override
    public RentType findRentTypeById(String id) {
        return rentTypeRepository.findById(id).orElse(null);
    }

    @Override
    public void saveRentType(RentType rentType) {
        rentTypeRepository.save(rentType);
    }

    @Override
    public void deleteRentTypeById(String id) {
        rentTypeRepository.deleteById(id);
    }
}
