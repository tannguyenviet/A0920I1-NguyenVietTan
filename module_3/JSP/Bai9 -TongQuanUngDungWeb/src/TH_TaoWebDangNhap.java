import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(name = "ServerTimeServlet", urlPatterns = "/index")
public class TH_TaoWebDangNhap extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        PrintWriter writer = response.getWriter();
        writer.println("<html>");

        if("admin".equals(username) && "admin".equals(password)) {
            writer.println("<h1>Welcome "+username+" to website</h1>");
        } else{
            writer.println("<h1>Login Error</h1>");
        }

        writer.println("</html>");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
        requestDispatcher.forward(request, response);
    }
}
