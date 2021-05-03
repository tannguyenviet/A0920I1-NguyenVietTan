package dao;

import model.*;

import java.util.List;

public interface GetTypeServiceDAO {

    List<TypeCustomer> selectAllTypeCustomer();
    List<TypeRent> selectAllTypeRent();
    List<TypePosition> selectAllTypePosition();
    List<TypeEducationDegree> selectAllTypeEducationDegree();
    List<TypeDivision> selectAllTypeDivision();
    List<TypeService> selectAllTypeService();
    List<TypeUserName> selectALlTypeUserName();

}
