package service;

import dao.ServiceDAO;
import dao.ServiceDAOImpl;
import model.Service;

import java.util.List;

public class ServiceServiceImpl  implements ServiceService{
    private ServiceDAO serviceDAO = new ServiceDAOImpl();
    @Override
    public Service findServiceById(String id) {
        return serviceDAO.selectServiceById(id);
    }

    @Override
    public List<Service> findAll() {
        return serviceDAO.selectAllService();
    }

    @Override
    public void CreateNewService(Service service) {
        serviceDAO.insertService(service);
    }

    @Override
    public void DeleteService(String id) {
        serviceDAO.deleteService(id);
    }

    @Override
    public void UpdateService(Service service) {
        serviceDAO.updateService(service);
    }
}
