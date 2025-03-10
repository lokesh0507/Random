package servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import util.DBUtil;

@WebServlet("/search-quote")
public class SearchQuoteServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String author = request.getParameter("author");
        String query = "SELECT quote, author FROM quotes WHERE author LIKE ?";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, "%" + author + "%");
            ResultSet rs = stmt.executeQuery();
            StringBuilder result = new StringBuilder();
            while (rs.next()) {
                result.append(rs.getString("quote")).append(" - ").append(rs.getString("author")).append("<br>");
            }
            response.getWriter().write(result.toString());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}