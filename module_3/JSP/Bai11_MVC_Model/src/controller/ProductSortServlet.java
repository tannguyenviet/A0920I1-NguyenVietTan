package controller;

import model.Product;
import service.ProductService;
import service.ProductServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductSortServlet",urlPatterns = "/sort")
public class ProductSortServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ProductService productService = new ProductServiceImpl();
        System.out.println(request.getParameter("option"));
        int option = Integer.parseInt(request.getParameter("option"));
        List<Product> listProduct = productService.sortOption(option);
        request.setAttribute("listProduct",listProduct);
        request.getRequestDispatcher("/view/view.jsp").forward(request,response);
    }
}
