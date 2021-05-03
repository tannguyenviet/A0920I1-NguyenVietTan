package dao;

import model.Contract;
import model.CusHaveContract;

import java.util.List;

public interface ContractDAO {
    List<Contract> selectAllContract();
    Contract selectContractById(String id);
    void deleteContract(String id);
    void updateContract(Contract contract);
    void insertContract(Contract contract);
    List<CusHaveContract> selectAllCusHaveContract();
}
