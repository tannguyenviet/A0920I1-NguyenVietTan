package controller;

import dao.IUserDAO;
import dao.UserDAO;

import java.io.IOException;

public class UserViewServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        IUserDAO iUserDAO = new UserDAO();
        request.setAttribute("listUser",iUserDAO.selectAllUsers());
        request.getRequestDispatcher("user/view.jsp").forward(request,response);
    }
}
