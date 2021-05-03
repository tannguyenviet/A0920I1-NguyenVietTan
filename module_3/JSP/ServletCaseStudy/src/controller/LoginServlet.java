package controller;

import model.TypeUserName;
import service.UserService;
import service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet",urlPatterns = "/")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "authen":
                System.out.println("Vao Login");
                authenticationUser(request, response);
                break;
            default:
                viewLoginList(request, response);
                break;
        }
    }

    private void authenticationUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("Username: " + username + " Password: " + password);
        UserService userService = new UserServiceImpl();
        TypeUserName typeUserName = userService.findTypeUserNameById(username);
        if (typeUserName == null) {
            System.out.println("sai pass word");
            request.getRequestDispatcher("/login/login.jsp").forward(request, response);
        }
        if (username.equals(typeUserName.getUsername()) && password.equals(typeUserName.getPassword())) {
            System.out.println("Dung password");
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            request.getRequestDispatcher("/").forward(request, response);
        } else {
            System.out.println("sai pass word");
            request.getRequestDispatcher("/login/login.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                break;
            case "view":
                viewLoginList(request, response);
                break;
            default:
                viewLoginList(request, response);
                break;
        }
    }

    private void viewLoginList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        if (session != null) {
            String username = (String) session.getAttribute("username");
            System.out.println("View - session :" +username);
            request.getRequestDispatcher("/").forward(request, response);
        }
        else{
            request.getRequestDispatcher("login/login.jsp").forward(request, response);

        }
    }
}
