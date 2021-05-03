package controller;

import model.Service;
import model.TypeCustomer;
import model.TypeRent;
import model.TypeService;
import service.GetTypeService;
import service.GetTypeServiceImpl;
import service.ServiceServiceImpl;
import service.ServiceService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ServiceServlet",urlPatterns = "/service")
public class ServiceServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action){
            case "create":
                createNewService(request,response);
                break;
            case "update":
//                updateService(request,response);
                break;
            case "insert":
        }
    }
    private void createNewService(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String id =request.getParameter("id");
        String name = request.getParameter("name");
        String area = request.getParameter("area");
        String service_cost = request.getParameter("service_cost");
        String service_max_people = request.getParameter("service_max_people");
        String rent_type_id = request.getParameter("rent_type_id");
        String service_type_id = request.getParameter("service_type_id");
        String standard_room = request.getParameter("standard_room");
        String description_other_convenience= request.getParameter("description_other_convenience");
        String pool_area = request.getParameter("pool_area");
        String number_of_floors = request.getParameter("number_of_floors");
        ServiceService serviceService = new ServiceServiceImpl();
        serviceService.CreateNewService(new Service(id,name,area,service_cost,service_max_people,rent_type_id,service_type_id,standard_room,description_other_convenience,pool_area,number_of_floors));
        response.sendRedirect("/service");
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action =request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "create":
                viewCreateServiceForm(request,response);
                break;
            case "view":
                viewServiceList(request,response);
                break;
            case "edit":
//                viewEditForm(request,response);
                break;
            case "delete":
//                deleteService(request,response);
                break;
            default:
                viewServiceList(request,response);
                break;
        }
    }
    public void viewServiceList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServiceService serviceSevice = new ServiceServiceImpl();
        request.setAttribute("listService",serviceSevice.findAll());
        request.getRequestDispatcher("/service/view.jsp").forward(request,response);
    }
    private void viewCreateServiceForm(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        GetTypeService getTypeService = new GetTypeServiceImpl();
        List<TypeRent> typeRentList = getTypeService.findAllTypeRent();
        List<TypeService> typeServiceList = getTypeService.findAllTypeService();
        request.setAttribute("typeRentList",typeRentList);
        request.setAttribute("typeServiceList",typeServiceList);
        request.getRequestDispatcher("/service/create.jsp").forward(request,response);
    }
}
