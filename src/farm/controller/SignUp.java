package farm.controller;

import farm.entities.Users;
import farm.persistence.UserDao;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by scheffs on 5/6/2016.
 */

@WebServlet(name = "SignUp", urlPatterns = { "/signUp" } )


public class SignUp extends HttpServlet {

    private final Logger log = Logger.getLogger(this.getClass());

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Users user = new Users(0, req.getParameter("firstName"), req.getParameter("lastName"), req.getParameter("email"));
        log.debug("Adding User: " + user);
        UserDao dao = new UserDao();
        dao.addUser(user);
    }
}

