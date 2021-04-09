package controller;

import model.Product;
import service.ProductService;
import service.ProductServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ProductViewServlet",urlPatterns = "/view")
public class ProductViewServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        ProductService productService = new ProductServiceImpl();
        List<Product> listProduct = productService.getAllProduct();
        request.setAttribute("listProduct",listProduct);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/view.jsp");
        requestDispatcher.forward(request,response);
    }
}
