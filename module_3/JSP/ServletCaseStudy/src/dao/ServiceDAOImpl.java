package dao;

import model.Service;
import ultils.ConnectDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ServiceDAOImpl implements ServiceDAO {
    private static final String INSERT_SERVICE_SQL = "INSERT INTO service VALUES (?, ?, ?, ?, ?, ?,? , ?, ?,?,?)";

    private static final String SELECT_USER_BY_ID = "select * from SERVICE where service_id =?";
    private static final String SELECT_ALL_SERVICE = "SELECT * FROM service";
    private static final String DELETE_SERVICE_SQL = "delete from SERVICE where service_id = ?;";
    private static final String UPDATE_SERVICE_SQL = "update SERVICE set service_id = ?,service_name= ?,service_area=? service_cost =?,service_max_people=?,rent_type_id=?,service_type_id=?,standard_room=?,description_other_convenience=?,pool_area=?,number_of_floors=? where service_id = ?;";
    @Override
    public List<Service> selectAllService() {
        List<Service> list_service = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet=null ;
        try{
            connection = ConnectDB.getConnection();
            statement = connection.prepareStatement(SELECT_ALL_SERVICE);
            resultSet = statement.executeQuery();
            while(resultSet.next()){
                String service_id = resultSet.getInt("service_id")+"";
                String service_name = resultSet.getString("service_name")+"";
                String service_area = resultSet.getInt("service_area")+"";
                String service_cost = resultSet.getDouble("service_cost")+"";
                String service_max_people = resultSet.getInt("service_max_people")+"";
                String rent_type_id = resultSet.getInt("rent_type_id")+"";
                String service_type_id = resultSet.getInt("service_type_id")+"";
                String standard_room = resultSet.getString("standard_room");
                String description_other_convenience = resultSet.getString("description_other_convenience");
                String pool_area = resultSet.getDouble("pool_area")+"";
                String number_of_floors = resultSet.getInt("number_of_floors")+"";

                list_service.add(new Service(service_id,service_name,service_area,service_cost,service_max_people,rent_type_id,service_type_id,standard_room,description_other_convenience,pool_area,number_of_floors));
            }
        }

        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                if(connection!=null){
                    connection.close();
                }
                if(statement!=null){
                    statement.close();
                }
            }
            catch (SQLException e){
                e.printStackTrace();
            }

        }
        return list_service;

    }

    @Override
    public Service selectServiceById(String id) {
        System.out.println("ID SERVICEDAO"+id);
        Service service =null;
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet=null ;
        try{
            connection = ConnectDB.getConnection();
            statement = connection.prepareStatement(SELECT_USER_BY_ID);
            statement.setInt(1,Integer.parseInt(id));
            resultSet = statement.executeQuery();

            while(resultSet.next()){
                String service_id = resultSet.getInt("service_id")+"";
                String service_name = resultSet.getString("service_name")+"";
                String service_area = resultSet.getInt("service_area")+"";
                String service_cost = resultSet.getDouble("service_cost")+"";
                String service_max_people = resultSet.getInt("service_max_people")+"";
                String rent_type_id = resultSet.getInt("rent_type_id")+"";
                String service_type_id = resultSet.getInt("service_type_id")+"";
                String standard_room = resultSet.getString("standard_room");
                String description_other_convenience = resultSet.getString("description_other_convenience");
                String pool_area = resultSet.getDouble("pool_area")+"";
                String number_of_floors = resultSet.getInt("number_of_floors")+"";
                service= new Service(service_id,service_name,service_area,service_cost,service_max_people,rent_type_id,service_type_id,standard_room,description_other_convenience,pool_area,number_of_floors);
            }

        }

        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                if(connection!=null){
                    connection.close();
                }
                if(statement!=null){
                    statement.close();
                }
            }
            catch (SQLException e){
                e.printStackTrace();
            }

        }
        return service;
    }

    @Override
    public void deleteService(String id) {


        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet=null ;
        try{
            connection = ConnectDB.getConnection();
            statement = connection.prepareStatement(DELETE_SERVICE_SQL);
            statement.setInt(1,Integer.parseInt(id));
            statement.executeUpdate();
        }

        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                if(connection!=null){
                    connection.close();
                }
                if(statement!=null){
                    statement.close();
                }
            }
            catch (SQLException e){
                e.printStackTrace();
            }

        }
    }

    @Override
    public void updateService(Service service) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet=null ;
        try{
            connection = ConnectDB.getConnection();
            statement = connection.prepareStatement(UPDATE_SERVICE_SQL);
            statement.setInt(1,Integer.parseInt(service.getId()));
            statement.setString(2,service.getName());
            statement.setDouble(3,Double.parseDouble(service.getId()));
            statement.setInt(4,Integer.parseInt(service.getService_cost()));
            statement.setInt(5,Integer.parseInt(service.getService_max_people()));
            statement.setInt(6,Integer.parseInt(service.getRent_type_id()));
            statement.setInt(7,Integer.parseInt(service.getService_type_id()));
            statement.setString(8,service.getStandard_room());
            statement.setString(9,service.getDescription_other_convenience());
            statement.setDouble(10,Double.parseDouble(service.getPool_area()));
            statement.setString(11,service.getNumber_of_floors());
            statement.setInt(12,Integer.parseInt(service.getId()));
            System.out.println(statement);
            statement.executeUpdate();


        }

        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                if(connection!=null){
                    connection.close();
                }
                if(statement!=null){
                    statement.close();
                }
            }
            catch (SQLException e){
                e.printStackTrace();
            }

        }
    }

    @Override
    public void insertService(Service service) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet=null ;
        try{
            connection = ConnectDB.getConnection();
            statement = connection.prepareStatement(INSERT_SERVICE_SQL);
            statement.setInt(1,Integer.parseInt(service.getId()));
            statement.setString(2,service.getName());
            statement.setDouble(3,Double.parseDouble(service.getId()));
            statement.setInt(4,Integer.parseInt(service.getService_cost()));
            statement.setInt(5,Integer.parseInt(service.getService_max_people()));
            statement.setInt(6,Integer.parseInt(service.getRent_type_id()));
            statement.setInt(7,Integer.parseInt(service.getService_type_id()));
            statement.setString(8,service.getStandard_room());
            statement.setString(9,service.getDescription_other_convenience());
            statement.setDouble(10,Double.parseDouble(service.getPool_area()));
            statement.setString(11,service.getNumber_of_floors());
            System.out.println(statement.toString());
            statement.executeUpdate();

        }

        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                if(connection!=null){
                    connection.close();
                }
                if(statement!=null){
                    statement.close();
                }
            }
            catch (SQLException e){
                e.printStackTrace();
            }

        }
    }
}
