package dao;

import model.Contract;
import model.CusHaveContract;
import ultils.ConnectDB;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ContractDAOImpl implements ContractDAO {
    private static final String INSERT_CONTRACT_SQL = "INSERT INTO contract VALUES (?, ?, ?, ?, ?, ?,? ,?)";

    private static final String SELECT_CONTRACT_BY_ID = "select * from CONTRACT where contract_id =?";
    private static final String SELECT_ALL_CONTRACT = "SELECT * FROM contract";
    private static final String SELECT_ALL_CUS_HAVE_CONTRACT = "select cus.customer_id,cus.customer_name,con.contract_id,con.contract_start_date,con.contract_end_date,con.contract_deposit,con.contract_total_money,con.service_id,con.employee_id from customer as cus inner join contract as con where cus.customer_id=con.customer_id;";
    private static final String DELETE_CONTRACT_SQL = "delete from CONTRACT where contract_id = ?;";
    private static final String UPDATE_CONTRACT_SQL = "update CONTRACT set contract_id = ?,contract_start_date= ?, contract_end_date =?,contract_deposit=?,contract_contract_total_money=?,employee_id=?,customer_id=?,service_id=?=? where contract_id = ?;";
    @Override
    public List<Contract> selectAllContract() {
        List<Contract> list_contract = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet=null ;
        try{
            connection = ConnectDB.getConnection();
            statement = connection.prepareStatement(SELECT_ALL_CONTRACT);
            resultSet = statement.executeQuery();
            while(resultSet.next()){
                String contract_id = resultSet.getInt("contract_id")+"";
                String contract_start_date = resultSet.getDate("contract_start_date").toString();
                String contract_end_date = resultSet.getDate("contract_end_date").toString();
                String contract_deposit = resultSet.getInt("contract_deposit")+"";
                String contract_total_money = resultSet.getInt("contract_total_money")+"";
                String employee_id = resultSet.getString("employee_id");
                String customer_id = resultSet.getString("customer_id");
                String service_id = resultSet.getString("service_id");
                list_contract.add(new Contract(contract_id,contract_start_date,contract_end_date,contract_deposit,contract_total_money,employee_id,customer_id,service_id));
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
        return list_contract;

    }

    @Override
    public Contract selectContractById(String id) {
        System.out.println("ID CONTRACTDAO"+id);
        Contract contract =null;
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet=null ;
        try{
            connection = ConnectDB.getConnection();
            statement = connection.prepareStatement(SELECT_CONTRACT_BY_ID);
            statement.setInt(1,Integer.parseInt(id));
            resultSet = statement.executeQuery();

            while(resultSet.next()){
                String contract_id = resultSet.getInt("contract_id")+"";
                String contract_start_date = resultSet.getDate("contract_start_date").toString();
                String contract_end_date = resultSet.getDate("contract_end_date").toString();
                String contract_deposit = resultSet.getInt("contract_deposit")+"";              String contract_total_money = resultSet.getInt("contract_total_money")+"";
                String employee_id = resultSet.getString("employee_id");
                String customer_id = resultSet.getString("customer_id");
                String service_id = resultSet.getString("service_id");
                contract= new Contract(contract_id,contract_start_date,contract_end_date,contract_deposit,contract_total_money,employee_id,customer_id,service_id);
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
        return contract;
    }

    @Override
    public void deleteContract(String id) {


        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet=null ;
        try{
            connection = ConnectDB.getConnection();
            statement = connection.prepareStatement(DELETE_CONTRACT_SQL);
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
    public void updateContract(Contract contract) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet=null ;
        try{
            connection = ConnectDB.getConnection();
            statement = connection.prepareStatement(UPDATE_CONTRACT_SQL);
            statement.setInt(1,Integer.parseInt(contract.getId()));
            statement.setDate(2,Date.valueOf(contract.getStart_date()));
            statement.setDate(3,Date.valueOf(contract.getEnd_date()));
            statement.setInt(4,Integer.parseInt(contract.getDeposit()));
            statement.setInt(5,Integer.parseInt(contract.getContract_total_money()));
            statement.setInt(6,Integer.parseInt(contract.getEmployee_id()));
            statement.setInt(7,Integer.parseInt(contract.getCustomer_id()));
            statement.setInt(8,Integer.parseInt(contract.getService_id()));
            statement.setInt(9,Integer.parseInt(contract.getId()));
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
    public void insertContract(Contract contract) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet=null ;
        try{
            connection = ConnectDB.getConnection();
            statement = connection.prepareStatement(INSERT_CONTRACT_SQL);
            statement.setInt(1,Integer.parseInt(contract.getId()));
            statement.setDate(2,Date.valueOf(contract.getStart_date()));
            statement.setDate(3,Date.valueOf(contract.getEnd_date()));
            statement.setInt(4,Integer.parseInt(contract.getDeposit()));
            statement.setInt(5,Integer.parseInt(contract.getContract_total_money()));
            statement.setInt(6,Integer.parseInt(contract.getEmployee_id()));
            statement.setInt(7,Integer.parseInt(contract.getCustomer_id()));
            statement.setInt(8,Integer.parseInt(contract.getService_id()));
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

    @Override
    public List<CusHaveContract> selectAllCusHaveContract() {
        List<CusHaveContract> list_cus_have_contract = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet=null ;
        try{
            connection = ConnectDB.getConnection();
            statement = connection.prepareStatement(SELECT_ALL_CUS_HAVE_CONTRACT);
            resultSet = statement.executeQuery();
            while(resultSet.next()){
                String customer_id = resultSet.getInt("customer_id")+"";
                String customer_name = resultSet.getString("customer_name");
                String contract_id = resultSet.getInt("contract_id")+"";
                String contract_start_date = resultSet.getDate("contract_start_date").toString();
                String contract_end_date = resultSet.getDate("contract_end_date").toString();
                String contract_deposit = resultSet.getInt("contract_deposit")+"";
                String contract_total_money = resultSet.getInt("contract_total_money")+"";

                String employee_id = resultSet.getString("employee_id");
                String service_id = resultSet.getString("service_id");
                list_cus_have_contract.add(new CusHaveContract(customer_id,customer_name,contract_id,contract_start_date,contract_end_date,contract_deposit,contract_total_money,service_id,employee_id));
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
        return list_cus_have_contract;
    }
}
