import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class AddBookServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String title = request.getParameter("title");
        String author = request.getParameter("author");
        double price = Double.parseDouble(request.getParameter("price"));

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/bookstore", "root", "root");

            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO books(title,author,price) VALUES(?,?,?)");

            ps.setString(1, title);
            ps.setString(2, author);
            ps.setDouble(3, price);

            ps.executeUpdate();

            response.getWriter().println("Book Added Successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}