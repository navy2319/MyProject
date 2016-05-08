package farm.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import farm.persistence.UserDao;
import farm.entities.Users;

/**
 * Created by scheffs on 5/7/2016.
 */

/**
 * Log in servlet.
 */
@WebServlet(name = "LogIn", urlPatterns = { "/logIn" } )
public class LogIn extends HttpServlet {

    private final Logger log = Logger.getLogger(this.getClass());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //if user is already logged in, send to index, if user is not logged in, send to log in jsp.
        if (req.getUserPrincipal() != null) {
            RequestDispatcher dispatcher = req.getRequestDispatcher("/index" + ".jsp");
            dispatcher.forward(req, resp);
        } else {
            RequestDispatcher dispatcher = req.getRequestDispatcher("/signIn" + ".jsp");
            dispatcher.forward(req, resp);
        }
    }

}

