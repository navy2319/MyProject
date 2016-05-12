package farm.controller;

import farm.entities.Members;;
import farm.persistence.MembersDao;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by scheffs on 5/12/2016.
 */
@WebServlet(
        name = "contact",
        urlPatterns = {"/contact"}
)
public class Contact extends HttpServlet{
    private final Logger log = Logger.getLogger(this.getClass());

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

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String message = request.getParameter("message");

        Members members = new Members();

        members.setFirstName(firstName);
        members.setLastName(lastName);
        members.setEmail(email);
        members.setMessage(message);

        MembersDao membersDao = new MembersDao();
        int memberId = membersDao.addMembers(members);

        String url = "index.jsp";
        response.sendRedirect(url);
    }
}
