package farm.persistence;

import farm.entities.Users;
import org.apache.log4j.Logger;
import org.junit.Test;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Conno on 2/11/2016.
 */
public class UserDaoTest {

    private final Logger log = Logger.getLogger(this.getClass());

    @Test
    public void testGetAllUsers() {
        UserDao test = new UserDao();
        List<Users> users = test.getAllUsers();
        assertTrue(users.size() > 0);
    }

    @Test
    public void testAddUser() {
        UserDao test = new UserDao();
        Users user = new Users();
        user.setEmail("java@java.com");
        user.setFirstName("Naivi");
        user.setLastName("Scheffert");
        int integer = test.addUser(user);
        assertTrue(integer > 0);
        test.deleteUser(user);
    }
}

