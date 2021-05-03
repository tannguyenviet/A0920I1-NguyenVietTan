package dao;

import model.Contract;
import model.TypeUserName;
import ultils.ConnectDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LoginDAOImpl implements LoginDAO {
    private static final String INSERT_USER_SQL = "INSERT INTO user VALUES (?, ?)";
    private static final String SELECT_USER_BY_ID = "select * from USER where username=?";
    private static final String SELECT_ALL_USER = "SELECT * FROM user";
    private static final String DELETE_USER_SQL = "delete from USER where username = ?;";
    private static final String UPDATE_USER_SQL = "update USER set username = ?,password = ?;";
    @Override
    public List<TypeUserName> selectAllTypeUserName() {
        List<TypeUserName> list_user = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet=null ;
        try{
            connection = ConnectDB.getConnection();
            statement = connection.prepareStatement(SELECT_ALL_USER);
            resultSet = statement.executeQuery();
            while(resultSet.next()){
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                list_user.add(new TypeUserName(username,password));
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
        return list_user;

    }

    @Override
    public TypeUserName selectTypeUserNameById(String id) {
        System.out.println("ID USERDAO"+id);
        TypeUserName user =null;
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet=null ;
        try{
            connection = ConnectDB.getConnection();
            statement = connection.prepareStatement(SELECT_USER_BY_ID);
            statement.setString(1,id);
            System.out.println(statement);
            resultSet = statement.executeQuery();

            while(resultSet.next()){
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                user= new TypeUserName(username,password);
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
        return user;
    }
    @Override
    public void deleteTypeUserName(String username) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet=null ;
        try{
            connection = ConnectDB.getConnection();
            statement = connection.prepareStatement(DELETE_USER_SQL);
            statement.setInt(1,Integer.parseInt(username));
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
    public void updateTypeUserName(TypeUserName user) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet=null ;
        try{
            connection = ConnectDB.getConnection();
            statement = connection.prepareStatement(UPDATE_USER_SQL);
            statement.setString(1,(user.getUsername()));
            statement.setString(2,user.getPassword());

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
    public void insertTypeUserName(TypeUserName user) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet=null ;
        try{
            connection = ConnectDB.getConnection();
            statement = connection.prepareStatement(INSERT_USER_SQL);
            statement.setString(1,(user.getUsername()));
            statement.setString(2,user.getPassword());

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
