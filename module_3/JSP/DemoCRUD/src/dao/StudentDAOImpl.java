package dao;

import model.Student;
import ultils.ConnectDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl  implements StudentDAO{
    private static final String INSERT_STUDENT_SQL = "INSERT INTO STUDENT" + "  (id,name, age, address) VALUES " +
            " (? , ?, ?, ?);";

    private static final String SELECT_USER_BY_ID = "select id,name,age,address from STUDENT where id =?";
    private static final String SELECT_ALL_STUDENT = "select * from STUDENT";
    private static final String DELETE_STUDENT_SQL = "delete from STUDENT where id = ?;";
    private static final String UPDATE_STUDENT_SQL = "update STUDENT set name = ?,age= ?, address =? where id = ?;";
    @Override

    public List<Student> selectAllStudent() {
        Connection connection = null;
        PreparedStatement statement = null;
        List<Student> studentList = new ArrayList<>();
        try{
            connection = ConnectDB.getConnection();
             statement = connection.prepareStatement(SELECT_ALL_STUDENT);
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String country = resultSet.getString("address");
                studentList.add(new Student(id,name,age,country));
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
        return studentList;
    }

    @Override
    public Student selectStudentById(String id) {
        Connection connection = null;
        PreparedStatement statement = null;
        Student student = null;
        List<Student> studentList = new ArrayList<>();
        try{
            connection = ConnectDB.getConnection();
            statement = connection.prepareStatement(SELECT_USER_BY_ID);
            statement.setString(1,id);
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()) {
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String country = resultSet.getString("address");
                return new Student(id,name,age,country);
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
        return null;
    }

    @Override
    public void deleteStudent(String id) {
        Connection connection = null;
        PreparedStatement statement = null;
        Student student = null;
        List<Student> studentList = new ArrayList<>();
        try{
            connection = ConnectDB.getConnection();
            statement = connection.prepareStatement(DELETE_STUDENT_SQL);
            statement.setString(1,id);
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
    public void updateStudent(Student student) {
        Connection connection = null;
        PreparedStatement statement = null;
        List<Student> studentList = new ArrayList<>();
        try{
            connection = ConnectDB.getConnection();
            statement = connection.prepareStatement(UPDATE_STUDENT_SQL);
            statement.setString(4,student.getId());
            statement.setString(1,student.getName());
            statement.setInt(2,student.getAge());
            statement.setString(3,student.getAddress());
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
    public void insertStudent(Student student) {
        Connection connection = null;
        PreparedStatement statement = null;
        List<Student> studentList = new ArrayList<>();
        try{
            connection = ConnectDB.getConnection();
            statement = connection.prepareStatement(INSERT_STUDENT_SQL);
            statement.setString(1,student.getId());
            statement.setString(2,student.getName());
            statement.setInt(3,student.getAge());
            statement.setString(4,student.getAddress());
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
