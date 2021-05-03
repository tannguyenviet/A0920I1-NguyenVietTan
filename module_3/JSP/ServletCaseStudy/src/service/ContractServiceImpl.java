package service;
import dao.ContractDAO;
import dao.ContractDAOImpl;
import model.Contract;
import model.CusHaveContract;

import java.util.List;

public class ContractServiceImpl implements ContractService {
    private  ContractDAO contractDAO = new ContractDAOImpl();
    @Override
    public Contract findContractById(String id) {
        return contractDAO.selectContractById(id);
    }

    @Override
    public List<Contract> findAll() {
        return contractDAO.selectAllContract();
    }

    @Override
    public void CreateNewContract(Contract contract) {
        contractDAO.insertContract(contract);
    }

    @Override
    public void DeleteContract(String id) {
        contractDAO.deleteContract(id);
    }

    @Override
    public void UpdateContract(Contract contract) {
        contractDAO.updateContract(contract);
    }

    public List<CusHaveContract> SelectAllCusHaveContract(){
       return  contractDAO.selectAllCusHaveContract();
    }
}
