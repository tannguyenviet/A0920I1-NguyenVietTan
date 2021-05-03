package dao;

import model.Service;

import java.util.List;

public interface ServiceDAO {
    List<Service> selectAllService();
    Service selectServiceById(String id);
    void deleteService(String id);
    void updateService(Service service);
    void insertService(Service service);
}
