import farm.entities.Users;
import farm.persistence.UserDao;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by naivischeffert on 2/11/2016.
 */
public class UserDaoTest {

    @Test
    public void testAddUser() {
        UserDao userDao = new UserDao();

        Users users = new Users();
        users.setUserName("My Test");
        users.setUserPassword("Test Password");
        users.setFirstName("me");
        users.setLastName("meeeee");

        int userId = userDao.addUser(users);
        //Need to check for the next user in the table and change the number before running the test
        assertTrue(userId == 59);

    }

    @Test
    public void testDeleteUser() {
        UserDao userDao = new UserDao();

        Users users = new Users();
        users.setUserName("My Test");
        users.setUserPassword("Test Password");

        assertTrue(userDao.getUserByUserName("My Test") == null);
        //userDao.addUser(users);
        userDao.deleteUser(users);

    }

    /*@Test
    public void testGetUserByUsername() {
        UserDao userDao = new UserDao();

        Users users = new Users();
        users.setUserName("test");
        users.setUserPassword("test");

        userDao.addUser(users);

        //Users user1 = userDao.getUserByUserName("test");
        String userName = userDao.getUserByUserName(userName);
        assertTrue(userName == "test");
        //assertTrue(userDao.getUserByUserName("test") == null);

        //userDao.deleteUser(users);

    }*/
}

