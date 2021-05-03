package dao;

import model.*;
import ultils.ConnectDB;

import java.lang.reflect.Type;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GetTypeServiceDAOImpl implements GetTypeServiceDAO {
    private static final String SELECT_ALL_CUSTOMER_TYPE = "SELECT * FROM CUSTOMER_TYPE";
    private static final String SELECT_ALL_DIVISION_TYPE = "SELECT * FROM DIVISION";
    private static final String SELECT_ALL_POSITION = "SELECT * FROM POSITIONN";
    private static final String SELECT_ALL_RENT_TYPE = "SELECT * FROM RENT_TYPE";
    private static final String SELECT_ALL_EDUCATION_DEGREE_TYPE = "SELECT * FROM EDUCATION_DEGREE";
    private static final String SELECT_ALL_SERVICE_TYPE = "SELECT * FROM SERVICE_TYPE";
    private static final String SELECT_ALL_USERNAME = "SELECT * FROM USER";
    private static final String SELECT_ALL_EMPLOYEE = "SELECT * FROM EMPLOYEE";
    @Override
    public List<TypeCustomer> selectAllTypeCustomer() {
        List<TypeCustomer> list_typeCustomer = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet=null ;
        try{
            connection = ConnectDB.getConnection();
            statement = connection.prepareStatement(SELECT_ALL_CUSTOMER_TYPE);
            resultSet = statement.executeQuery();
            while(resultSet.next()){
                String typeCustomer_id = resultSet.getInt("Customer_type_id")+"";
                String typeCustomer_name = resultSet.getString("Customer_type_name")+"";
                list_typeCustomer.add(new TypeCustomer(typeCustomer_id,typeCustomer_name));
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
        return list_typeCustomer;
    }

    @Override
    public List<TypeRent> selectAllTypeRent() {
        List<TypeRent> listTypeRent = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet=null ;
        try{
            connection = ConnectDB.getConnection();
            statement = connection.prepareStatement(SELECT_ALL_RENT_TYPE);
            resultSet = statement.executeQuery();
            while(resultSet.next()){
                String typeRent_id = resultSet.getInt("rent_type_id")+"";
                String typeRent_name = resultSet.getString("rent_type_name")+"";
                listTypeRent.add(new TypeRent(typeRent_id,typeRent_name));
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
        return listTypeRent;
    }

    @Override
    public List<TypePosition> selectAllTypePosition() {
        List<TypePosition> listTypePosition = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet=null ;
        try{
            connection = ConnectDB.getConnection();
            statement = connection.prepareStatement(SELECT_ALL_POSITION);
            resultSet = statement.executeQuery();
            while(resultSet.next()){
                String typePosition_id = resultSet.getInt("position_id")+"";
                String typePosition_name = resultSet.getString("position_name")+"";
                listTypePosition.add(new TypePosition(typePosition_id,typePosition_name));
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
        return listTypePosition;
    }

    @Override
    public List<TypeEducationDegree> selectAllTypeEducationDegree() {
        List<TypeEducationDegree> listTypeEducationDegree = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet=null ;
        try{
            connection = ConnectDB.getConnection();
            statement = connection.prepareStatement(SELECT_ALL_EDUCATION_DEGREE_TYPE);
            resultSet = statement.executeQuery();
            while(resultSet.next()){
                String typeEducationDegree_id = resultSet.getInt("education_degree_id")+"";
                String typeEducationDegree_name = resultSet.getString("edcation_degree_name")+"";
                listTypeEducationDegree.add(new TypeEducationDegree(typeEducationDegree_id,typeEducationDegree_name));
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
        return listTypeEducationDegree;
    }

    @Override
    public List<TypeDivision> selectAllTypeDivision() {
        List<TypeDivision> listTypeDivision = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet=null ;
        try{
            connection = ConnectDB.getConnection();
            statement = connection.prepareStatement(SELECT_ALL_DIVISION_TYPE);
            resultSet = statement.executeQuery();
            while(resultSet.next()){
                String typeDivision_id = resultSet.getInt("division_id")+"";
                String typeDivision_name = resultSet.   getString("division_name")+"";
                listTypeDivision.add(new TypeDivision(typeDivision_id,typeDivision_name));
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
        return listTypeDivision;
    }

    @Override
    public List<TypeService> selectAllTypeService() {
        List<TypeService> listTypeService = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet=null ;
        try{
            connection = ConnectDB.getConnection();
            statement = connection.prepareStatement(SELECT_ALL_SERVICE_TYPE);
            resultSet = statement.executeQuery();
            while(resultSet.next()){
                String typeService_id = resultSet.getInt("service_type_id")+"";
                String typeSerivce_name = resultSet.getString("service_type_name")+"";
                listTypeService.add(new TypeService(typeService_id,typeSerivce_name));
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
        return listTypeService;
    }

    @Override
    public List<TypeUserName> selectALlTypeUserName() {
        List<TypeUserName> listTypeUserName = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet=null ;
        try{
            connection = ConnectDB.getConnection();
            statement = connection.prepareStatement(SELECT_ALL_USERNAME);
            resultSet = statement.executeQuery();
            while(resultSet.next()){
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                listTypeUserName.add(new TypeUserName(username,password));
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
        return listTypeUserName;
    }

}
