import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(name = "TH_ChuyenDoiTien", urlPatterns = "/doitien")
public class TH_ChuyenDoiTien extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        float rate = Float.parseFloat(request.getParameter("rate"));
        float usd = Float.parseFloat(request.getParameter("usd"));
        float vnd = rate*usd;
        request.setAttribute("result",vnd);
        RequestDispatcher requestDispatcher= request.getRequestDispatcher("doitienxong.jsp");
        requestDispatcher.forward(request,response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        RequestDispatcher requestDispatcher= request.getRequestDispatcher("doitien.jsp");
        requestDispatcher.forward(request,response);
    }
}
