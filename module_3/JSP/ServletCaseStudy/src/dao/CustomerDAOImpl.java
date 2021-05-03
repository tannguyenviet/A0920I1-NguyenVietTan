package dao;

import model.Customer;
import ultils.ConnectDB;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAOImpl implements CustomerDAO {
    private static final String INSERT_CUSTOMER_SQL = "INSERT INTO customer VALUES (?, ?, ?, ?, ?, ?,? , ?, ?)";

    private static final String SELECT_USER_BY_ID = "select * from CUSTOMER where customer_id =?";
    private static final String SELECT_ALL_CUSTOMER = "SELECT * FROM customer";
    private static final String DELETE_CUSTOMER_SQL = "delete from CUSTOMER where customer_id = ?;";
    private static final String UPDATE_CUSTOMER_SQL = "update CUSTOMER set customer_id = ?,customer_type_id= ?, customer_name =?,customer_birthday=?,customer_gender=?,customer_id_card=?,customer_phone=?,customer_email=?,customer_address=? where customer_id = ?;";
    @Override
    public List<Customer> selectAllCustomer() {
        List<Customer> list_customer = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet=null ;
        try{
             connection = ConnectDB.getConnection();
             statement = connection.prepareStatement(SELECT_ALL_CUSTOMER);
             resultSet = statement.executeQuery();
             while(resultSet.next()){
                 String id = resultSet.getInt("customer_id")+"";
                 String type_id = resultSet.getInt("customer_type_id")+"";
                 String name = resultSet.getString("customer_name");
                 String birthday = resultSet.getDate("customer_birthday").toString();
                 String customer_gender = resultSet.getInt("customer_gender")+"";
                 String customer_id_card = resultSet.getString("customer_id_card");
                 String phone = resultSet.getString("customer_phone");
                 String email = resultSet.getString("customer_email");
                 String address = resultSet.getString("customer_address");
                 list_customer.add(new Customer(id,type_id,name,birthday,customer_gender,customer_id_card,phone,email,address));
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
        return list_customer;

    }

    @Override
    public Customer selectCustomerById(String id) {
        System.out.println("ID CUSTOMERDAO"+id);
        Customer customer =null;
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet=null ;
        try{
            connection = ConnectDB.getConnection();
            statement = connection.prepareStatement(SELECT_USER_BY_ID);
            statement.setInt(1,Integer.parseInt(id));
            resultSet = statement.executeQuery();

            while(resultSet.next()){
                String type_id = resultSet.getInt("customer_type_id")+"";
                String name = resultSet.getString("customer_name");
                String birthday = resultSet.getDate("customer_birthday").toString();
                String customer_gender = resultSet.getInt("customer_gender")+"";
                String customer_id_card = resultSet.getString("customer_id_card");
                String phone = resultSet.getString("customer_phone");
                String email = resultSet.getString("customer_email");
                String address = resultSet.getString("customer_address");
                customer= new Customer(id,type_id,name,birthday,customer_gender,customer_id_card,phone,email,address);
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
        return customer;
    }

    @Override
    public void deleteCustomer(String id) {


        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet=null ;
        try{
            connection = ConnectDB.getConnection();
            statement = connection.prepareStatement(DELETE_CUSTOMER_SQL);
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
    public void updateCustomer(Customer customer) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet=null ;
        try{
            connection = ConnectDB.getConnection();
            statement = connection.prepareStatement(UPDATE_CUSTOMER_SQL);
            statement.setInt(1,Integer.parseInt(customer.getId()));
            statement.setInt(1,Integer.parseInt(customer.getId()));
            statement.setInt(2,Integer.parseInt(customer.getType_id()));
            statement.setString(3,customer.getName());

            statement.setDate(4,Date.valueOf(customer.getBirthday()));
            statement.setInt(5,Integer.parseInt(customer.getGender()));
            statement.setString(6,customer.getId_card());
            statement.setString(7,customer.getPhone());
            statement.setString(8,customer.getEmail());

            statement.setString(9,customer.getAddress());
            statement.setString(10,customer.getId());
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
    public void insertCustomer(Customer customer) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet=null ;
        try{
            connection = ConnectDB.getConnection();
            statement = connection.prepareStatement(INSERT_CUSTOMER_SQL);
            statement.setInt(1,Integer.parseInt(customer.getId()));
            statement.setInt(2,Integer.parseInt(customer.getType_id()));
            statement.setString(3,customer.getName());

            statement.setDate(4,Date.valueOf(customer.getBirthday()));
            statement.setInt(5,Integer.parseInt(customer.getGender()));
            statement.setString(6,customer.getId_card());
            statement.setString(7,customer.getPhone());
            statement.setString(8,customer.getEmail());
            statement.setString(9,customer.getAddress());
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
