package controller;

import dao.*;
import model.*;
import service.ContractService;
import service.ContractServiceImpl;
import service.GetTypeService;
import service.GetTypeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ContractServlet",urlPatterns = "/contract")
public class ContractServlet extends HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "create":
                createNewContract(request,response);
                break;
            case "update":
                updateContract(request,response);
                break;
            case "insert":
        }
    }

    private void updateContract(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String id =request.getParameter("id");
        String start_date = request.getParameter("start_date");
        String end_date = request.getParameter("end_date");
        String deposit = request.getParameter("deposit");

        String total_money = request.getParameter("total_money");
        String employee_id = request.getParameter("employee_id");
        String customer_id = request.getParameter("customer_id");
        String service_id= request.getParameter("service_id");

        ContractService contractSevice = new ContractServiceImpl();
        contractSevice.UpdateContract(new Contract(id,start_date,end_date,deposit,total_money,employee_id,customer_id,service_id));
        request.setAttribute("listContract",contractSevice.findAll());
        request.getRequestDispatcher("/contract/view.jsp").forward(request,response);
    }

    private void createNewContract(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String id =request.getParameter("id");
        String start_date = request.getParameter("start_date");
        String end_date = request.getParameter("end_date");
        String deposit = request.getParameter("deposit");

        String total_money = request.getParameter("total_money");
        String employee_id = request.getParameter("employee_id");
        String customer_id = request.getParameter("customer_id");
        String service_id= request.getParameter("service_id");

        ContractService contractSevice = new ContractServiceImpl();
        contractSevice.CreateNewContract(new Contract(id,start_date,end_date,deposit,total_money,employee_id,customer_id,service_id));
        response.sendRedirect("/contract");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        HttpSession session=request.getSession(false);
        if(session!=null){
            String username=(String)session.getAttribute("username");
            String action =request.getParameter("action");
            if(action == null){
                action = "";
            }
            switch (action){
                case "create":
                    viewCreateContractForm(request,response);
                    break;
                case "view":
                    viewContractList(request,response);
                    break;
                case "edit":
                    viewEditForm(request,response);
                    break;
                case "delete":
                    deleteContract(request,response);
                    break;
                case "cus-con":
                    viewCustomerHaveContractForm(request,response);
                    break;
                default:
                    viewContractList(request,response);
                    break;
            }
        }
        else{
            request.getRequestDispatcher("/login/login.jsp").include(request, response);
        }

    }

    private void deleteContract(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String id =request.getParameter("id");
        ContractService contractSevice = new ContractServiceImpl();
        contractSevice.DeleteContract(id);
        request.setAttribute("listContract",contractSevice.findAll());
        request.getRequestDispatcher("/contract/view.jsp").forward(request,response);
    }

    private void viewEditForm(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String id =request.getParameter("id");
        ContractService contractSevice = new ContractServiceImpl();
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        GetTypeService getTypeService = new GetTypeServiceImpl();
        Contract contract = contractSevice.findContractById(id);
        List<Employee> typePositionList = employeeDAO.selectAllEmployee();
        List<TypeEducationDegree> typeEducationDegreeList = getTypeService.findAllTypeEducationDegree();
        List<TypeUserName> typeUserNameList = getTypeService.findAllTypeUserName();
        List<TypeDivision> typeDivisionList = getTypeService.findAllTypeDivision();
        request.setAttribute("typePositionList",typePositionList);
        request.setAttribute("typeEducationDegreeList",typeEducationDegreeList);
        request.setAttribute("typeUserNameList",typeUserNameList);
        request.setAttribute("typeDivisionList",typeDivisionList);
        request.setAttribute("contract",contract);
        request.getRequestDispatcher("/contract/edit.jsp").forward(request,response);
    }

    private void viewCreateContractForm(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        GetTypeService getTypeService = new GetTypeServiceImpl();
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        CustomerDAO customerDAO = new CustomerDAOImpl();
        ServiceDAO serviceDAO = new ServiceDAOImpl();
        List<Employee> typeEmployeeList = employeeDAO.selectAllEmployee();
        List<Customer> typeCustomerList = customerDAO.selectAllCustomer() ;
        List<Service> typeServiceList = serviceDAO.selectAllService();
        request.setAttribute("typeEmployeeList",typeEmployeeList);
        request.setAttribute("typeCustomerList",typeCustomerList);
        request.setAttribute("typeServiceList",typeServiceList);
        request.getRequestDispatcher("/contract/create.jsp").forward(request,response);
    }

    private void viewCustomerHaveContractForm(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        ContractServiceImpl contractSevice = new ContractServiceImpl();
        request.setAttribute("listCusHaveContract",contractSevice.SelectAllCusHaveContract());
        request.getRequestDispatcher("/contract/viewCusHaveContract.jsp").forward(request,response);
    }

    public void viewContractList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ContractService contractSevice = new ContractServiceImpl();
        request.setAttribute("listContract",contractSevice.findAll());
        request.getRequestDispatcher("/contract/view.jsp").forward(request,response);
    }
}
