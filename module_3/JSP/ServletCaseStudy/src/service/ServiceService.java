package service;

import model.Service;

import java.util.List;

public interface ServiceService {

    Service findServiceById(String id);
    List<Service> findAll();
    void CreateNewService(Service service);
    void DeleteService(String id);
    void UpdateService(Service service);
}
