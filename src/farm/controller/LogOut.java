package farm.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import org.apache.log4j.Logger;

/**
 * Created by scheffs on 5/7/2016.
 */

/**
 * Logs out a user, sends to index
 */
@WebServlet(name = "LogOut", urlPatterns = { "/logOut" } )
public class LogOut extends HttpServlet {

    private final Logger log = Logger.getLogger(this.getClass());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.logout();
        resp.sendRedirect("/");
    }

}
