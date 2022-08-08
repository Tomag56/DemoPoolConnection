package fr.eni.test;



import fr.eni.dal.ConnectionProvider;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/TesterPoolConnection")
public class TesterPoolConnection extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public TesterPoolConnection() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Tester la connexion à la base de données
        String message="";
        try {
            ConnectionProvider.getConnection();
            message = "connexion établie";
        } catch (SQLException e) {
            e.printStackTrace();
            message = e.getMessage();
        }
        response.getWriter().append("Test de connexion: ").append(message);
    }

}