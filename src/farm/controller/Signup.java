package farm.controller;

import farm.entities.Users;
import farm.entities.UserRoles;
import farm.persistence.UserDao;
import farm.persistence.UserRoleDao;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

/**
 * Created by scheffs on 5/9/2016.
 */

@WebServlet (
        name = "signup",
        urlPatterns = { "/signup" }
)
public class Signup extends HttpServlet {

    /**
     * This method is called to do the processing to add a new user.
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String userName = request.getParameter("userName");
        String userPassword = request.getParameter("userPassword");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");

        /*if (userDao.getUserByUserName(userName) != null) {

            request.setAttribute("errorMessage", "You must have a unique username!");

            String url = "/signup.jsp";

            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
            dispatcher.forward(request, response);

        }*/

        Users users = new Users();

        users.setUserName(userName);
        users.setUserPassword(userPassword);
        users.setFirstName(firstName);
        users.setLastName(lastName);

        UserDao userDao = new UserDao();
        int userId = userDao.addUser(users);

        String url = "index.jsp";
        response.sendRedirect(url);
    }

}
