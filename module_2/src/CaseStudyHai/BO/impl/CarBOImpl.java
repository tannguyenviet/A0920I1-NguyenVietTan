package com.company.BO.impl;

import com.company.BO.CarBO;
import com.company.DAO.CarDAO;
import com.company.DAO.impl.CarDaoImpl;
import com.company.entity.Car;

import java.util.List;

public class CarBOImpl implements CarBO {
    private CarDAO carDAO = new CarDaoImpl();

    @Override
    public List<Car> getList() {

        return null;
    }
}
