package dao;

import model.Customer;
import ultils.ConnectDB;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAOImpl implements CustomerDAO {
    private static final String INSERT_CUSTOMER_SQL = "INSERT INTO CUSTOMER" + "  (customer_id,name, age, address) VALUES " +
            " (? , ?, ?, ?);";

    private static final String SELECT_USER_BY_ID = "select id,name,age,address from CUSTOMER where id =?";
    private static final String SELECT_ALL_CUSTOMER = "select * from CUSTOMER";
    private static final String DELETE_CUSTOMER_SQL = "delete from CUSTOMER where id = ?;";
    private static final String UPDATE_CUSTOMER_SQL = "update CUSTOMER set name = ?,age= ?, address =? where id = ?;";
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
    public Customer selectCustomerById() {
        return null;
    }

    @Override
    public void deleteCustomer(String id) {

    }

    @Override
    public void updateCustomer(Customer customer) {

    }

    @Override
    public void insertCustomer(Customer customer) {

    }
}
