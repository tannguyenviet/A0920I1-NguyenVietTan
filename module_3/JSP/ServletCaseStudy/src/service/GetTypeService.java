package service;

import model.*;

import java.util.List;

public interface GetTypeService {
    List<TypeCustomer> findAllTypeCustomer();
    List<TypeDivision> findAllTypeDivision();
    List<TypePosition> findAllTypePosition();
    List<TypeRent> findAllTypeRent();
    List<TypeEducationDegree> findAllTypeEducationDegree();
    List<TypeService> findAllTypeService();
    List<TypeUserName> findAllTypeUserName();
}
