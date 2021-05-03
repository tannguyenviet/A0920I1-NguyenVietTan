package service;

import model.Contract;

import java.util.List;

public interface ContractService {
    Contract findContractById(String id);
    List<Contract> findAll();
    void CreateNewContract(Contract contract);
    void DeleteContract(String id);
    void UpdateContract(Contract contract);

}
