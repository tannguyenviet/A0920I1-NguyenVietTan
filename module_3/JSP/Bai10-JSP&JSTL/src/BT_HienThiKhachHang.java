import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "BT_HienThiKhachHang",urlPatterns = "/khachhang")
public class BT_HienThiKhachHang extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        new Customer("MaiVanHoan","1983-08-20","Ha Noi","1.jpg"),
//                new Customer(" MaiVanHoan","1983-08-20","Ha Noi","1.jpg"),
//                new Customer("MaiVanHoan","1983-08-20","Ha Noi","1.jpg")
        ArrayList<Customer> listCustomer = new ArrayList<>();
        listCustomer.add(new Customer("MaiVanHoan","1983-08-20","Ha Noi","1.jpg"));
        listCustomer.add(new Customer("MaiVanHoan1","1983-08-20","Ha Noi","1.jpg"));
        listCustomer.add(new Customer("MaiVanHoan2","1983-08-20","Ha Noi","1.jpg"));
        listCustomer.add(new Customer("MaiVanHoan3","1983-08-20","Ha Noi","1.jpg"));
        request.setAttribute("listCustomer",listCustomer);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("khachhang.jsp");
        requestDispatcher.forward(request,response);

    }
}
