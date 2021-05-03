package service;


import dao.GetTypeServiceDAO;
import dao.GetTypeServiceDAOImpl;
import model.*;

import java.util.List;

public class GetTypeServiceImpl implements GetTypeService {
    private static GetTypeServiceDAO getTypeServiceDAO = new GetTypeServiceDAOImpl();

    @Override
    public List<TypeCustomer> findAllTypeCustomer() {
        return getTypeServiceDAO.selectAllTypeCustomer();
    }

    @Override
    public List<TypeDivision> findAllTypeDivision() {
        return getTypeServiceDAO.selectAllTypeDivision();
    }

    @Override
    public List<TypePosition> findAllTypePosition() {
        return getTypeServiceDAO.selectAllTypePosition();
    }

    @Override
    public List<TypeRent> findAllTypeRent() {
        return  getTypeServiceDAO.selectAllTypeRent();
    }

    @Override
    public List<TypeEducationDegree> findAllTypeEducationDegree() {
        return getTypeServiceDAO.selectAllTypeEducationDegree();
    }

    @Override
    public List<TypeService> findAllTypeService() {
        return getTypeServiceDAO.selectAllTypeService();
    }

    @Override
    public List<TypeUserName> findAllTypeUserName() {
        return getTypeServiceDAO.selectALlTypeUserName();
    }
}
