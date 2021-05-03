package controller;

import model.Customer;
import model.TypeCustomer;
import service.CustomerServiceImpl;
import service.CustomerSevice;
import service.GetTypeService;
import service.GetTypeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet",urlPatterns = "/customer")
public class CustomerServlet extends javax.servlet.http.HttpServlet {

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "create":
               createNewCustomer(request,response);
                break;
            case "update":
                updateCustomer(request,response);
                break;
            case "insert":
        }
    }

    private void updateCustomer(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String id =request.getParameter("id");
        String type = request.getParameter("type_id");
        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        String gender = request.getParameter("gender");
        String id_card = request.getParameter("id_card");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        String email= request.getParameter("email");
        CustomerSevice customerSevice = new CustomerServiceImpl();
        customerSevice.UpdateCustomer(new Customer(id,type,name,birthday,gender,id_card,phone,address,email));
        request.setAttribute("listCustomer",customerSevice.findAll());
        request.getRequestDispatcher("/customer/view.jsp").forward(request,response);
    }

    private void createNewCustomer(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String id =request.getParameter("id");
        String type = request.getParameter("type_id");
        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        String gender = request.getParameter("gender");
        String id_card = request.getParameter("id_card");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        String email= request.getParameter("email");
        CustomerSevice customerSevice = new CustomerServiceImpl();
        customerSevice.CreateNewCustomer(new Customer(id,type,name,birthday,gender,id_card,phone,address,email));
        response.sendRedirect("/customer");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String action =request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "create":
                viewCreateCustomerForm(request,response);
                break;
            case "view":
                viewCustomerList(request,response);
                break;
            case "edit":
                viewEditForm(request,response);
                break;
            case "delete":
                deleteCustomer(request,response);
                break;
            default:
                viewCustomerList(request,response);
                break;
        }
    }

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String id =request.getParameter("id");
        CustomerSevice customerSevice = new CustomerServiceImpl();
        customerSevice.DeleteCustomer(id);
        request.setAttribute("listCustomer",customerSevice.findAll());
        request.getRequestDispatcher("/customer/view.jsp").forward(request,response);
    }

    private void viewEditForm(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String id =request.getParameter("id");
        CustomerSevice customerSevice = new CustomerServiceImpl();
        Customer customer = customerSevice.findCustomerById(id);

        request.setAttribute("customer",customer);
        request.getRequestDispatcher("/customer/edit.jsp").forward(request,response);
    }

    private void viewCreateCustomerForm(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        GetTypeService getTypeService = new GetTypeServiceImpl();
        List<TypeCustomer> typeCustomerList = getTypeService.findAllTypeCustomer();
        request.setAttribute("typeCustomerList",typeCustomerList);
        request.getRequestDispatcher("/customer/create.jsp").forward(request,response);
    }

    public void viewCustomerList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CustomerSevice customerSevice = new CustomerServiceImpl();
        request.setAttribute("listCustomer",customerSevice.findAll());
        request.getRequestDispatcher("/customer/view.jsp").forward(request,response);
    }
}
