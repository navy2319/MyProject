package farm.persistence;

import farm.entities.Users;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Conno on 2/11/2016.
 */
public class UserDaoTest {

    UserDao userDao = new UserDao();

    @Test
    public void testAddUser() {

        Users users = new Users();
        users.setUserName("My Test");
        users.setUserPassword("Test Password");

        userDao.addUser(users);

        Users selectedUser = userDao.getUserByUserName("My Test Person");

        assertTrue(selectedUser.getUserName() == users.getUserName());
        assertTrue(selectedUser.getUserPassword() == users.getUserPassword());

        userDao.deleteUser(users);

    }

    @Test(expected = java.lang.IndexOutOfBoundsException.class)
    public void testDeleteUser() {

        Users users = new Users();
        users.setUserName("test t");
        users.setUserPassword("test tt");

        userDao.addUser(users);
        userDao.deleteUser(users);

        Users user1 = userDao.getUserByUserName("test");

    }

    @Test
    public void testGetUserByUsername() {
        Users users = new Users();
        users.setUserName("test");
        users.setUserPassword("test");

        userDao.addUser(users);

        Users user1 = userDao.getUserByUserName("test");

        assertTrue(user1.getUserName() == users.getUserName());

        userDao.deleteUser(users);

    }
}

