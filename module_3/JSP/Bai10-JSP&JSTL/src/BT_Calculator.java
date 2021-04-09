import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "BT_Calculator",urlPatterns = "/calculator")
public class BT_Calculator extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float first= Float.parseFloat(request.getParameter("first-operand"));
        float sec= Float.parseFloat(request.getParameter("second-operand"));
        String operator=request.getParameter("operator");
        System.out.println(operator);
        request.setAttribute("first",first);
        request.setAttribute("sec",sec);
        request.setAttribute("operator",operator);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("calculatorDone.jsp");
        requestDispatcher.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("calculator.jsp");
        requestDispatcher.forward(request,response);
    }
}
